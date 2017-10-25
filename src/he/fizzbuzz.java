package he;

import java.util.ArrayList;

public class fizzbuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n=15;
		ArrayList list=new ArrayList();
		for(int i=1;i<=n;i++){
			if(i%3==0&&i%5==0){
				list.add("fizz buzz");
			}else if(i%3==0){
				list.add("fizz");
			}else if(i%5==0){
				list.add("buzz");
			}else{
				list.add(String.valueOf(i));
			}
		}
		System.out.println(list);
		
	}

}
