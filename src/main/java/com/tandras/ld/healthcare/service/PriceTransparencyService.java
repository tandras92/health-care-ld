package com.tandras.ld.healthcare.service;

import com.tandras.ld.healthcare.util.UrlUtil;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PriceTransparencyService {

    private static final String DEFAULT_QUERY =
            """
            SELECT *
            FROM `hospital`
            ORDER BY `id` ASC
            LIMIT 200""";

    public String processQuery(String query) {
        return Optional.ofNullable(query)
                .map(UrlUtil::encodeUrl)
                .orElse(UrlUtil.encodeUrl(DEFAULT_QUERY));
    }
}
