/*
    Да се изведат на екрана числата от 1 до 100..
 */
public class Exercise01 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i == 100){
                System.out.println(i);
            }else{
                System.out.print(i + ", ");
            }

        }
    }
}
