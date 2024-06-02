package w14.ie.atu.sw;

import java.io.*;
import java.util.Objects;

public class RunnerProcessFile {
    public static void main(String[] args) {
        String file;
        String key = "SpoobyKeykey";
        try {
            Vigenere v = new Vigenere(key);
            File folder = ResourceLoader.getResourceFiles();
            FileWriter out = new FileWriter("out.txt");
            for (File f : Objects.requireNonNull(folder.listFiles())) {
                file = f.toString();

                BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                String line = null;

                while((line = br.readLine()) != null){
                    if (line.length() > key.length()){
                        out.write(v.vigenereProcess(line.toUpperCase(),true) + "\n");
                    } else{
                        out.write("\n");
                    }
                }
                br.close();
                out.close();

            }

            // now perform decryption
            String processedFile = ("./out.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(processedFile)));
            FileWriter outNew = new FileWriter("outOG.txt");
            String line = null;

            while((line = br.readLine()) != null){
                if (line.length() > key.length()){
                    outNew.write(v.vigenereProcess(line.toUpperCase(),false) + "\n");
                } else{
                    outNew.write("\n");
                }
            }
            br.close();
            outNew.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
