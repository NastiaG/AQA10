package lesson7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Load {

    public static AppData load(String fileName, int arrSizeI, int arrSizeJ) throws IOException, NumberFormatException {
        AppData appData = new AppData();

        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = reader.readLine();
            appData.setHeader(line.split(";"));

            int row = 0;
            int[][] arrIntData = new int[arrSizeI][arrSizeJ];
            line = reader.readLine();

            while(line != null) {
                String[] arrStringData = line.split(";");
                for(int i = 0; i < arrStringData.length; i++) {
                    try {
                        arrIntData[row][i] = Integer.parseInt(arrStringData[i]);
                    } catch (NumberFormatException e) {
                        throw new IOException("Wrong data in file: " + e.getMessage());
                    }
                }
                row++;
                line = reader.readLine();
            }
            appData.setData(arrIntData);
            return appData;
        } catch (IOException e) {
            throw new IOException("Loading data from file failed: " + e.getMessage());
        }
    }
}