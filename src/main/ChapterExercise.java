package main;

import main.model.Robber;
import main.model.Vault;

import java.util.*;
import java.util.function.Supplier;

public class ChapterExercise {
    private static List<Robber> robbers = new ArrayList<>();

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        Supplier<Integer> supplier = () -> in.nextInt();

        int nbrRobbers = supplier.get();
        int nbrVaults = supplier.get();

        for (int j = 0; j < nbrRobbers; j++) {
            robbers.add(new Robber());
        }

        for (int i = 0; i < nbrVaults; i++) {
            int nbrCharacters = in.nextInt();
            int nbrDigits = in.nextInt();

            Vault vault = new Vault(nbrCharacters, nbrDigits);
            robbers.get(0).addVault(vault);

            order(robbers);
        }

        System.out.println(robbers.get(robbers.size() - 1).timeOfWork());
    }

    private static void order(List<Robber> list) {
        Robber temp;
        boolean sorted = false;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < list.size()-1; i++) {
                if (list.get(i).compareTo(list.get(i + 1)) > 0) {
                    temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                    sorted = false;
                }
            }
        }
    }
}