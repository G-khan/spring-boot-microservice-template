package com.gokhana.template.service;

import com.gokhana.template.exception.TemplateNotFoundException;
import com.gokhana.template.model.entity.Template;
import com.gokhana.template.repository.TemplateRepository;
import org.springframework.stereotype.Service;

@Service
public class TemplateServiceImpl implements TemplateService {

    final TemplateRepository templateRepository;

    public TemplateServiceImpl(TemplateRepository templateRepository) {
        this.templateRepository = templateRepository;
    }

    @Override
    public Template createTemplate(Template template) {
        return templateRepository.save(template);
    }

    @Override
    public Template getTemplate(String templateId) {
        return templateRepository.findById(templateId).orElseThrow(() -> new TemplateNotFoundException("Template not found id: " + templateId));
    }
}
