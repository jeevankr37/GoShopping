package com.tns.outer;

import com.tns.inner.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc {

	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
		// TODO Auto-generated constructor stub
	}

	//fields
	private static final float charges=0; 
	
	//methods
	public float getCharges() {
		return charges;
	}

	public GSPrimeAcc() 
	{
		super(accNo, accNm, charges, isPrime);
		// TODO Auto-generated constructor stub
	}
	
	public void bookProduct(float charges)
	{
		System.out.println("Hi Prime User, Your Product Charges are: "+charges);
	}

	
	
	@Override
	public String toString() {
		return "GSPrime Account Details :-\nAccount Number-\t\t"+accNo+"\nAccount holder Name-\t"+getAccNm()+"\nDelivery charges\t"+charges;
	}
}