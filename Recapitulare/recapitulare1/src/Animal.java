class Animal {
    void cumFace() {
        System.out.println("Scoate un sunet!");
    }

    void ceMananca() {
        System.out.println("Animalele mananca ceva !");
    }
}

class Feline extends Animal {
    void cumFace() {
        System.out.println("Depinde de felina !");
    }

    void ceMananca() {
        System.out.println("Sunt carnivore!");
    }
}

class Pisica extends Feline {
    void ceMananca() {
        System.out.println("Mananca pesti!");
    }
}

class Caine extends Animal {
    void cumFace() {
        System.out.println("Cainele latra!");
    }
}
