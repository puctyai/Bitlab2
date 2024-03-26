
import java.util.HashMap;
import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

       String a = in.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : a.toCharArray()) {

            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(Character as:map.keySet()) {
            System.out.println("'"+as+"'"+" occurs "+ map.get(as)+" " +"times");

        }




    }
}
