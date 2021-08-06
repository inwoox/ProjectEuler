public class solution9 {
    public static void main(String[] args){
        for(int a=1; a<500; a++){
            for(int b=1; b<500; b++){
                for(int c=1; c<500; c++){
                    if(b > a && a + b + c == 1000 && c*c == (a*a) + (b*b)){
                        System.out.println(a*b*c);
                    }
                }
            }
        }
    }
}
