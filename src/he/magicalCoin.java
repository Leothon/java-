package he;

import java.util.Scanner;

public class magicalCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in =new Scanner(System.in);
		while(in.hasNext()){
			int coinCount=in.nextInt();
			StringBuilder str=new StringBuilder();
			while(coinCount>0){
				if(coinCount%2==0){
					coinCount=(coinCount-2)/2;
					str.append(2);
				}else{
					coinCount=(coinCount-1)/2;
					str.append(1);
				}
			}
			System.out.println(str.toString());
		}
	}

}
