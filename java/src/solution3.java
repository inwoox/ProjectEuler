import java.math.BigDecimal;
import java.math.BigInteger;

public class solution3 {
    public static void main(String[] args){
        long num = 600851475143L;
        int i = 2;

        while (num > 1){
            if (num % i == 0){
                num /= i;
                System.out.println(i);
            }
            else {
                i += 1;
            }
        }
    }
}
