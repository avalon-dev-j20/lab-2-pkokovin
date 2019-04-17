package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Задание №5
 *
 * <p>Тема: "Потоковый ввод-вывод. Чтение локализованных ресурсов".
 */
public class Task5 implements Task {

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() throws IOException {
        
        Locale locale = new Locale("en");
        String path = "resources.strings.titles";
        ResourceBundle bundleDefault = read(path);
        ResourceBundle bundleEn = read(path, locale);
        /*
         * Выполнено задание №5
         *
         * 1. Реализован метод read.
         *
         * 2. Прочитаны ресурсы с использованием локализации по умолчанию (ru).
         *
         * 3. Прочитаны ресурсы с использованием локализации, отличной от той,
         *    которая задана по умолчанию (en).
         *
         * 4. С использованием отладчика сравнены полученные ресурсы и
         *    проверена корректность работы программы.
         */
    }

    /**
     * Выполняет чтение локализованных ресурсов с использованием
     * локализации по умолчанию.
     *
     * @param path путь к файлу ресурсов
     * @return новый экземпляр типа {@link ResourceBundle}
     */
    private ResourceBundle read(String path) {
        ResourceBundle bundle = ResourceBundle.getBundle(path);
        return bundle;
    }

    /**
     * Выполняет чтение локализованных ресурсов.
     *
     * @param path путь к файлу ресурсов
     * @return новый экземпляр типа {@link ResourceBundle}
     */
    private ResourceBundle read(String path, Locale locale) {
        
        ResourceBundle bundle = ResourceBundle.getBundle(path, locale);
        return bundle;
    }
}
