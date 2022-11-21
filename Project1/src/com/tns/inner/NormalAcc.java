package com.tns.inner;

public class NormalAcc extends ShopAcc{
    
	protected static float deliveryCharge=99;
	
	
	
	public NormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
		super(accNo, accNm, charges);
		NormalAcc.deliveryCharge = deliveryCharge;
	}
	public void bookProduct(float deliveryCharge)
	{
		System.out.println("Charges are:"+deliveryCharge);
	}
	@Override
	public String toString() {
		return "NormalAcc Details:-\nAcount Number-\t" + getAccNo() + "\nAccount Name-\t"+accNm+"\ncharges-\t" + getCharges();
	}
	public float getDeliveryCharge() {
		return deliveryCharge;
	}
	
}