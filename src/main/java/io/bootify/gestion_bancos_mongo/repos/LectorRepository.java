package io.bootify.gestion_bancos_mongo.repos;

import io.bootify.gestion_bancos_mongo.domain.Lector;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface LectorRepository extends MongoRepository<Lector, Long> {
}
