package main;

import main.model.Robber;
import main.model.Vault;

import java.util.ArrayList;
import java.util.List;

public class ChapterExercise {
    private static List<Robber> robbers = new ArrayList<>();

    public static void main(String args[]) {
        int nRobbers = 4;
        int nVaults = 4;
        int[][] codes = new int[][]{
                {3, 2},
                {4, 1},
                {7, 6},
                {7, 1},
        };

        System.out.println(result(nRobbers, nVaults, codes));
    }

    public static int result(int nbrRobbers, int nbrVaults, int[][] codes) {
        for (int j = 0; j < nbrRobbers; j++) {
            robbers.add(new Robber());
        }

        for (int i = 0; i < nbrVaults; i++) {
            int nbrCharacters = codes[i][0];
            int nbrDigits = codes[i][1];

            Vault vault = new Vault(nbrCharacters, nbrDigits);
            robbers.get(0).addVault(vault);

            Robber.order(robbers);
        }

        return(robbers.get(robbers.size() - 1).timeOfWork());
    }
}