package com.gokhana.template.repository;

import com.gokhana.template.model.entity.Template;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TemplateRepository extends MongoRepository<Template, String> {
}
