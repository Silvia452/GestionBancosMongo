package io.bootify.gestion_bancos_mongo.repos;

import io.bootify.gestion_bancos_mongo.domain.Prestamo;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface PrestamoRepository extends MongoRepository<Prestamo, Long> {
}
