public class solution14 {
    public static void main(String[] args){
        int count = 0;
        int topcount = 0;
        int topnum = 0;
        for(int i=1; i<=1000000; i++){
            count = hail(i);
            if(count > topcount){
                topcount = count;
                topnum = i;
            }
        }
        System.out.println(topnum + " " + topcount);
    }

    public static int hail(long n){
        int count = 0;
        while(n != 1){
            if(n % 2 == 0){
                n /= 2;
            }
            else{
                n = n * 3 + 1;
            }
            count++;
        }
        return count;
    }
}
