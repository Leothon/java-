package he;


import java.util.Arrays;
import java.util.Scanner;

public class buyHat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int b=1;
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
		}
		
		Arrays.sort(a);
		
		for(int j=1;j<n;j++){
			if(a[j-1]<a[j]){
				b++;
			}
			if(b==3){
				System.out.println(a[j]);
				break;
			}
		}
		if(b<3){
			System.out.println(-1);
		}
	}

}
