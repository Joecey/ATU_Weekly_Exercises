package w6.ie.atu.sw;

public class NLines {
    private NLines (){};
    public static void createNLines (int lines){
        if (lines == 0){
            return;
        } else {
            System.out.println("");
            createNLines(lines - 1);
        }
    }
}
