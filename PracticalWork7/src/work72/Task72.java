package work72;

public class Task72 {
    public static void main(String[] args) {
        int[] array = {5, -2, 0, 12, 13, -3};
        System.out.println(" " + sumOddElementsArray(array));
    }

    public static int sumOddElementsArray(int[] array){
        int sum = 0; int m=0;
        for (int i = 0; i < array.length; i++) {
            if((array[i]%2==1) || (array[i]%2==-1) ){
                sum = sum + array[i];
                m++;
            }
        }
        if (m == 0){
            sum = -1;
        }
    return sum;
    }
}
