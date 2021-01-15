package com.gokhana.template.bus.subscriber;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class KafkaMessageConsumerService {

    private final Logger LOGGER = LoggerFactory.getLogger(KafkaMessageConsumerService.class);


    @KafkaListener(topics = "${kafka.topic.otherTemplate}")
    public void consumeUserThingEvent(Map<String,String> otherTemplate) {
        LOGGER.debug("Message Received. otherTemplate: {}", otherTemplate.toString());
    }

}
