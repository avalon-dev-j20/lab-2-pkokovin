package ru.avalon.java.j20.labs.tasks;

import java.io.BufferedReader;
import ru.avalon.java.j20.labs.Task;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Задание №3
 *
 * <p>Тема: "Потоковый ввод-вывод. Чтение и запись данных с
 * использованием буферизованных типов данных".
 */
public class Task3 implements Task {

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() throws IOException {
        File input = new File("assets/countries.txt");
        File output = new File("countries_buffered_mode_output.txt");
        Collection<String> lines = read(input);
        write(output, lines);

        /*
         * Выполнено задание №3
         *
         * 1. Реализован метод read.
         *
         *    При чтении файла использованы типы данных:
         *    FileReader и BufferedReader.
         *
         * 2. Реализован метод write.
         *
         *    При реализации метода использован тип данных:
         *    PrintWriter.
         *
         * 3. С использованием отладчика проверена корректность работы программы.
         */
    }

    /**
     * Выполняет чтение указанного файла в коллекцию строк.
     *
     * <p>Каждый элемент коллекции представляет собой
     * отдельную строку файла.
     *
     * @param file файл
     * @return содержимое файла в виде текста.
     * @throws IOException в случае ошибок ввода-вывода.
     */
    private Collection<String> read(File file) throws IOException {
        try(Reader reader = new FileReader(file);
            BufferedReader input = new BufferedReader(reader)){
            Collection<String> result = new ArrayList<>();
            String line;
            while ((line = input.readLine()) != null ){
                line = line.trim();
                if (!line.isEmpty()) {
                    result.add(line);
                }
            }
            return result;
        }
    }

    /**
     * Выполняет запись коллекции строковых элементов в файл.
     *
     * <p>Каждый элемент коллекции должен быть записан в
     * файл отдельной строкой.
     *
     * @param file файл
     * @param collection коллекция строк
     * @throws IOException в случае ошибок ввода-вывода.
     */
    private void write(File file, Collection<String> collection) throws IOException {
        try (PrintWriter writer = new PrintWriter(file)) {
            for(String line : collection) {
                writer.println(line);
            }
        }
    }
}
