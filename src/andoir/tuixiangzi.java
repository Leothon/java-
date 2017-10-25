package andoir;

import java.util.ArrayList;
import java.util.Scanner;

public class tuixiangzi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		int x=in.nextInt();
		ArrayList list1=new ArrayList();
		ArrayList list2=new ArrayList();
		for(int i=0;i<n;i++){
			list1.add(in.nextInt());
		}
		System.out.println(list1);
		for(int j=x;j<n;j--){
			int q=(int)list1.get(j-1)-1;
			list2.add(q);
			System.out.println(q);
		}
		System.out.println(list2);
		
	}

}
