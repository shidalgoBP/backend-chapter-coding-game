import model.Robber;
import model.Vault;

import java.util.*;

public class ChapterExercise {
    private static List<Robber> robbers = new ArrayList<>();

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int nbrRobbers = in.nextInt();
        int nbrVaults = in.nextInt();

        for (int j = 0; j < nbrRobbers; j++) {
            robbers.add(new Robber());
        }

        for (int i = 0; i < nbrVaults; i++) {
            int nbrCharacters = in.nextInt();
            int nbrDigits = in.nextInt();

            Vault vault = new Vault(nbrCharacters, nbrDigits);
            robbers.get(0).addVault(vault);
            robbers.sort(Comparator.comparingInt(Robber::timeOfWork));
        }

        System.out.println(robbers.get(robbers.size() - 1).timeOfWork());
    }
}