public class ZeroOneTwoArgument {
    public interface ZeroArgument {
        public void myFunc();
    }

    public interface OneArgument {
        public void myFunc(String str);
    }

    public interface TwoArgument {
        public int myFunc (int a, int b);
    }

    public static void printZero(ZeroOneTwoArgument.ZeroArgument z0) {
        z0.myFunc();
    }

    public interface OneArgumentAsParamater {
        void aFunction(ZeroOneTwoArgument.OneArgument arg);
    }

    public static void main(String[] args) {
        ZeroOneTwoArgument.ZeroArgument z = () -> System.out.println("Hello I am interface");
        printZero(z);

        ZeroOneTwoArgument.OneArgument out = (str) -> System.out.println(str);
        out.myFunc("Hej");

        ZeroOneTwoArgument.TwoArgument two = (x, y) -> x+y;
        int il = two.myFunc(5,6);
        System.out.println("i1=" + il);

        ZeroOneTwoArgument.TwoArgument twomult = (x, y) -> x*y;
        int i2 = twomult.myFunc(4,5);
        System.out.println("i2=" + 12);

        ZeroOneTwoArgument.OneArgumentAsParamater argument = (arg) -> arg.myFunc("Hej");
        argument.aFunction(out);
    }
}