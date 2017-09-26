package test;

import napoj.napoj.Herbata;
import napoj.napoj.Kawa;

public class Bar {
    public static void main(String[] args) {
        Herbata herbata = new Herbata();
        Kawa kawa = new Kawa();

        herbata.recepturaParzenia();
        kawa.recepturaParzenia();
    }
}
