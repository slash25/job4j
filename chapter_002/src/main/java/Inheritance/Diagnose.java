package Inheritance;

public class Diagnose extends Doctor {

    public String getLechenie() {
        return Lechenie;
    }

    public void setLechenie(String lechenie) {
        Lechenie = lechenie;
    }

    public Diagnose(String lechenie) {
        Lechenie = lechenie;
    }

    String Lechenie;

}
