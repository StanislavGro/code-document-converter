package com.youngstanis.codedocumentconverter.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileFilter;
import java.util.List;
import java.util.PriorityQueue;

public interface ConverterService {
    MultipartFile convertCodeToFile(List<File> files, String fileName);
    List<File> filesList(File root);
}
