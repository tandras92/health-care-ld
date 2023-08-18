package tandras.healthld.client;

import tandras.healthld.dto.HospitalRepositoryMetadata;
import tandras.healthld.service.PriceTransparencyService;
import tandras.healthld.util.UrlUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class PriceTransparencyClient {

    private final WebClient webClient;

    private final PriceTransparencyService priceTransparencyService;

    public Mono<HospitalRepositoryMetadata> getHospitals(String query) {

        String encodedSqlQuery = priceTransparencyService.processQuery(query);
        return webClient.get()
                .uri(UrlUtil.decodeUrl("/transparency-in-pricing/main?q=" + encodedSqlQuery))
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(HospitalRepositoryMetadata.class);
    }
}
