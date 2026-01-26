package module_1_test_lab_question1;

import java.io.*;
import java.util.*;




public class MerchandiseMain {
    public static void main(String[] args) {

        ArrayList<Merchandise> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("input.dat"))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) continue;

                String[] parts = line.split("\\s+");
                String code = parts[0];
                int qty = Integer.parseInt(parts[1]);
                double price = Double.parseDouble(parts[2]);

                list.add(new Merchandise(code, qty, price));
            }
        } catch (IOException e) {
            System.out.println("File error");
            return;
        }

        Collections.sort(list, new NameComp());
        for (Merchandise m : list) {
            System.out.println(m);
        }

        System.out.println();

        Collections.sort(list, new PriceComp());
        for (Merchandise m : list) {
            System.out.println(m);
        }
    }
}
