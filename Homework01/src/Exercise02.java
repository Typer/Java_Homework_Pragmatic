import java.util.Scanner;

/*
    Въведете 2 различни целочислени числа от конзолата. Запишете тяхната сума, разлика, произведение,
    остатък от деление и целочислено деление в отделни променливи и разпечатайте тези резултати
    в конзолата. Опитайте същото с числа с плаваща запетая.
 */

public class Exercise02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first_num = input.nextInt();
        int secod_num = input.nextInt();

        double num_f = input.nextDouble();
        double num_s = input.nextDouble();

        //Natural numbers
        int sum = first_num + secod_num;
        int difference = Math.abs(first_num - secod_num);
        int devider;
        int reminder;
        if (first_num > secod_num){
            reminder = first_num % secod_num;
            devider = first_num / secod_num;
        }else{
            reminder = secod_num % first_num;
            devider = secod_num / first_num;
        }

        //Real nimbers
        double sum_d = num_f + num_s;
        double difference_d =  Math.abs(num_f - num_s);
        double devider_d;
        double reminder_d;
        if (num_f > num_s){
            reminder_d = num_f % num_s;
            devider_d = num_f / num_s;
        }else{
            reminder_d = num_s % num_f;
            devider_d = num_s / num_f;
        }

        System.out.println(sum);
        System.out.println(difference);
        System.out.println(devider);
        System.out.println(reminder);

        System.out.println(sum_d);
        System.out.println(difference_d);
        System.out.println(devider_d);
        System.out.println(reminder_d);
    }
}
