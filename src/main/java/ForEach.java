import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEach {
    static void forEachString(List<String> listOfStrings, Consumer<String> consumer) {
        listOfStrings.forEach(consumer);
    }

    static <T> void forEach(List<T> lst, Consumer<T> consumer) {
        lst.forEach(consumer);
    }

    public static void main(String[] args) {
        Consumer<String> toUpper = x ->
                System.out.println(x.toUpperCase());
        toUpper.accept("viggo");

        Consumer<Integer> square = t -> System.out.println(t*t);
        square.accept(501);

        List<String> lstStr = Arrays.asList("hej", "du", "der");
        forEachString(lstStr, toUpper);


        List<Integer> lstNum = Arrays.asList(1,2,3,4,5,6,7);
        Consumer<Integer> num = x -> System.out.println(x);
        forEach(lstNum, num);

        lstNum.forEach(num);

    }


}
