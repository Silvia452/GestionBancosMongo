package io.bootify.gestion_bancos_mongo.repos;

import io.bootify.gestion_bancos_mongo.domain.Bibliotecario;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface BibliotecarioRepository extends MongoRepository<Bibliotecario, Long> {
}
