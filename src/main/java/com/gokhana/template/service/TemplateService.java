package com.gokhana.template.service;

import com.gokhana.template.model.entity.Template;

public interface TemplateService {
    Template createTemplate(Template template);

    Template getTemplate(String templateId);

}
