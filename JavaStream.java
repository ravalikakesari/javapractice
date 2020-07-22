import java.util.Arrays;
import java.util.List;

public class JavaStream {
    public static void main(String args[]) {
        List<Integer> ListOfInt = Arrays.asList(11, 3, 5, 20, 4, 3, 21);
        int sum = ListOfInt.stream().filter(i -> i > 10).mapToInt(i -> i).sum();
        System.out.println("sum is" + sum);
    }
}


