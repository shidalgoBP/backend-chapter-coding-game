package main.model;

import lombok.Getter;

@Getter
public class Vault {
    private final int nbrCombinations;

    public Vault(int nbrCharacters, int nbrDigits){
        this.nbrCombinations = (int) (Math.pow(10, nbrDigits) * Math.pow(5, nbrCharacters - nbrDigits));
    }
}
