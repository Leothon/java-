package he;

import java.util.ArrayList;
import java.util.Scanner;

public class isMagicnum {

	public static boolean issushu(int a){
		boolean sushu=true;
		for(int i=2;i<a;i++){
			if(a%i==0){
				sushu=false;
			}
		}
		return sushu;
	}

	
	public static   boolean isMagic(int a){
		int g=0;
		int n=a;
		int s=0;
		int num=0;
		boolean magic=false;
		ArrayList list=new ArrayList();
		do{
			g=n%10;
			s=n/10;
			n=s;
			list.add(g);
		}while(s!=0);
		int[] b=new int[list.size()];
		for(int i=0;i<list.size();i++){
			b[i]=(int) list.get(i);
		}
		//System.out.print(list);
		for(int k=0;k<b.length;k++){
			for(int l=0;l<b.length;l++){
				if(k!=l){
					num=b[k]*10+b[l];
					
					if(issushu(num)==true&&num/10!=0){
						magic=true;
					}
				}
				
			}
		}
		return magic;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		int l=in.nextInt();
		int r=in.nextInt();
		int len=r-l+1;
		int count=0;
		int[] a=new int[len];
		a[0]=l;
		for(int i=1;i<len;i++){
			a[i]=a[i-1]+1;
		}
		for(int j=0;j<len;j++){
			
			if(isMagic(a[j])==true){
				count++;
			}
		}
		System.out.println();
		System.out.println(count);
	}

}
