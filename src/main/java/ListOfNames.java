import java.util.List;

public class ListOfNames {
    public static void main(String[] args) {
        List<String> names = List.of("Omar","Ebbe","Hviid");

        names.forEach(System.out::println);
    }
}
