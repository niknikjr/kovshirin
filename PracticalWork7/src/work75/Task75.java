package work75;

import java.util.Arrays;

public class Task75 {
    public static void main(String[] args) {
        int[] res = countOfSequenceNumbers("");
        System.out.println(Arrays.toString(res));
    }

    public static int[] countOfSequenceNumbers(String numbers){
        int[] result = new int[10];
        String digits = "0123456789";
        for (int i = 0; i < numbers.length(); i++) {
            char symb = numbers.charAt(i);
            int index = digits.indexOf(symb);
            if (index!=-1){
                result[index]++;
            }
                    }
    return result;
    }
}
