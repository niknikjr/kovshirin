package work71;

import java.util.Arrays;
import java.util.Scanner;

public class Task71 {

    public static void main(String[] args) {
	// write your code here
        int[]array = createArray(10);
        System.out.println(Arrays.toString(array));

    }

    public static int[] createArray( int size){
        if (size <=0){
            return null;
        }
        int [] array = new int[size];
        int number = 2;
        for (int i = 0; i < array.length; i++) {
            array[i]=number;
            number+=2;
        }
        return array;
    }
}
