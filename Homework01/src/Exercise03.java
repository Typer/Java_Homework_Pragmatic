import java.util.Scanner;

/*
    Въведете 2 различни числа от конзолата и разменте стойността им. Разпечатайте новите стойности
 */


public class Exercise03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value for a: ");
        int a = input.nextInt();
        System.out.print("Enter value for b: ");
        int b = input.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Now, value of a is: " + a);
        System.out.println("Now, value of b is: " + b);
    }
}
