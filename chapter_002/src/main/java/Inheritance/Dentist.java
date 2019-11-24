package Inheritance;

public class Dentist extends Doctor {
    public Dentist(String typeOfProfession, Diagnose someDiagnose) {
        super(typeOfProfession, someDiagnose);
    }

    public Operation makeOperationTooth(Pacient pacient){
        return null;
    }
}
