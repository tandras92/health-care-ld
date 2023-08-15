package com.tandras.ld.healthcare.client;

import com.tandras.ld.healthcare.dto.HospitalRepositoryMetadata;
import com.tandras.ld.healthcare.util.UrlUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PriceTransparencyClient {

    private final WebClient webClient;
    private static final String DEFAULT_QUERY =
            """
            SELECT *
            FROM `hospital`
            ORDER BY `id` ASC
            LIMIT 200""";

    public Mono<HospitalRepositoryMetadata> getHospitals(String query) {
        Optional<String> optionalQuery = Optional.ofNullable(query);
        String encodedSqlQuery;
        if (optionalQuery.isPresent()) {
            encodedSqlQuery = UrlUtil.encodeUrl(optionalQuery.get());
        } else {
            encodedSqlQuery = UrlUtil.encodeUrl(DEFAULT_QUERY);
        }

        return webClient.get()
                .uri(UrlUtil.decodeUrl("https://www.dolthub.com/api/v1alpha1/dolthub/transparency-in-pricing/main?q=" + encodedSqlQuery))
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(HospitalRepositoryMetadata.class);
    }
}
