package com.gokhana.template.model.dto;

public class TemplateDTO {

    private String id;

    private String name;

    private Long userId;

    public TemplateDTO() {
    }

    public TemplateDTO(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public TemplateDTO(String id, String name, Long userId) {
        this.id = id;
        this.name = name;
        this.userId = userId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "TemplateDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }
}
