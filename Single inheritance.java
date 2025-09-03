package com.sample;

class Animal

{

	void eat()

	{

		System.out.println("this animal eats the food:");

	}

}

class Dog extends Animal

{

	void bark()

	{

		System.out.println("the dog barks:");

	}

}



public class SINGLEINHERITANCE {



	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Animal a = new Animal();

		Dog d = new Dog();

		a.eat();

		d.eat();

		d.bark();

		



	}



}

