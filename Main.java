class Animal {
    public void emitirSom() {
        System.out.println("Som genérico de animal");
    }

    // Sobrecarga
    public void emitirSom(int volume) {
        System.out.println("Som genérico de animal com volume " + volume);
    }
}

class Cachorro extends Animal {
    // Sobrescrita: método emitirSom() sobrescreve o método da classe Animal
    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }
}

class Gato extends Animal {
    // Sobrescrita: método emitirSom() sobrescreve o método da classe Animal
    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal[] animais = {new Cachorro(), new Gato()};

        // Sobrescrita
        for (Animal animal : animais) {
            animal.emitirSom();
        }

        // Sobrecarga
        Animal animal = new Animal();
        animal.emitirSom(10);
    }
}
