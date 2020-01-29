package work41;

import java.util.Scanner;

public class Task46 {
    public static void main(String[] args) {
        System.out.print("Введите целое число --> ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int i;
        int m = 0;
        do {
            i = x%10;
            m = m + (i*i);
            x = x/10;
        } while (x!=0);
        System.out.println("Сумма квадратов цифр = " + m);

    }
}
