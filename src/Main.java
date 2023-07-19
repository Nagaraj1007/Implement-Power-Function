
public class Main {

    public static int powerFunction(int number, int power, int modulusValue){
        if(power == 1){
            return number % modulusValue;
        }
        return powerFunction(number, power - 1, modulusValue) * number % modulusValue;
    }

    public static void main(String[] args) {
        System.out.println(powerFunction(3,3,1));
    }
}