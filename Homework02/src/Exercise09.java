import java.util.Scanner;
/*
    Да се прочетат 2 числа от клавиатурата А и В. Да се изведат всички числа от А до В на степен 2(разделени с запетая).
    Ако някое число е кратно на 3, да се изведе съобщение че числото се пропуска „skip 3“. Ако сумата от всички изведени
    числа (без пропуснатите) стане по-голяма от 200, да се прекрати извеждането.
 */

public class Exercise09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int sum = 0;

        for (int i = a; i < b; i++) {

            if (i%3 == 0){
                System.out.print("skip " + i + ",");
                System.out.println("");
            }else {
                sum += i*i;
                if (sum > 200){
                    System.out.println(i*i);
                    break;
                }else{
                    System.out.println((i*i) + ", ");
                }
            }
        }
    }
}
