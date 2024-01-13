package lesson6;

import java.io.*;
import java.util.Arrays;

public class CSVHandler {

    public static void save(AppData data, String filePath) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {

            writer.println(String.join(";", data.getHeader()));

            for (int[] row : data.getData()) {
                writer.println(Arrays.stream(row).mapToObj(String::valueOf).collect(StringBuilder::new,
                        (sb, s) -> sb.append(";").append(s), StringBuilder::append).substring(1));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static AppData load(String filePath) {
        AppData appData = new AppData();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            String headerLine = reader.readLine();
            appData.setHeader(headerLine.split(";"));

            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(";");
                int[] row = Arrays.stream(values).mapToInt(Integer::parseInt).toArray();
                appData.addData(row);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return appData;
    }

    public static void main(String[] args) {

        AppData appDataToSave = new AppData();
        appDataToSave.setHeader(new String[]{"Name", "Age", "Score"});
        appDataToSave.addData(new int[]{1, 25, 90});
        appDataToSave.addData(new int[]{2, 30, 85});

        save(appDataToSave, "lesson6/data.csv");

        AppData loadedAppData = load("lesson6/data.csv");
        System.out.println(Arrays.toString(loadedAppData.getHeader()));
        for (int[] row : loadedAppData.getData()) {
            System.out.println(Arrays.toString(row));
        }
    }
}

