package he;

import java.util.Scanner;

public class fragmentlength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in=new Scanner(System.in);
		 String str=new String(in.nextLine());
		 int count=0;
		 char[] a=new char[str.length()+1];
		 for(int i=0;i<str.length();i++){
			 a[i]=str.charAt(i);//将str中字符串放入数组
		 }
		 for(int j=0;j<str.length();j++){
			 if(a[j]!=a[j+1]){
				 count++;
			 }
		 }
		 
		 double num=(double)str.length()/count;
		 System.out.println(num);
		 //System.out.println(String.format("%.2f", num));
}
	}

