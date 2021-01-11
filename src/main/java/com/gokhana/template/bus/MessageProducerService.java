package com.gokhana.template.bus;


import com.gokhana.template.model.event.TemplateEvent;

public interface MessageProducerService {

    void sendTemplateEventMessage(TemplateEvent templateEvent);
}
