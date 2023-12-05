package io.bootify.gestion_bancos_mongo.domain;

import io.bootify.gestion_bancos_mongo.model.Estado;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;


@Document("libroes")
@Getter
@Setter
public class Libro extends Biblioteca {

    @NotNull
    @Size(max = 255)
    private String titulo;

    @NotNull
    @Size(max = 255)
    private String autor;

    @NotNull
    private Estado estado;

}
