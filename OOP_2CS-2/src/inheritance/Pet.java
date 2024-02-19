package inheritance;

public class Pet {
    private String petID;
    private String petName;

    public PetSpecific getSpecific() {
        return specific;
    }

    public void setSpecific(PetSpecific specific) {
        this.specific = specific;
    }
    public Pet(){

    }
    public Pet(String petID, String petName, PetSpecific specific){
        this.petID = petID;
        this.petName = petName;
        this.specific = specific;
    }

    private PetSpecific specific;

    public Pet(String petID, String petName) {
        this.petID = petID;
        this.petName = petName;
    }

    public String getPetID() {
        return petID;
    }

    public void setPetID(String petID) {
        this.petID = petID;
    }

    public String getPetName() {
        return petName;
    }
    public void setPetName(String petName) {
        this.petName = petName;
    }

}