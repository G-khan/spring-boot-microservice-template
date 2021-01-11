package com.gokhana.template.model.event;

public class TemplateEvent {

    private TemplateEventType templateEventType;
    private String userId;
    private Long templateId;
    private String templateName;

    public TemplateEvent() {
    }

    public TemplateEvent(TemplateEventType templateEventType, String userId, Long templateId, String templateName) {
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Long getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Long templateId) {
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
