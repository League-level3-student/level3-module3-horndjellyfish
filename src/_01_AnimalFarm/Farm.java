package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm {
	public static void main(String [] args) {
		ArrayList<Animal> farm = new ArrayList<>();
		Pig p = new Pig();
		farm.add(p);
		Cow c = new Cow();
		farm.add(c);
		Chicken ch = new Chicken();
		farm.add(ch);
		Goat g = new Goat();
		farm.add(g);
		Pig peppa = new Pig();
		farm.add(peppa);
		Cow daisy = new Cow();
		farm.add(daisy);
		for (Animal a : farm) {
			a.eat();
		}
	}
}
