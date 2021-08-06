import java.util.Scanner;

public class solution12 {
    public static void main(String[] args){
        long result = 0;
        int count = 0;
        for(int i=1; i<=1000000; i++){
            result += i; // result = 100 / 1 , 100 / 2, 100 / 5, 100 / 10
            for(int j=1; j<= Math.sqrt(result); j++){
                if(result % j == 0) count++;
            }
            if(count > 250){
                System.out.println(result);
                break;
            }
            count = 0;

        }
    }
}
