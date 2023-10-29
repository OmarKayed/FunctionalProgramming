import java.util.Arrays;
import java.util.List;

public class Valuta {
    static int sumTwoArgFunction(List<Integer> list, ZeroOneTwoArgument.TwoArgument two) {
        int sum = 0;
        for (int t : list) {
            sum += two.myFunc(t, t);
        }
        return sum;
    }

    static int valutaomregner(List<Integer> list, ZeroOneTwoArgument.TwoArgument two, int kurs) {
        int sum = 0;
        for (int t : list) {
            sum += two.myFunc(t, kurs);
        }
        return sum;
    };


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        ZeroOneTwoArgument.TwoArgument twoplus = (x, y) -> x + y;
        int ss = sumTwoArgFunction(list, twoplus);
        System.out.println(ss);

        ZeroOneTwoArgument.TwoArgument twomult = (x, y) -> x * y;
        ss = sumTwoArgFunction(list, twomult);
        System.out.println(ss);

        //Opret en liste af dollarsedler
        List<Integer> dollarSedler = Arrays.asList(1,5,10);
        int pengedk = valutaomregner(dollarSedler, twomult, 6);
        System.out.println("du har dk = " + pengedk);
    }
}
