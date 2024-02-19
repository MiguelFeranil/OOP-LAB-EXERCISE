package inheritance;

public class Dog  implements PetSpecific {

    @Override
    public String communicate() {
        return "Aw, aw!";
    }
}
