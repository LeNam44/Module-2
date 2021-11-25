package JavaIO.CopyFileText;

import java.io.*;

public class CopyFile {
    public void copyFile() {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(
                    new FileWriter("C:\\Users\\Nam Le\\Desktop\\CODE\\Module 2\\Lesson 12 to 23\\src\\JavaIO\\CopyFileText\\file-copy.txt"));
            BufferedReader bufferedReader = new BufferedReader(
                    new FileReader("C:\\Users\\Nam Le\\Desktop\\CODE\\Module 2\\Lesson 12 to 23\\src\\JavaIO\\CopyFileText\\file.txt"));
            String line;
            while ((line = bufferedReader.readLine()) != null ) {
                bufferedWriter.write(line + "\n");
            }
            bufferedReader.close();
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        CopyFile copyFile = new CopyFile();
        copyFile.copyFile();
    }
}
