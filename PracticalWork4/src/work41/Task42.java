package work41;

import java.util.Scanner;

public class Task42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        switch (x){
            case 1: System.out.println("Один"); break;
            case 2: System.out.println("Два"); break;
            case 3: System.out.println("Три"); break;
            case 4: System.out.println("Четыре"); break;
            default: System.out.println("больше пяти");
        }


    }
}
