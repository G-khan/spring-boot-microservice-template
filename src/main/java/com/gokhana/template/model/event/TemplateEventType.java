package com.gokhana.template.model.event;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum TemplateEventType {

    CONNECT("CONNECT"), DISCONNECT("DISCONNECT");

    private String eventType;

    private TemplateEventType(String eventType) {
        this.eventType = eventType;
    }

    public static TemplateEventType fromString(String eventType) {
        for (TemplateEventType type : TemplateEventType.values()) {
            if (type.eventType.equalsIgnoreCase(eventType)) {
                return type;
            }
        }
        return null;
    }

    @JsonValue
    public String getType() {
        return this.eventType;
    }
}
