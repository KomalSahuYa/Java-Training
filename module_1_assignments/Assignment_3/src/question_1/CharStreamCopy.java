package question_1;

import java.io.*;

public class CharStreamCopy {
    public static void main(String[] args) {
        File source = new File("source.txt");
        File dest = new File("char_copy.txt");

        try (FileReader fr = new FileReader(source);
             FileWriter fw = new FileWriter(dest)) {

            int ch;
            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }

            System.out.println(source.length());
            System.out.println(dest.length());

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("IO error");
        }
    }
}
