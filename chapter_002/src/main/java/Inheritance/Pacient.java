package Inheritance;
public class Pacient extends Persona {

    boolean Sportsman;
    String HealthLevel;

    public Pacient(String name, String surname, String age, boolean sportsman, String healthLevel) {
        super(name, surname, age);
        Sportsman = sportsman;
        HealthLevel = healthLevel;
    }

    public boolean isSportsman() {
        return Sportsman;
    }

    public void setSportsman(boolean sportsman) {
        Sportsman = sportsman;
    }

    public String getHealthLevel() {
        return HealthLevel;
    }

    public void setHealthLevel(String healthLevel) {
        HealthLevel = healthLevel;
    }
}
