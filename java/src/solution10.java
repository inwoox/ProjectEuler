import java.util.ArrayList;

public class solution10 {
    public static void main(String[] args){
        ArrayList<Integer> prime_num = new ArrayList<>();
        int num = 2000000;
        boolean prime_false[] = new boolean[num+1];
        long sum = 0;
        prime_false[1] = true;

        for(int i=2; i*i<=num; i++){
            for(int j=i*i; j<=num; j+=i){
                prime_false[j]=true;
            }
        }
        for(int i=1; i<=num;i++){
            if(!prime_false[i]) prime_num.add(i);
        }
        for(int i : prime_num) sum += i;
        System.out.println(sum);
    }
}
