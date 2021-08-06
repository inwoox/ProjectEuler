public class solution4 {
    public static void main(String[] args){
        int front = 0;
        int back = 0;
        int temp = 0;
        int result = 0;

        for (int i=100; i<1000; i++){
            for (int j=100; j<1000; j++) {
                temp = i * j;
                front = temp;

                while(front != 0) {
                    back = back * 10 + front % 10; // 1234 -> 4321
                    front /= 10;
                }

                if (temp == back){ // temp == front / back
                    if (temp > result){
                        result = temp;
                    }
                }

                back = 0;
            }
        }
        System.out.println(result);
    }
}
