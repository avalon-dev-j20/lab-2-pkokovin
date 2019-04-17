package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 * Задание №2
 *
 * <p>Тема: "Потоковый ввод-вывод. Чтение и запись данных
 * в текстовом режиме".
 */
public class Task2 implements Task {

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() throws IOException {
        File input = new File("assets/countries.txt");
        File output = new File("countries_text_mode_output.txt");
        String text = read(input);
        write(output, text);

        /*
         * Выполнено задание №2
         *
         * 1. Реализован метод read.
         *
         *    При чтении файла использованы типы данных:
         *    Reader, FileReader.
         *
         *    Для сохранения прочитанных данных использован
         *    классом StringBuilder.
         *
         * 2. Реализовн метод write.
         *
         *    При реализации метода использованы типы данных:
         *    Writer и FileWriter.
         *
         * 3. С использованием отладчика проверена корректность работы программы.
         */
    }

    /**
     * Выполняет чтение указанного файла в текстовом режиме.
     *
     * <p>Весь текст файла возвращается в виде одного
     * экземпляра типа {@link String}.
     *
     * @param file файл
     * @return содержимое файла в виде текста.
     * @throws IOException в случае ошибок ввода-вывода.
     */
    private String read(File file) throws IOException {
         try (Reader reader = new FileReader(file)){
            StringBuilder builder = new StringBuilder();
            char[] buffer = new char[5];
            int len;
            while ((len = reader.read(buffer)) > 0) {
                builder.append(buffer, 0, len);
            }
            return builder.toString();      
        }
    }

    /**
     * Выполняет запись текстоых данных в файл в текстовом
     * режиме.
     *
     * @param file файл
     * @param text текст
     * @throws IOException в случае ошибок ввода-вывода.
     */
    private void write(File file, String text) throws IOException {
         try (Writer writer = new FileWriter(file)) {
            writer.write(text);
        }
    }
}
