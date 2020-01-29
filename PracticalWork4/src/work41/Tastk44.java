package work41;

public class Tastk44 {
    public static void main(String[] args) {
        int x=1;
        int i = 0;
        while (x<300){

            if (x%3==0 || x%4==0){
                i++;
                System.out.println(i+") " + x);
            }
            if (i==10) {break;}
            x++;
        }
    }

}
