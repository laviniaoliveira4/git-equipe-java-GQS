import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal> animais = new ArrayList<>();

        animais.add(new Cachorro("Rex", 5, "Labrador"));
        animais.add(new Gato("Mimi", 3, "Persa"));

        for (Animal animal : animais) {
            System.out.println(animal);
            animal.emitirSom();
            System.out.println();
        }
    }
}