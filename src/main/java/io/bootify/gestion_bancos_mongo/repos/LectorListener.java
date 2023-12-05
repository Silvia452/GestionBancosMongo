package io.bootify.gestion_bancos_mongo.repos;

import io.bootify.gestion_bancos_mongo.domain.Lector;
import io.bootify.gestion_bancos_mongo.service.PrimarySequenceService;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;
import org.springframework.stereotype.Component;


@Component
public class LectorListener extends AbstractMongoEventListener<Lector> {

    private final PrimarySequenceService primarySequenceService;

    public LectorListener(final PrimarySequenceService primarySequenceService) {
        this.primarySequenceService = primarySequenceService;
    }

    @Override
    public void onBeforeConvert(final BeforeConvertEvent<Lector> event) {
        if (event.getSource().getId() == null) {
            event.getSource().setId(primarySequenceService.getNextValue());
        }
    }

}
