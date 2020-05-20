package cz.vse.java;

public class Kalkulacka {
    private double a;
    private double b;
    private double vysledek;

    public double scitani (double a, double b) {
        return a + b;
    }

    public double odecitani (double a, double b) {
        return  a - b;
    }

    public double nasobeni (double a, double b) {
        return  a * b;
    }

    public String deleni (double a, double b) {
        if (b == 0) {
            return "Dělení nulou není definováno";
        } else
            return String.valueOf(a / b);
    }

    public double umocnovani (double a, double b) {
        return Math.pow(a, b);
    }
}
