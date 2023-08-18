import java.util.LinkedHashSet;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        LinkedHashSet<String> matches = new LinkedHashSet<>();
        matches.add("Real Madrid");
        matches.add("Barcelona");
        matches.add("Sevilla");
        matches.add("Athletico Madrid");
        matches.add("Athletic Bilbao");

        LinkedHashSet<String> firstMatches = new LinkedHashSet<>();
        LinkedHashSet<String> secondMatches = new LinkedHashSet<>();
        for (int i = 0; i < matches.size(); i++) {
            firstMatches.add((String) matches.toArray()[i]);
        }

        for (int i = 0; i < (matches.size()/2); i++) {
            int rand1 = random.nextInt(0, firstMatches.size());
            secondMatches.add((String) firstMatches.toArray()[rand1]);
            firstMatches.remove((String) firstMatches.toArray()[rand1]);

        }

        secondMatches.add(null);

        for (int i = 0; i < firstMatches.size(); i++) {
            if (secondMatches.toArray()[i] != null) {
                System.out.println(firstMatches.toArray()[i] + " vs " + secondMatches.toArray()[i]);
            }
            else {
                System.out.println(firstMatches.toArray()[i] + " vs " + "PASSED");
            }
        }
    }
}