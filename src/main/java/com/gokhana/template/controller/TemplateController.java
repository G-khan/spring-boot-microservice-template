package com.gokhana.template.controller;


import com.gokhana.template.model.dto.TemplateDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/templates")
public class TemplateController {

    private static final Logger LOGGER = LoggerFactory.getLogger(TemplateController.class);

    @PostMapping
    public ResponseEntity<TemplateDTO> createTemplate(@Validated @RequestBody TemplateDTO templateDTO) {
        LOGGER.debug("Incoming Request for Create templateDTO : {}", templateDTO);
        return ResponseEntity.ok(templateDTO);
    }
}
