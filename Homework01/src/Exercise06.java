import java.util.Scanner;

/*
    Въведете 3 числа от клавиатурата а1, а2 и а3. Разменете стойностите им така, че а1 да има стойността
    на а2, а2 да има стойността на а3, а а3 да има старата стойност на а1.
 */

public class Exercise06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value fot a1: ");
        int a1 = input.nextInt();
        System.out.print("Enter value fot a2: ");
        int a2 = input.nextInt();
        System.out.print("Enter value fot a3: ");
        int a3 = input.nextInt();

        a2 = a2 + a3 + a1;
        a1 = a2 - (a3 + a1);
        a3 = a2 - (a3 + a1);
        a2 = a2 - (a3 + a1);

        System.out.println("a1: " + a1);
        System.out.println("a2: " + a2);
        System.out.println("a3: " + a3);

    }
}
