import java.util.Scanner;

public class DakataTest06 {

    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);
        int input = terminal.nextInt();
        int sum = 0;

        for(int i = 1; i <= input; i++)
        {
            sum = sum + i;
        }

        System.out.println("Сумата на числата до " + input + " е " + sum);
    }

}
