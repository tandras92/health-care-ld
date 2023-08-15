package com.tandras.ld.healthcare.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.time.LocalDate;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public record HospitalDto(
        String id,
        String ein,
        String name,
        String altName,
        String systemName,
        String address,
        String city,
        String state,
        String zip,
        String phoneNumber,
        String urbanRural,
        String category,
        String controlType,
        String medicareTerminationStatus,
        LocalDate lastUpdated,
        String fileName,
        String mrfUrl,
        String permalink,
        String transparencyPage,
        String additionalNotes
) {
}
