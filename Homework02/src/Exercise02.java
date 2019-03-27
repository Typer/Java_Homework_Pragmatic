/*
    Да се изведат на екрана числат от -20 до 50
 */
public class Exercise02 {
    public static void main(String[] args) {
        for (int i = -20; i <= 50; i++) {
            if (i == 50){
                System.out.println(i);
            }else{
                System.out.print(i + ", ");
            }
        }
    }
}
