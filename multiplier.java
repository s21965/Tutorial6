import java.math.BigDecimal;
import java.util.List;

public class multiplier {

    public int multiple ( int a, int b ) {
        return a*b;
    }

    public int multiple ( int a, int b, int c, int d ) {
        return a*b*c*d;
    }

    public double multiple ( double a, double b ) {
        return a*b;
    }

    public int multiple (List <Integer> a) {
        int j = 1;

        for ( int i = 0; i < a.size(); i++ ) {

            j = j * a.get(i);

        }
        return j;
    }

    public BigDecimal multiple (BigDecimal a, BigDecimal b) {
        return a.multiply(b);
    }

}
