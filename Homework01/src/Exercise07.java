import java.util.Scanner;

/*
    Въведете 3 променливи от клавиатурата – час (целочислен тип), сума пари (число с плаваща запетая),
    дали съм здрав – булев тип. Съставете програма, която взема решения на базата на тези данни по следния начин:
    - ако съм болен няма да излизам
    - ако имам пари ще си купя лекарства
    - ако нямам – ще стоя вкъщи и ще пия чай
    - ако съм здрав
    - ако имам по-малко от 10 лв ще отида на кафе и т.н Полученото решение покажете като съобщение в конзолата.
 */

public class Exercise07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //We don't use it!
        int hour = input.nextInt();
        //Money!!!
        double money = input.nextDouble();
        //TRUE || FALSE
        boolean health = input.nextBoolean();


        System.out.println(!health);

        if (!health) {
            System.out.println("I'm sick and I won't go anywhere");
            if (money > 0) {
                System.out.println("I'll buy some medicines with my last money: " + money);
            } else {
                System.out.println("I don't have money for medicines so I'll stay at home!");
            }
        } else {
            if (money < 10) {
                System.out.println("You have " + money + " leva. It's enough to go and drink coffee and buy some drugs!");
            } else {
                System.out.println("Go to work!");
            }
        }
    }
}
