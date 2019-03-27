import java.util.Scanner;

/*
    Да се въведат от потребителя 2 числа. И да се изведат на екрана всички числа от по-малкото до по-голямото.
 */
public class Exercise05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        if (a > b){
            a = a+b;
            b = a-b;
            a = a-b;
        }

        for (int i = a; i <= b; i++) {
            System.out.print(i + " ");

        }
    }
}
