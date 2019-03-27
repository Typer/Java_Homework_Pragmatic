import java.util.Scanner;

/*
    По зададено число n, да се изведе на екрана таблица по следния начин:
 */
public class Exercise08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        for (int i = 0; i < (num * 2); i+=2) {
            for (int j = 0; j < num; j++) {
                int k = (num + i) -1;
                System.out.print( k  + " ");
            }
            System.out.println("");
        }
    }
}
