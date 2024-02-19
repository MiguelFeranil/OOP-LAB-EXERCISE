package inheritance;

public class TestPet {

    public static void main (String[] args) {

        Pet dog = new Pet("P001" , "Bantay", new Dog());

        //display dog
        System.out.println("My pet is " + dog.getSpecific().getClass().getSimpleName());
        System.out.println("Pet name is " + dog.getPetName() + " with petID " + dog.getPetID() );
        System.out.println("Pet communicates with " + dog.getSpecific().communicate());

        //make use of the setter
        Pet cat = new Pet();

        cat.setPetID("P002");
        cat.setPetName("Muning");
        cat.setSpecific(new Cat());

        System.out.println("\nMy pet is " + cat.getSpecific().getClass().getSimpleName());
        System.out.println("Pet name is " + cat.getPetName() + " with petID " + cat.getPetID() );
        System.out.println("Pet communicates with " + cat.getSpecific().communicate());

    }
}


