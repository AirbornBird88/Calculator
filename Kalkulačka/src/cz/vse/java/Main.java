package cz.vse.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Kalkulacka kalkulacka = new Kalkulacka();
        System.out.println(kalkulacka.scitani(80, 30));
        System.out.println(kalkulacka.odecitani(50,80));
        System.out.println(kalkulacka.nasobeni(80,30));
        System.out.println(kalkulacka.deleni(50, 5));
        System.out.print(kalkulacka.umocnovani(5, 30));
    }
}
