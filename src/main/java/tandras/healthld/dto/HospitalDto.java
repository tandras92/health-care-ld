package tandras.healthld.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.soabase.recordbuilder.core.RecordBuilderFull;
import java.time.LocalDate;

@RecordBuilderFull
public record HospitalDto(
        String id,
        String ein,
        String name,
        @JsonProperty("alt_name") String altName,
        @JsonProperty("system_name") String systemName,
        @JsonProperty("addr") String address,
        String city,
        String state,
        String zip,
        String phone,
        @JsonProperty("urban_rural") String urbanRural,
        String category,
        @JsonProperty("control_type") String controlType,
        @JsonProperty("medicare_termination_status") String medicareTerminationStatus,
        @JsonProperty("last_updated") LocalDate lastUpdated,
        @JsonProperty("file_name") String fileName,
        @JsonProperty("mrf_url") String mrfUrl,
        String permalink,
        @JsonProperty("transparency_page") String transparencyPage,
        @JsonProperty("additional_notes") String additionalNotes
) {
}
