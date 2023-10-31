import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterNumbers {
    public static void main(String[] args) {
        Stream<Long> allNumbers = Stream.iterate(1L, n -> n+1).limit(10);

        allNumbers = allNumbers.filter(n -> n % 2 == 0);

        System.out.println(allNumbers.collect(Collectors.toList()));
    }
}
