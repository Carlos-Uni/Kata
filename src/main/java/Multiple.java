public class Multiple {

    private static int sum;

    public static int of(int number) {
        return checkInterval(number);
    }

    private static int checkInterval(int number){
        sum = 0;
        for(int i = 0; i < number; i++){
            if(MultipleOf3(i) || i%5 == 0){
                sum += i;
            }
        }
        return sum;
    }

    private static boolean MultipleOf3(int i) {
        return i%3 ==0;
    }
}
