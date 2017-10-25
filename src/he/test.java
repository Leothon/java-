package he;

import java.util.ArrayList;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int g=0;
		int n=85963214;
		int s=0;
		ArrayList list=new ArrayList();
		
		do{
			g=n%10;
			s=n/10;
			n=s;
			list.add(g);
		}while(s!=0);
		System.out.println(list);
		int[] a=new int[list.size()];
		for(int i=0;i<list.size();i++){
			a[i]=(int) list.get(i);
			System.out.print(a[i]+" ");
		}
	}

}
