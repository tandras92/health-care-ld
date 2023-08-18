package tandras.healthld.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.soabase.recordbuilder.core.RecordBuilderFull;

import java.util.List;

@RecordBuilderFull
public record HospitalRepositoryMetadata(
        @JsonProperty("query_execution_status") String queryExecutionStatus,
        @JsonProperty("query_execution_message") String queryExecutionMessage,
        @JsonProperty("repository_owner") String repositoryOwner,
        @JsonProperty("repository_name") String repositoryName,
        @JsonProperty("commit_ref") String commitRef,
        @JsonProperty("sql_query") String sqlQuery,
        List<SchemaDto> schema,
        @JsonProperty("hospitals") @JsonAlias("rows") List<HospitalDto> hospitals
) {
}
