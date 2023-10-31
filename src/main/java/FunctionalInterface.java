import java.util.Arrays;
import java.util.List;

public class FunctionalInterface {
    public static void main(String[] args) {
        List<Integer> convertList = Arrays.asList(1,2,3,4,5);
        
        convertList.stream().map(x -> x.toString()).forEach(System.out::println);
    }
}
