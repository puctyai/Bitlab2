import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> numbs = new ArrayList<>();
        ArrayList<Integer> non = new ArrayList<>();
       int a;
       while((a= in.nextInt()) !=0) {
         if(numbs.contains(a) && !non.contains(a)) {
             non.add(a);
         }
         else numbs.add(a);
       }
       for(int num:non) {
           System.out.print(num+" ");
       }


    }
}