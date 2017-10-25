package he;

import java.util.ArrayList;

public class unglyNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int count=1;
		int i=2;
		int n=41;
		int num;
		if(n==1){
			num=1;
		}else if(n==2){
			num=2;
		}else{
			ArrayList list=new ArrayList();
			int len=list.size();
			while(len<=n-2){
				if(i%2==0||i%3==0||i%5==0){
					list.add(i);
				}
				i++;
				len=list.size();
				//count++;
			}
			System.out.println(list);
			num=(int)list.get(list.size()-1);
		}
		
		
		System.out.println(num);
	}

}
