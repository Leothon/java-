package he;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class kuohaoList {

	public static void main(String args[]){
		int min=0;
		int secmin=0;
		int thrmin=0;

		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			int n=in.nextInt();
			ArrayList<String>  list=new ArrayList();  
			int [] a=new int[n];
			for(int i=0;i<n;i++){
				a[i]=in.nextInt(n);
			}
			try{
				for(int q=0;q<3;q++){
					min=a[0];
					for(int i=1;i<a.length;i++){
						if(a[i]<min){
							min=a[i];
						}
						System.out.print(a[i]+" ");
					}
					
		
					for(int k=0;k<n;k++){
						if(a[k]!=min){
							String str=Integer.toString(a[k]);
							list.add(str);
							
						}
						
					}
					System.out.print(list+" ");
					int [] b=new int[list.size()];
					for(int l=0;l<list.size();l++){
						b[l]=Integer.parseInt(list.get(l));
						System.out.print(b[l]+" ");
					}
					System.out.println();
					a=b;
					n=list.size();
					list.removeAll(list);
		
				}
				System.out.println(min);
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println(-1);
				
			}
	
			
			
		}
	}
	
}
