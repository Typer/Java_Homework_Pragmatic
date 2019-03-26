import java.util.Scanner;

/*
    Да се изведат съобщения към потребителя и да се прочетат 2 числа от клавиатурата A и B (може да са с
    плаваща запетая – double). После да се прочете 3-то число C и да се провери дали то е м/у A и B.
    Да се изведе подходящо съобщение за това дали C е между A и B.
    Числото 22.1 е между 13.2 и 29.5
 */
public class Exercise01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c;
        a = 22.5;
        b = 12.6;
        c = input.nextInt();

        if ((c > a && c < b) || (c < a && c > b)) {
            System.out.println("Числото " + c + " е между " + b + " и " + a);
        }else{
            System.out.println("Числото " + c + "  НЕ е между " + b + " и " + a);
        }
    }
}
