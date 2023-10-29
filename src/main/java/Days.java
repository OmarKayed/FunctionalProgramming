import java.time.LocalDate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Days {

    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2000,6,15);

        Stream<LocalDate> tendates = IntStream.range(1,10).mapToObj(i -> birthday.plusYears(i));
        var obj = tendates.map(date -> "Year = " + date.getYear() + " ugedag = " + date.getDayOfWeek());
        obj.forEach(System.out::println);
    }
}
