package com.youngstanis.codedocumentconverter.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        List<File> files = Files.walk(Paths.get("C:\\Users\\grokhotov\\IdeaProjects\\code-document-converter\\src"))
                .filter(Files::isRegularFile)
                .filter(path -> path.toString().endsWith(".java"))
                .filter(path -> {
                    try {
                        return Files.lines(path).anyMatch(line -> line.contains("Controller"));
                    } catch (IOException e) {
                        e.printStackTrace();
                        return false;
                    }
                })
                .map(Path::toFile)
                .collect(Collectors.toList());
        files.forEach(System.out::println);
    }
}
