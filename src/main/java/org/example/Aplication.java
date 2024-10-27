package org.example;

import java.io.*;
import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) throws IOException {
        File text = new File("src/main/resources/1.txt");
        FileReader stranichka = new FileReader(text);
        BufferedReader bufferedReader = new BufferedReader(stranichka);

        String line;
        while ((line= bufferedReader.readLine())!= null){
            System.out.println("ap:" +line);
        }

        Scanner scanner = new Scanner(System.in);
    }
}
