package he;

import java.util.Scanner;

public class opposite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		Scanner in=new Scanner(System.in);
		String str=new String(in.nextLine());
		
		StringBuilder str1=new StringBuilder(str).reverse();
		//System.out.println(str1.toString());
		String str2=str1.toString();
		System.out.println(Integer.parseInt(str2)+Integer.parseInt(str));
	}

}
