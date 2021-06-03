package main.model;

public class Vault {
    private int nbrCombinations;

    public Vault(int nbrCharacters, int nbrDigits){
        this.nbrCombinations = (int) (Math.pow(10, nbrDigits) * Math.pow(5, nbrCharacters - nbrDigits));
    }

    public Vault(int nbrCombinations){
        this.nbrCombinations = nbrCombinations;
    }

    public int getNbrCombinations() {
        return nbrCombinations;
    }
}
