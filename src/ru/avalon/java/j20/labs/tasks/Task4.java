package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Задание №4
 *
 * <p>Тема: "Потоковый ввод-вывод. Чтение файлов конфигурации".
 */
public class Task4 implements Task {

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() throws IOException {
        Properties properties = read("resources/database.properties");

        /*
         * Выполнено задание №4
         *
         * 1. Реализован метод read.
         *
         * 2. С использованием отладчика проверена корректность работы программы.
         */
    }

    /**
     * Выполнено чтение файла конфигураций описанного
     * параметром {@code path}.
     *
     * @param path путь к конфигурации
     * @return новый экземпляр типа {@link Properties}
     */
    private Properties read(String path) throws IOException {
        Properties properties = new Properties();
        try(InputStream stream = ClassLoader.getSystemResourceAsStream(path)) {
            properties.load(stream);
        }
        return properties;
    }
}
