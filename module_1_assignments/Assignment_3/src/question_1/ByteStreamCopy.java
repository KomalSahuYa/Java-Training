package question_1;

import java.io.*;

public class ByteStreamCopy {
    public static void main(String[] args) {
        File source = new File("image.jpg");
        File dest = new File("byte_copy.jpg");

        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(dest)) {

            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
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
