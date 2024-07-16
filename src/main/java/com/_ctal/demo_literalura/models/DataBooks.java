package com._ctal.demo_literalura.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DataBooks(
        @JsonAlias("id") Long id,
        @JsonAlias("title") String title,
        @JsonAlias("authors") List<Authors> authors,
        @JsonAlias("languages") List<Languages> languages
) {
}
