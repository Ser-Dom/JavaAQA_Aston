package lesson6;

import java.util.Arrays;

public class AppData {
    private String[] header;
    private int[][] data;

    public String[] getHeader() {
        return header;
    }

    public void setHeader(String[] header) {
        this.header = header;
    }

    public int[][] getData() {
        return data;
    }

    public void addData(int[] row) {
        if (data == null) {
            data = new int[1][];
            data[0] = row;
        } else {
            int[][] newData = Arrays.copyOf(data, data.length + 1);
            newData[data.length] = row;
            data = newData;
        }
    }
}

