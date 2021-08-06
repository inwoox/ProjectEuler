

public class solution17 {
    public static void main(String[] args){

        int sum = 0;
        String strTemp = "";
        String[] hund;
        String[] ones = {"","one","two","three","four","five","six","seven","eight","nine","ten", "eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        String[] tens = {"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
        String[] hundreds = {"","onehundred","twohundred","threehundred","fourhundred","fivehundred","sixhundred", "sevenhundred","eighthundred","ninehundred"};

        for (int i=1; i<1001; i++){
            if (i < 20) sum += ones[i].length();
            else if (i == 100) sum += 10;
            else if (i < 1000){
                if (String.valueOf(i).length() == 2)
                    sum += (tens[i / 10].length() + ones[i % 10].length());

                else if (String.valueOf(i).length() == 3){    // 111 / 1, 11
                    hund = String.valueOf(i).split("");
                    strTemp = hund[1] + hund[2];
                    if(Integer.parseInt(strTemp) < 20)
                        sum += (hundreds[Integer.parseInt(hund[0])].length() + ones[Integer.parseInt(strTemp)].length());
                    else
                        sum += (hundreds[Integer.parseInt(hund[0])].length() + tens[Integer.parseInt((hund[1]))].length() + ones[Integer.parseInt(hund[2])].length());

                    if (!strTemp.equals("00")) sum += 3;

                }
            }
            else if (i == 1000) sum += 11;
        }
        System.out.println(sum);

    }
}
