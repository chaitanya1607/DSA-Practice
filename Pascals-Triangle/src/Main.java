import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of pascals triangle : ");
        int size = sc.nextInt();
        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0 ; i < size; i++) {
            List<Integer> list = new ArrayList<>();

            for(int j = 0; j < i + 1 ; j++) {
                if(j == 0 || j == i) {
                    list.add(1);
                }
                else {
                    list.add((result.get(i - 1).get(j - 1))+(result.get(i - 1).get(j)));
                }
            }
            result.add(list);
        }

    System.out.println(result);
    }
}