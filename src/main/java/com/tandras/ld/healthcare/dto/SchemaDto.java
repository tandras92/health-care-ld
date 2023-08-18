package com.tandras.ld.healthcare.dto;

import io.soabase.recordbuilder.core.RecordBuilderFull;

@RecordBuilderFull
public record SchemaDto(
        String columnName,
        String columnType
) {
}
