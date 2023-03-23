package com.youngstanis.codedocumentconverter.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/v1/convert")
public class ConverterController {

    @PostMapping("/codeToFile")
    public ResponseEntity<MultipartFile> convertCodeToFile(@RequestParam String absolutePath,
                                                           @RequestParam String fileName,
                                                           @RequestParam(required = false) String[] excludedFiles,
                                                           @RequestParam(required = false) String pattern) {

        return null;
    }
}
