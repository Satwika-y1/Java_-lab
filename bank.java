package com.sample;



class Rbibank

{

	public double getrateofinterest()

	{

		return 5.0;

	}

	public int specialfeature()

	{

		return 23;

		

		//System.out.println("special feature is available:");

	}

}

class SBI extends Rbibank

{

	//overriding:polymorphism

	public double getrateofinterest()

	{

		return 6.5;

	}

}

class ICIC extends Rbibank

{

	//overriding concept

	public double getrateofinterest()

	{

		

		return 7.5;

		

	}

	public int specialfeature()

	{

		return 2;

		//System.out.println("this is a special feature:");

	

	}

}

//@overriding keyword:

public class Bank {



	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Rbibank rb = new Rbibank();

		Rbibank rb1 = new SBI();//upcasting

		Rbibank rb2 = new ICIC();

		SBI s = new SBI();

		ICIC ic = new ICIC();

		s.getrateofinterest();

		System.out.println("RBI bank rate of interest is"+rb.getrateofinterest());

		System.out.println("SBI bank rate of interest is"+s.getrateofinterest());

		System.out.println("ICIC bank rate of interest is"+ic.getrateofinterest());

		System.out.println("new sbi bank rate of interest is"+rb1.getrateofinterest());

		System.out.println("new icic bank feature is  is"+ rb2.specialfeature());//error because it is not overrding

		//System.out.print("New ICIC bank feature is: ");

	    //rb2.specialfeature(); 

	}

}

