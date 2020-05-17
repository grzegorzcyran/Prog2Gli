package com.grcy.files.samples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileSamples {
    public static void main(String[] args) {
        String customPath = ".";
        Path path = Paths.get(customPath);
        try {
            Files.walk(path)
                    //.filter(Files::isDirectory)
                    .filter(Files::isRegularFile)
                    .forEach(f -> System.out.println(f.getFileName()));

            System.out.println("=====================");
            Files.find(path, Integer.MAX_VALUE, (filePath, fileAttr) -> fileAttr.isRegularFile())
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Lista plików w katalogu
     * Path path = Paths.get("/");
     * Files.list(path).forEach(f -> System.out.println(f.getFileName()));
     * Zapis lub dopisanie danych do pliku
     * Path path = Paths.get("info.log");
     * Files.write(path, "tekst".getBytes());
     * Files.write(path, "tekst".getBytes(), StandardOpenOption.APPEND);
     * Odczyt pliku linia po linii
     * Path path = Paths.get(“plik.txt”); Files.lines(path).forEach(line -> System.out.println(line));
     * Odczyt tekstu
     * Path path = Paths.get("info.log");
     * String tekst = new String(Files.readAllBytes(path));
     */
}
