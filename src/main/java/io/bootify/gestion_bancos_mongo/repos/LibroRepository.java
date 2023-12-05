package io.bootify.gestion_bancos_mongo.repos;

import io.bootify.gestion_bancos_mongo.domain.Libro;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface LibroRepository extends MongoRepository<Libro, Long> {
}
