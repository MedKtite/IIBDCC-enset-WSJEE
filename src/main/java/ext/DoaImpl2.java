package ext;

import doa.IDoa;

public class DoaImpl2 implements IDoa {
    @Override
    public double getData() {
         System.out.println("Version Capteur");
         double temp=80;
         return temp;
    }
}

