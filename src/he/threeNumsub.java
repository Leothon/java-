package he;

import java.util.Scanner;

public class threeNumsub {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		long[] a=new long[n];
		
		for(int i=0;i<n;i++){
			a[i]=in.nextLong();
		}
		
		long max1=0,max2=0,max3=0,min1=0,min2=0;
		
		for(int j=0;j<n;j++){
			if(a[j]!=0){
				if(a[j]>max1){
					max3=max2;
					max2=max1;
					max1=a[j];
				}else if(a[j]>max2){
					max3=max2;
					max2=a[j];
				}else if(a[j]>max3){
					max3=a[j];
				}else if(a[j]<min1){
					min2=min1;
					min1=a[j];
				}else if(a[j]<min2&&a[j]>min1){
					min2=a[j];
				}
			}else continue;
			

		}
		long max=Math.max(max1*max2*max3, min1*min2*max1);
		System.out.println(max);
		
	}

}
