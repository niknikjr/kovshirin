package work41;

import java.util.Scanner;

public class Task41 {

    public static void main(String[] args) {
	// write your code here
        int var1 = -10;
        int var2 = 10;
        int var3 = 0;
        int max = var1;
        if (max < var2) {
            max = var2;
        }
        if (max < var3){
            max = var3;
        }
        System.out.println("maxvaue= " + max);
    }
}
