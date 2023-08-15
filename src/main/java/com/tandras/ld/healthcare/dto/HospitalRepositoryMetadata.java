package com.tandras.ld.healthcare.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public record HospitalRepositoryMetadata(
        @JsonProperty("query_execution_status") String queryExecutionStatus,
        @JsonProperty("query_execution_message") String queryExecutionMessage,
        @JsonProperty("repository_owner") String repositoryOwner,
        @JsonProperty("repository_name") String repositoryName,
        @JsonProperty("commit_ref") String commitRef,
        @JsonProperty("sql_query") String sqlQuery,
        List<SchemaDto> schema,
        @JsonProperty("rows") List<HospitalDto> hospitalDtos
) {
}
