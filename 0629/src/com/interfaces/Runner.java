package com.interfaces;

public class Runner {
	public static void main(String[] args) {
		Flyable[] flyingObjects = { new Bird(), new Aeroplane() };
		for (Flyable flyingObject : flyingObjects) {
			flyingObject.fly();
		}

		Animal[] animals = {new Cat(), new Dog()};
		for (Animal animal : animals) {
			animal.bark();
		}

	}
}
