import java.math.BigInteger;

public class solution20 {

    public static BigInteger result = new BigInteger("1");
    public static BigInteger one = new BigInteger("1");
    public static void main(String[] args){
        int sum = 0;
        String[] strArr;
        BigInteger num = new BigInteger("100");
        result = jarisu(num);
        strArr = result.toString().split("");
        for(String s : strArr){
            sum += Integer.parseInt(s);
        }

        System.out.println(sum);
    }

    public static BigInteger jarisu(BigInteger n){
        result = result.multiply(n);
        if (!n.equals(one)) return jarisu(n.subtract(one));
        else return result;
    }
}
