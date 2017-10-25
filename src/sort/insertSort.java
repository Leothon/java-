package sort;

import java.util.Scanner;

public class insertSort {

	int a[]={26,46,468,48,99,563,684,26,875,19,4457,221,486,8513};
	public insertSort(){
	
		
		int temp=0;
		for(int i=1;i<a.length;i++){
			int j=i-1;
			temp=a[i];
			for(;j>=0&&temp<a[j];j--){
				a[j+1]=a[j];
			}
			a[j+1]=temp;
		}
		
		for(int i=1;i<a.length;i++){
			System.out.print(a[i]+"   ");
		}
	}

	public static void main(String args[]){
		new insertSort();
	}
}
