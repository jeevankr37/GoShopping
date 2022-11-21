package com.tns.outer;
import com.tns.inner.ShopFactory;


public class GSShopFactory implements ShopFactory{
	@Override
	public GSPrimeAcc getNewPrimeAccount(int AccNo, String accNm, float charges, boolean isPrime) 
	{
		GSPrimeAcc gsp = new GSPrimeAcc();
		return gsp;
	}

	@Override
	public GSNormalAcc getNewNormalAccount(int AccNo, String accNm, float charges, float deliveryCharges) 
	{
		GSNormalAcc gsn = new GSNormalAcc(AccNo, accNm, deliveryCharges, deliveryCharges);
		return gsn;
	}
}