import java.util.Scanner;

/*
    Да се прочете число от екрана(конзолата) и да се изведе сбора на всички числа между 1 и въведеното число.
 */
public class Exercise06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int sum = 0;

        for (int i = 1; i <= a; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
