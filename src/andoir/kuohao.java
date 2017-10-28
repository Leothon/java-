package andoir;

import java.util.Scanner;

public class kuohao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		int n=str.length();
		String[] c=new String[n];
		for(int i=0;i<n;i++){
			c[i]=str.substring(i, i+1);
			
		}
		for(int j=0;j<n;j++){
				for(int l=j+1;l<n;l++){
					if(c[j].equals("(")){
						if(c[l].equals(")")){
							c[j]="1";
							c[l]="1";
							
						}
					}
			}
		}
		for(int q=0;q<n;q++){
			System.out.print(c[q]+" ");
		}
		
		int count=0;
		for(int q=0;q<n;q++){
			if(!c[q].equals("1")){
				count++;
			}
		}
		
		System.out.println(count);
	}

}
