package w13.ie.atu.sw;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Ceasar Cypher");
        // create a new Cypher
        // First encrypt
        CeasarCypher cc = new CeasarCypher(10);
        String encrypted = cc.encrypt("We found the mystery behind Victoria's Secret");
        System.out.println(encrypted);
        System.out.println(cc.decrypt(encrypted));

        System.out.println("\n Custom String Builder");
        CustomStringBuilder ssb = new CustomStringBuilder("THEQUICKBROWNMFOXJUMPED");
        ssb.append("OVERTHELAZYDOGS");
        System.out.println(ssb.toString());
        System.out.println(ssb.reverse());

        System.out.println("\n NGram String Builder");
        System.out.println(Arrays.toString(NGram.NGramGenerator("Happy Days!", 8)));

        System.out.println("\n NGram String Builder Alt (Split into n's)");
        System.out.println(Arrays.toString(NGram.NGramGeneratorAlt("We are here for democracy!", 4)));
    }

}
