package com._ctal.demo_literalura.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public record DataAutor(
        @JsonAlias("id") Long id,
        @JsonAlias("name") String name,
        @JsonAlias("birth_year") String birth,
        @JsonAlias("death_year") String death
) {


}
