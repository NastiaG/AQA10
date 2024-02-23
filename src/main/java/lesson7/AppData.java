package lesson7;

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

    public void setData(int[][] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        String returnString = Arrays.toString(header) + "\n";
        for (int i = 0; i < data.length; i++) {
          returnString += Arrays.toString(data[i]) + "\n";
        }
        return returnString;
    }
}