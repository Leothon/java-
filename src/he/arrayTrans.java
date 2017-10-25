package he;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class arrayTrans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] a=new int[n];
		int y=0;
		int num=0;
		boolean is=true;
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
		}
		Arrays.sort(a);
		int[] b=new int[n];
		for(int j=0;j<n;j++){
			b[n-1-j]=a[j];
		}
		for(int k=0;k<n;k++){
			for(int l=0;l<n;l++){
				if(k<l&&b[k]!=b[l]){
					y=b[k]%b[l];
					num=b[k]/b[l];
					//System.out.println(y);
					//System.out.println(num);
					if(y!=0||num%2!=0){
						is=false;
					}
				}
			}
		}
		if(is==true){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
		
	}

}
