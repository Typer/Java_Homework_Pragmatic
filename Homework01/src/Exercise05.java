import java.util.Arrays;
import java.util.Scanner;

/*
    Въведете 3 различни числа от конзолата и ги разпечатайте в низходящ ред.
 */

public class Exercise05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[3];

        for (int i = 0; i < 3; i++) {
            nums[i] = input.nextInt();
        }

        Arrays.sort(nums);

        System.out.println(nums[2]);
        System.out.println(nums[1]);
        System.out.println(nums[0]);
    }
}
