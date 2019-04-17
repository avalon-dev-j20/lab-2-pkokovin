package ru.avalon.java.j20.labs.tasks;

import java.io.BufferedReader;
import ru.avalon.java.j20.labs.Task;
import ru.avalon.java.j20.labs.models.Country;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Задание №6
 *
 * <p>Тема: "Потоковый ввод-вывод. Получение объекта на
 * основании прочитанных данных".
 */
public class Task6 implements Task {

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() throws IOException, ParseException {
        File input = new File("assets/countries.txt");
        Collection<Country> countries = read(input);

        /*
         * Выполнено задание №6
         *
         * 1. Реализован метод read.
         *
         * 2. При реализации использованы классы:
         *    BufferedReader и Country.
         *
         * 3. С использованием отладчика проверена корректность работы программы.
         */
    }

    /**
     * Выполняет чтение коллекции объектов типа {@link Country}
     * из указанного файла.
     *
     * <p>Выполняет чтение файла построчно. Преобразование
     * из текста в объект выполняется с использованием
     * метода {@code valueOf} класса {@link Country}.
     *
     * @param file файл
     * @return коллекция объектов типа {@link Country}
     * @throws IOException в случае ошибки ввода-вывода.
     */
    private Collection<Country> read(File file) throws IOException, ParseException {
//        throw new UnsupportedOperationException("Not implement yet!");
         Collection<Country> country = new ArrayList<>();
         try(InputStream inStream = new FileInputStream(file);
             BufferedReader reader = new BufferedReader(new InputStreamReader(inStream))){
             String strLine;
             while((strLine = reader.readLine()) != null) {
                 country.add(Country.valueOf(strLine));
             }
         }
         return country;
    }
}
