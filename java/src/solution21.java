public class solution21 {
    public static void main(String[] args){

        int asum = 0;
        int bsum = 0;
        int total = 0;

        for (int i=2; i<10000; i++){
            for (int j=1; j<i; j++){
                if (i % j == 0) {
                    asum += j;  // 284
                }
            }

            for (int k=1; k<asum; k++){
                if (asum % k == 0) {
                    bsum += k;
                }
            }

            if (i == bsum && i != asum){
                total += i;
            }

            asum = 0;
            bsum = 0;
        }
        System.out.println(total);
    }
}
