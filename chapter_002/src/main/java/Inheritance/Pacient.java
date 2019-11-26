package Inheritance;
public class Pacient extends Persona  {
   private boolean sportsman;
   private String healthLevel;

    public Pacient(String name, String surname, String age, boolean sportsman, String healthLevel) {
        super(name, surname, age);
        this.sportsman = sportsman;
        this.healthLevel = healthLevel;
    }

    public boolean isSportsman() {
        return sportsman;
    }

    public void setSportsman(boolean sportsman) {
        this.sportsman = sportsman;
    }

    public String getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(String healthLevel) {
        this.healthLevel = healthLevel;
    }
}
