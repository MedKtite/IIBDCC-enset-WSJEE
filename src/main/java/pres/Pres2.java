package pres;

import doa.IDoa;
import metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("config.txt"));
        String doaClassName=scanner.nextLine();
        Class cDoa = Class.forName(doaClassName);
        IDoa doa=(IDoa) cDoa.newInstance();


        String metierClassName=scanner.nextLine();
        Class cMetier=Class.forName(metierClassName);
        IMetier metier=(IMetier) cMetier.newInstance();

        Method method=cMetier.getMethod("setDoa", IDoa.class);
        method.invoke(metier,doa);

        System.out.println("Resultat=>"+metier.calcul());
    }
}
