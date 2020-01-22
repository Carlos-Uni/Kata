public class Multiple {

    private static int sum;

    public static int of(int number) {
        return checkInterval(number);
    }

    private static int checkInterval(int number){
        sum = 0;
        for(int i = 0; i < number; i++){
            if(isMultiple(i) || isMultiple(i)){
                sum += i;
            }
        }
        return sum;
    }

    private static boolean isMultiple(int i) {
        return i%3 == 0 || i%5 == 0;
    }
}
