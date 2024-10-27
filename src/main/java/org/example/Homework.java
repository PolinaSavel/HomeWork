package org.example;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Homework {
//  1  Vivodit kajduyu stroku faila
//
//    public static void main(String[] args) throws IOException {
//        String text = "src/main/resources/1.txt";
//        String line;
//
//        BufferedReader bufferedReader = new BufferedReader(new FileReader(text));
//
//        while ((line = bufferedReader.readLine()) != null) {
//            System.out.println(line);
//
//        }
//    }
//}

//    2. Zapisivaem ves' fail v odnu stroku

//    public static void main(String[] args) throws IOException {
//        String text = "src/main/resources/1.txt";
//        Path path = Paths.get(text);
//
//        String content=Files.readString(path);
//        String singleLineContent = content.replaceAll("(\\r\\n|\\n)", " ");
//        System.out.println(singleLineContent);
//
//    }
//}

//    3. smotrim kolichestvo baitov
//    public static void main(String[] args) throws IOException {
//        String text = "src/main/resources/1.txt"; // Замените на путь к вашему файлу
//
//        FileInputStream fis = new FileInputStream(text);
//        int byteCount = 0;
//
//        while (fis.read() != -1) {        // Chitaem fail
//            byteCount++;
//        }
//
//        System.out.println("Kolichestvo baytov: " + byteCount);
//
//    }
//}

//    4. Smotrim kolichestvo slov
//    public static void main(String[] args) throws FileNotFoundException {
//        String text = "src/main/resources/1.txt";
//
//        File file = new File(text);
//        Scanner scanner = new Scanner(file);
//        int wordCount = 0;
//
//        while (scanner.hasNext()) {    //chtenie slovo za slovom
//            String word = scanner.next();     //poluchaem slovo
//            wordCount++;
//        }
//
//        scanner.close();
//        System.out.println("Kolichestvo slov: " + wordCount);
//    }
//}

//    5. Zapisivaem nujnie stroki v fail
//    public static void main(String[] args) throws IOException {
//
//        File text = new File("src/main/resources/1.txt");
//        PrintWriter writer = new PrintWriter(new FileWriter(text));
//
//        System.out.println(writer);
//        writer.println("Nasha Dasha molodec, kak soleniy ogurec");
//        writer.println("Tolstaya koshka na krishe jila");
//        writer.println("Nasha Masha gromko plachet? uronila v rechku myachik");
//        writer.println("Tishe Tanechka ne plach? ne utonet v rechke myach");
//        writer.close();
//    }
//}

//    6.Dobavili stroku v konce faila
//    public static void main(String[] args) throws IOException {
//        String filePath = "src/main/resources/1.txt";
//        String textToAdd = "Listopad, listopad, list'ya jeltie letyat\n";
//
//        Path path = Path.of(filePath);
//
//        Files.writeString(path, textToAdd, StandardOpenOption.APPEND);
//        System.out.println("Stroka dobavlena: " + filePath);
//    }
//}

//    7. sozdayem fail i zapisivaem v negostroki
//    public static void main(String[] args) throws IOException {
//        String text = "src/main/resources/2.txt";
//        String[] linesToWrite = {
//                "Letela Vorona",
//                "Po sinemu nebu",
//                "Chitala gazetu",
//                "Pod nomerom 6",
//                "1, 2, 3, 4, 5, 6!"
//        };
//
//        FileWriter writer = new FileWriter(text, true);
//        for (String line : linesToWrite) {
//            writer.write(line + System.lineSeparator());
//        }
//        System.out.println("Stroka dobavlena: " + text);
//
//        writer.close();
//    }
//}

//    8. Chitaem chislo iz binarnogo faila
//    public static void main(String[] args) throws IOException {
//        String textBinarniy = "src/main/resources/binarniy.bin";
//        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(textBinarniy));
//
//        while (true) {
//            int number = dataInputStream.readInt();
//            System.out.println(number);
//        }
//    }
//}

    //    9. Записываем в любое место и потом обратно считываем
//    public static void main(String[] args) throws IOException {
//        String text = "src/main/resources/3.txt";
//        String textToWrite = "Random text";
//        long position = 3; // v kakuyu yacheyku zapisivaem
//
//        // Записываем строку в файл
//        RandomAccessFile randomAccessFile = new RandomAccessFile(text, "rw");
//            randomAccessFile.seek(position); // perehodim na nujnuyu poziciu
//            randomAccessFile.writeBytes(textToWrite); // zapisivaem stroku
//            System.out.println("Stroka zapisana na pozicii: " + position);
//
//
//        // Читаем строку из файла
//        RandomAccessFile raf = new RandomAccessFile(text, "r");
//        raf.seek(position); // Перемещаем указатель на ту же позицию
//        byte[] buffer = new byte[textToWrite.length()];
//        raf.read(buffer);
//        String readText = new String(buffer);
//        System.out.println("Прочитанная строка: " + readText);
//
//    }
//}

    //10
    public static void main(String[] args) throws IOException {
        String filePath = "src/main/resources/4.txt";
        List<String> linesToWrite = Arrays.asList(
                "U lukomoriya",
                "dub zeleniy,",
                "Zlataya cep'",
                "na dube tom.",
                "I dnem i nochyu..."
        );

        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
        for (String line : linesToWrite) {
            writer.write(line); // Записываем строку
            writer.newLine();   // Добавляем n строки
        }
        System.out.println("Строки успешно записаны в файл: " + filePath);
        writer.close();
    }
}

