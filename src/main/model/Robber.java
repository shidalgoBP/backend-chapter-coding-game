package main.model;

import java.util.ArrayList;
import java.util.List;

public class Robber implements Comparable<Robber> {

    private List<Vault> vaults;

    public Robber() {
        this.vaults = new ArrayList<>();
    }

    public static void order(List<Robber> list) {
        Robber temp;
        boolean sorted = false;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i).compareTo(list.get(i + 1)) > 0) {
                    temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                    sorted = false;
                }
            }
        }
    }

    public void addVault(Vault vault) {
        vaults.add(vault);
    }

    public int timeOfWork() {
        int sum = 0;
        for (Vault v : vaults) {
            sum += v.getNbrCombinations();
        }
        return sum;
    }

    @Override
    public int compareTo(Robber robber) {
        int res = 0;
        if (this.timeOfWork() < robber.timeOfWork()) {
            res = -1;
        }
        if (this.timeOfWork() > robber.timeOfWork()) {
            res = 1;
        }
        return res;
    }
}