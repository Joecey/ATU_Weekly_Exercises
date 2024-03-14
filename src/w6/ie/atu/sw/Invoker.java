package w6.ie.atu.sw;

public class Invoker {
    public double invoke (char s){
        return  s * 12.0d;
    }

    public static void main(String[] args) {
        Invoker inv = new Invoker();
        double identifier = inv.invoke('A');
        System.out.println(identifier);
    }
}
