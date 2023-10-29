import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {
        Supplier<Double> ran = () -> Math.random();
        Stream<Double> randomNumbers = Stream.generate(ran);

        // A function so that we get only a number from 1 - 100
        Function<Double, Long> dblround = d -> Math.round(d*100);

        // A function so that we only get even numbers
        Predicate<Long> longEqual = rannum -> rannum % 2==0;

        // A function, so that we only get up to 12 numbers
        Stream<Long> ranLong = randomNumbers.map(dblround).filter(longEqual).limit(12);

        // A converter to get either a sum or avrg out of the different methods
        DoubleStream randbl = ranLong.mapToDouble(d -> d);

        System.out.println("Sum: " + randbl.sum());
        System.out.println("Average: " + randbl.average());
    }
}
