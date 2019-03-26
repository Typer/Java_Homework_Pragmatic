import java.util.Scanner;
/*
    Въведете число от клавиатурата и определете дали е просто.
    Просто число е това което се дели САМО на 1 и на себе си.
 */
public class Exercise10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        boolean isPrime;

        num = input.nextInt();

        if (num < 2){
            isPrime = false;
        }else{
            isPrime = true;
        }

        for (int i = 2; i <= num/2; i++) {
            if((num%i) == 0){
                isPrime = false;
                break;
            }
        }

        if (isPrime){
            System.out.println("Prime");
        }else {
            System.out.println("Not Prime");
        }
    }
}
