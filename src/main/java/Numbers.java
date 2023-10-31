import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Numbers {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        lst.add(2);
        lst.add(4);

        int sum = lst.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);

        }
}
