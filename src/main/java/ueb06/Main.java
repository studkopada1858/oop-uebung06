package ueb06;

public class Main {
    public static void main (String[] args){
        Baum<Integer> t = new Baum<>();
        t.addRek(2);
        t.addRek(24);
        t.addRek(1);
        System.out.println(t.containsRek(2)+""+t.containsRek(1) );

    }
}
