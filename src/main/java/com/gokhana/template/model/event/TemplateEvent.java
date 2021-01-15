package com.gokhana.template.model.event;

public class TemplateEvent {

    private TemplateEventType templateEventType;
    private Long userId;
    private String templateId;
    private String templateName;

    public TemplateEvent() {
    }

    public TemplateEvent(TemplateEventType templateEventType, Long userId, String templateId, String templateName) {
        this.templateEventType = templateEventType;
        this.userId = userId;
        this.templateId = templateId;
        this.templateName = templateName;
    }

    public TemplateEventType getTemplateEventType() {
        return templateEventType;
    }

    public void setTemplateEventType(TemplateEventType templateEventType) {
        this.templateEventType = templateEventType;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    @Override
    public String toString() {
        return "TemplateEvent{" +
                "templateEventType=" + templateEventType +
                ", userId='" + userId + '\'' +
                ", templateId=" + templateId +
                ", templateName=" + templateName +
                '}';
    }
}
