package com.gokhana.template.model.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;

@Document(collection = "template")
public class Template {

    @Id
    private String id;

    @NotBlank(message = "Thing name can not be null or empty")
    private String name;


    public Template() {
    }

    public Template(@NotBlank(message = "Thing name can not be null or empty") String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "Template{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

