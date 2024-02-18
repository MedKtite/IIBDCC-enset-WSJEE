package pres;

import doa.DoaImpl;
import ext.DoaImpl2;
import metier.MetierImpl;

public class Presentation {
    public static void main(String[] args) {
        DoaImpl2 doa=new DoaImpl2();
        MetierImpl metier=new MetierImpl();
        metier.setDoa(doa);
        System.out.println("Résultat"+metier.calcul());
    }
}
