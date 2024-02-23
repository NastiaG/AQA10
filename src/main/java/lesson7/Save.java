package lesson7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Save {

    public static void save(AppData appData, String fileName) throws IOException {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for(int i = 0; i < appData.getHeader().length; i++) {
                if(i != appData.getHeader().length - 1) {
                    writer.write(appData.getHeader()[i] + ";");
                } else {
                    writer.write(appData.getHeader()[i]);
                }
            }
            writer.write("\n");
            writer.flush();

            for (int i = 0; i < appData.getData().length; i++) {
                for (int j = 0; j < appData.getData()[0].length; j++) {
                    if (j != appData.getData()[0].length - 1) {
                        writer.write(String.valueOf(appData.getData()[i][j]) + ";");
                    } else {
                        writer.write(String.valueOf(appData.getData()[i][j]));
                    }
                }
                writer.write("\n");
                writer.flush();
            }
        } catch (IOException e) {
            throw new IOException("Saving data to file failed: " + e.getMessage());
        }
    }
}