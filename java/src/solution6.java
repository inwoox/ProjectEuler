public class solution6 {
    public static void main(String[] args){
        int result1 = 0;
        int result2 = 0;

        for(int i=1; i<101; i++){
            result1 += (i*i);
            result2 += i;
        }
        result2 = result2 * result2;
        System.out.println(result2 - result1);
    }
}
