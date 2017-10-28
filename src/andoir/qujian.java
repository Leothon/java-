package andoir;

import java.util.Scanner;

public class qujian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
		}
		int count=1;
		if(n==1){
			System.out.println(1);
		}else{
			for(int j=1;j<n;j++){
				if(a[j]-a[j-1]!=1){
					count++;
				}
			}
			System.out.println(count);
		}
		
		
		
	}

}
