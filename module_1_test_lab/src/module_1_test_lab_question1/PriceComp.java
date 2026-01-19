package module_1_test_lab_question1;

import java.util.Comparator;

public class PriceComp implements Comparator<Merchandise> {
    @Override
    public int compare(Merchandise m1, Merchandise m2) {
        return Double.compare(m2.getUnitprice(), m1.getUnitprice());
    }
}
