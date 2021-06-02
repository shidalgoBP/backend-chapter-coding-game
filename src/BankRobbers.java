import java.util.*;

public class BankRobbers {
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

    static class Robber {

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

    static class Vault {
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
}