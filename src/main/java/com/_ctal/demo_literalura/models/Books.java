package com._ctal.demo_literalura.models;
import jakarta.persistence.*;

import java.util.List;
import java.util.OptionalDouble;
@Entity
@Table(name = "books")
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(unique = true)
    private String title;
    private Integer totalTemporadas;
    private Double evaluacion;
    private String poster;
    @Enumerated(EnumType.STRING)
    private Categoria genero;
    private String actores;
    private String sinopsis;
    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Authors> authors;

    public Books(){}

    public Books(DataBooks dataBooks){
        this.title = dataBooks.titulo();
        this.totalTemporadas = dataBooks.totalTemporadas();
        this.evaluacion = OptionalDouble.of(Double.valueOf(dataBooks.evaluacion())).orElse(0);
        this.poster = dataBooks.poster();
        this.genero = Categoria.fromString(dataBooks.genero().split(",")[0].trim());
        this.actores = dataBooks.actores();
        this.sinopsis = dataBooks.sinopsis();
    }

    @Override
    public String toString() {
        return  "genero=" + genero +
                "titulo='" + title + '\'' +
                ", totalTemporadas=" + totalTemporadas +
                ", evaluacion=" + evaluacion +
                ", poster='" + poster + '\'' +
                ", actores='" + actores + '\'' +
                ", sinopsis='" + sinopsis + '\'' +
                ", episodios='" + authors + '\'';

    }

}
