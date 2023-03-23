package com.youngstanis.codedocumentconverter.service.impl;

import com.youngstanis.codedocumentconverter.service.ConverterService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileFilter;
import java.util.*;

@Service
public class ConverterServiceImpl implements ConverterService {

    @Override
    public MultipartFile convertCodeToFile(List<File> files, String fileName) {
        return null;
    }

    @Override
    public List<File> filesList(File root) {
        PriorityQueue<File> priorityQueue = new PriorityQueue<>();
        List<File> files = new LinkedList<>();
        if(root.isDirectory()) {
            Collections.addAll(priorityQueue, root.listFiles());
            while (!priorityQueue.isEmpty()) {
                File file = priorityQueue.poll();
                if(file.isDirectory()) {
                    files.add(file);
                } else {
                    Collections.addAll(priorityQueue, file.listFiles());
                }
            }
        } else {
            files.add(root);
        }
        return files;
    }
}
