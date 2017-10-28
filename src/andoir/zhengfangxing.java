package andoir;

import java.util.Arrays;
import java.util.Scanner;

public class zhengfangxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		int [] a=new int[4];
		for(int i=0;i<4;i++){
			a[i]=in.nextInt();
		}
		
		Arrays.sort(a);
		
		int len=a[1];
		int count=0;
		for(int j=0;j<4;j++){
			count+=Math.abs(len-a[j]);
		}
		System.out.println(count);
	}

}
