import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        int x=0;
        Set<String> set = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("¬ведите слово");

            String str = scanner.nextLine();
            if (set.contains(str)) {
                System.out.println("уже было");
                x++;
            }
            else {
                set.add(str);

            }

        }
        while (x<3);
        System.out.println(set);


    }
}