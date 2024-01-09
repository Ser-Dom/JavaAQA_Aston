package lesson6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class AppData {
    private String[] header;
    private int[][] data;

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    public String[] getHeader() {
        return header;
    }

    public int[][] getData() {
        return data;
    }

    public void save(String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            // Записываем заголовок
            writer.write(String.join(";", header));
            writer.newLine();

            // Записываем данные
            for (int[] row : data) {
                writer.write(Arrays.stream(row).mapToObj(String::valueOf).collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString());
                writer.newLine();
            }

            System.out.println("Данные успешно сохранены в файл: " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void load(String fileName) {
        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
            // Читаем заголовок
            header = fileReader.readLine().split(";");

            // Подсчитываем количество строк с данными
            long rowCount = fileReader.lines().count();

            // Инициализируем массив данных
            data = new int[(int) rowCount][];

            // Сбрасываем fileReader на начало файла
            fileReader.close();
            fileReader = new BufferedReader(new FileReader(fileName));

            // Пропускаем первую строку (заголовок)
            fileReader.readLine();

            // Читаем данные
            for (int i = 0; i < rowCount; i++) {
                String[] values = fileReader.readLine().split(";");
                data[i] = Arrays.stream(values).mapToInt(Integer::parseInt).toArray();
            }

            System.out.println("Данные успешно загружены из файла: " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
