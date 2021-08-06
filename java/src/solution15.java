import java.math.BigInteger;

public class solution15 {
    public static void main(String[] args){

        // 1 1 1 1
        // 1 2 3 4
        // 1 3 6 10
        // 1 4 10 20
        int lattNum = 20;
        long[][] latt = new long[lattNum+1][lattNum+1];

        for(int i=0; i<lattNum+1; i++){
            for(int j=0; j<lattNum+1; j++){
                if(i == 0 && j == 0)
                    latt[0][0] = 1;
                else if(i == 0){
                    if(j != 0) latt[i][j] = latt[i][j-1];
                }
                else if(j == 0)
                    latt[i][j] = latt[i-1][j];
                else
                    latt[i][j] = latt[i-1][j] + latt[i][j-1];
            }
        }
        System.out.println(latt[lattNum][lattNum]);
    }

}
