import java.util.ArrayList;
import java.util.Date;

public class solution19 {

    public static void main(String[] args){

        int[] arr = {31,28,31,30,31,30,31,31,30,31,30,31};
        int totalcount = 0;
        int sundaycount = 0;
        int day = 0;

        for(int y=1901; y<2001; y++){
            for(int m=0; m<12; m++){
                day = arr[m];
                if (y % 4 == 0 && m == 1){
                    day++;
                }
                for (int d=0; d<day; d++){
                    if (totalcount % 7 == 6 && d == 1){
                        sundaycount++;
                    }
                    totalcount++;
                }
            }
        }

        System.out.println(sundaycount);
    }
}
