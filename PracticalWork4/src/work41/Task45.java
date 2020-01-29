package work41;


public class Task45 {
    public static void main(String[] args) {
        System.out.println("* | 1 2 3 4 5 6 7 8 9");
        System.out.println("---------------------------");
        int i = 1;
        while (i<10){
            System.out.print(i + " | ");
            int n = 1;
            while (n<10){
                int m = n*i;
                System.out.print(m + " ");
                n++;
            }
            System.out.println();
            i++;
        }
            }
}
