package he;

import java.util.Scanner;

public class hanoi {

	static int i=1;
	public static void move(int n,char from,char to){
		//System.out.println("第"+i+"步,把"+n+"号盘子从"+from+"移动到"+to);
		i++;
	}

	public static void hano(int n,char from,char denpend,char to){
		if(n==1){
			move(1,from,to);
		}else{
			hano(n-1,from,to,denpend);
			move(n,from,to);
			hano(n-1,denpend,from,to);
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("输入盘子个数:");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		char x='A';
		char y='B';
		char z='C';
		hano(n,x,y,z);
		System.out.println(i);
		
	}

}
