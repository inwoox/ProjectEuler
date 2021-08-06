public class solution7 {
    public static void main(String[] args){

        int count = 0;
        int totalcount = 0;

        for(int i=2; i<1000000; i++){
            for(int j=1; j<i+1; j++){
                if(i % j == 0) count++;
            }

            if(count == 2) totalcount++;

            if(totalcount == 10001){
                System.out.println(i);
                break;
            }

            count = 0;
        }
    }
}
