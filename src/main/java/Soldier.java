import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Soldier {
    private int rank;
    private String name;

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Soldier(int rank, String name) {
        this.rank = rank;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Soldier{" +
                "rank=" + rank +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<Soldier> soliders = new ArrayList<>();
        soliders.add(new Soldier(4,"Jens"));
        soliders.add(new Soldier(4,"Jens1"));
        soliders.add(new Soldier(3,"Jens2"));
        soliders.add(new Soldier(1,"Ole"));
        soliders.add(new Soldier(5,"Kurt"));

        soliders.forEach(s -> System.out.println(s));

        System.out.println("-----------------------------");
        System.out.println("These are the soldiers ranked higher than the number 3:");

        Predicate<Soldier> isHighRanked = soldier -> soldier.getRank()>3;
        Stream<Soldier> highSoldiers = soliders.stream().filter(isHighRanked);

        highSoldiers.forEach(s -> System.out.println(s));

        System.out.println("---------------------------------");
        System.out.println("All the soldiers that start with the letter J");

        Predicate<Soldier> startsWithJ = s -> s.getName().startsWith("J");
        Stream<Soldier> highAndJ = soliders.stream().filter(isHighRanked).filter(startsWithJ);
        highAndJ.forEach(s -> System.out.println(s));



    }
}
