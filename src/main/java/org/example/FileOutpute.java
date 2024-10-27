package org.example;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOutpute {
    public static void main(String[] args) throws IOException {
        File text = new File("src/main/resources/1.txt");
        FileWriter fileWriter = new FileWriter(text, true);
        fileWriter.write("\nPrivet!!!");

        fileWriter.close();

    }
}
