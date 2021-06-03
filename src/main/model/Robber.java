package main.model;

import java.util.ArrayList;
import java.util.List;

public class Robber implements Comparable<Robber> {

    private List<Vault> vaults;

    public Robber(){
        this.vaults = new ArrayList<>();
    }

    public void addVault(Vault vault){
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