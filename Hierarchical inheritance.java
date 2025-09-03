
HIERARCHICAL:
package com.sample;

class Animalss

{

	void eat()

	{

		System.out.println("this animal eats:");

	}

}

class Dogss extends Animalss

{

	void barks()

	{

		System.out.println("the dog barks:");

	}

}

class Cat extends Animalss

{

	void meows()

	{

		System.out.println("the cat meows always :");

	}

}

class Cow extends Animalss

{

	void moo()

	{

		System.out.println("the dog says mooo:");

	}

}

public class HierarchicalInheritance {



	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Dogss d = new Dogss();

		d.eat();

		d.barks();

		Cat c = new Cat();

		c.eat();

		c.meows();

		Cow cow = new Cow();

		cow.eat();

		cow.moo();



	}



}
OUTPUT:
This Animal eats food
The dog barks
This Animal eats food
Tha cat meows
This Animal eats food
The cow moos

