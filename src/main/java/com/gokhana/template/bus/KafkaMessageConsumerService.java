package com.gokhana.template.bus;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageConsumerService {

    private final Logger LOGGER = LoggerFactory.getLogger(KafkaMessageConsumerService.class);

    @KafkaListener(topics = "${kafka.topic.otherTemplate}")
    public void consumeUserThingEvent(Object otherTemplate) {
        LOGGER.debug("Message Received. otherTemplate: {}", otherTemplate);
    }
}
