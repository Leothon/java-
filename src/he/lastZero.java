package he;

import java.math.BigInteger;

public class lastZero {

	public static void main(String args[]){
		long n=105;
		BigInteger result=new BigInteger("1");
		for(int i=1;i<=n;i++){
			BigInteger sn = new BigInteger(Integer.toString(i));
			result=result.multiply(sn);
		}
		
		int count=0;
		BigInteger y=new BigInteger("0");
		BigInteger ten=new BigInteger("10");
		y=result.mod(ten);
		BigInteger zero=new BigInteger("0");
		BigInteger z=new BigInteger("0");
		while(y.equals(zero)){
			y=result.mod(ten);
			z=result.divide(ten);
			//System.out.println(z);
			if(y.equals(zero)){
				count++;
			}
			result=z;
		}
		System.out.println(count);
	}
}
