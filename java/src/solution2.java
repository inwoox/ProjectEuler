public class solution2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int result = 0;
        int total = 0;
        for(int i=0; i<100; i++){
            if(result > 4000000){
                break;
            }
            result = a + b;
            if(result % 2 == 0) total += result;
            a = b;
            b = result;
        }

        System.out.println(total);


    }
}
