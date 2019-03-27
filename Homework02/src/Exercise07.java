import java.util.Scanner;
/*
 Започвайки от 3, да се изведат на екрана първите n числа които се делят на 3. Числата да са разделени със запетая.
 */
public class Exercise07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = 3;

        while (n > 0){
            if (a % 3 == 0){
                if(n == 1){
                    System.out.println(a);
                }else {
                    System.out.print(a + ", ");
                }
                n --;
            }
            a++;
        }
    }
}
