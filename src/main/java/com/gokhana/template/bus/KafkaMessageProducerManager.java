package com.gokhana.template.bus;

import com.gokhana.template.model.event.TemplateEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

@Service
public class KafkaMessageProducerManager implements MessageProducerService {

    private static final Logger LOG = LoggerFactory.getLogger(KafkaMessageProducerManager.class);

    private final KafkaTemplate<String, Object> kafkaTemplate;

    public KafkaMessageProducerManager(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @Value(value = "${kafka.topic.templateEvent}")
    private String templateEventTopic;


    @Override
    @Async
    public void sendTemplateEventMessage(TemplateEvent templateEvent) {
        LOG.debug("templateEvent object is sending.. -> {}", templateEvent);

        ListenableFuture<SendResult<String, Object>> future = kafkaTemplate.send(templateEventTopic, templateEvent);
        future.addCallback(new ListenableFutureCallback<SendResult<String, Object>>() {

            @Override
            public void onSuccess(SendResult<String, Object> result) {
                LOG.debug("Sent message='{}' with offset={}", templateEventTopic, result.getRecordMetadata().offset());
            }

            @Override
            public void onFailure(Throwable ex) {
                LOG.error("Unable to send message='{}'", templateEventTopic, ex);
            }

        });
    }

}
