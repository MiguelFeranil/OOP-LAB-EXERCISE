package inheritance;

public class Cat implements PetSpecific{

    @Override
    public String communicate() {
        return "Meow. meow!";
    }
}
