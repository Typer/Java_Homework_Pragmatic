import java.util.Arrays;
import java.util.Scanner;

/*
    Въведете 2 различни числа от конзолата и ги разпечатайте в нарастващ ред.
 */

public class Exercise04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        if (a < b){
            System.out.println(a);
            System.out.println(b);
        }else{
            System.out.println(b);
            System.out.println(a);
        }


    }
}
