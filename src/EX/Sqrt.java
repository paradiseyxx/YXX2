package EX;

import java.text.DecimalFormat;

/**
 * Created by Administrator on 2019/10/14.
 */
public class Sqrt {
    public static void main(String[] args) {
        Double a = binSearchSqrt(5.0,0.0,5.0);
        DecimalFormat b = new DecimalFormat(".0000");
        a = Double.parseDouble(b.format(a));
        System.out.println(a);

    }
    private static double binSearchSqrt(Double num, Double left, Double right) {
        if (num == null) {
            throw new IllegalArgumentException("input invalid");
        }

        while (left < right) {
            double middle = (left + right) / 2.0;
            if (Math.abs(middle * middle - num) < 0.00001) {
                return middle;
            }
            if (middle * middle < num ) {
                left = middle;
                right = num / middle;
            } else if (middle * middle > num ) {
                right = middle;
                left = num / middle;
            }
        }
        return left;
    }
}
