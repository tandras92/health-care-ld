package com.tandras.ld.healthcare.controller;

import com.tandras.ld.healthcare.client.PriceTransparencyClient;
import com.tandras.ld.healthcare.dto.HospitalRepositoryMetadata;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1/transparency-pricing")
@RequiredArgsConstructor
public class PriceTransparencyController {

    private final PriceTransparencyClient priceTransparencyClient;

    @GetMapping(value = "/hospitals", produces = {"application/json"})
    Mono<HospitalRepositoryMetadata> getHospitals(@RequestParam(name = "q", required = false) String sql) {
        return priceTransparencyClient.getHospitals(sql);
    }
}
