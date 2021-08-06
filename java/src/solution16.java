import java.math.BigInteger;

public class solution16 {
    public static void main(String[] args){
        int sum = 0;
        BigInteger bigInteger = new BigInteger("2");
        bigInteger = bigInteger.pow(1000);
        String[] strArr = bigInteger.toString().split("");
        for (String s : strArr){
            sum += Integer.parseInt(s);
        }

        System.out.println(sum);
    }
}
