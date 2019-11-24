package Inheritance;

public class Surgeon extends Doctor {
    public Surgeon(String typeOfProfession, Diagnose someDiagnose) {
        super(typeOfProfession, someDiagnose);
    }
    public Operation makeOperation(Pacient pacient){
        return null;
    }
}
