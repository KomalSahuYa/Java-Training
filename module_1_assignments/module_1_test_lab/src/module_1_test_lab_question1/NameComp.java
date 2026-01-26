package module_1_test_lab_question1;

import java.util.Comparator;

public class NameComp implements Comparator<Merchandise> {
    @Override
    public int compare(Merchandise m1, Merchandise m2) {
        return m1.getItemCode().compareTo(m2.getItemCode());
    }
}