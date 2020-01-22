public class Multiple {
    public static int of(int number) {

        int sum = 0;
        for(int i = 0; i < number; i++){
            if(i%3 ==0){
                sum += i;
            }
        }

        return sum;
    }
}
