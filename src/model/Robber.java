package model;

import java.util.ArrayList;
import java.util.List;

public class Robber {

    private List<Vault> vaults;

    public Robber(){
        this.vaults = new ArrayList<>();
    }

    public void addVault(Vault vault){
        vaults.add(vault);
    }

    public int getVaults() {
        return this.vaults.size();
    }

    public int timeOfWork() {
        int sum = 0;
        for(Vault v : vaults) {
            sum += v.getNbrCombinations();
        }
        return sum;
    }
}