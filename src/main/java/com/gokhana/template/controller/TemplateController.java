package com.gokhana.template.controller;


import com.gokhana.template.model.dto.TemplateDTO;
import com.gokhana.template.model.entity.Template;
import com.gokhana.template.service.TemplateService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/templates")
public class TemplateController {

    private static final Logger LOGGER = LoggerFactory.getLogger(TemplateController.class);

    private final TemplateService templateService;

    public TemplateController(TemplateService templateService) {
        this.templateService = templateService;
    }

    @PostMapping
    public ResponseEntity<TemplateDTO> createTemplate(@Validated @RequestBody TemplateDTO templateDTO) {
        LOGGER.debug("Incoming Request for Create templateDTO : {}", templateDTO);
        Template createdTemplate = templateService.createTemplate(new Template(templateDTO.getName()));
        return ResponseEntity.ok(new TemplateDTO(createdTemplate.getId(), createdTemplate.getName(), templateDTO.getUserId()));
    }

    @GetMapping("/{templateId}")
    public ResponseEntity<TemplateDTO> getTemplate(@PathVariable String templateId) {
        LOGGER.debug("Incoming Request for Retrieve templateDTO : {}", templateId);
        Template template = templateService.getTemplate(templateId);
        return ResponseEntity.ok(new TemplateDTO(template.getId(), template.getName()));
    }

}
