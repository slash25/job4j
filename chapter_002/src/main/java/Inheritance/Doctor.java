package Inheritance;

public class Doctor extends Profession {
   private Diagnose someDiagnose;
    public Doctor(String typeOfProfession, Diagnose someDiagnose) {
        super(typeOfProfession);
        this.someDiagnose = someDiagnose;
    }

    public  Diagnose heal(Pacient pacient) {
       return null;
    }
}
