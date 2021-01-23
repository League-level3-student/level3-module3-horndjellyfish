package _01_AnimalFarm;

abstract class Animal {

    abstract void makeNoise();

    public void eat() {
        System.out.println("I am eating.");
        makeNoise();
    }

}

class Pig extends Animal {
    @Override
    void makeNoise() {
    	System.out.println("Oink!");
    }
}

class Cow extends Animal {
    @Override
    void makeNoise() {
		System.out.println("Moo!");
    }
}

class Chicken extends Animal {
    @Override
    void makeNoise() {
		System.out.println("Bok bok!");

    }
}

class Goat extends Animal {
    @Override
    void makeNoise() {
		System.out.println("Baaaa!");
    }
}

