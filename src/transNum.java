import java.util.ArrayList;
import java.util.Scanner;

public class transNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int g=0;
		int s=0;
		int z=1;
		int count=0;
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		if(n<10){
			System.out.println(0);
		}else{
			do{
				do{
					g=n%10;
					s=n/10;
					n=s;
					z=z*g;
				}while(s!=0);
				n=z;
				count++;
				z=1;
			}while(n/10!=0);
			System.out.println(count);
		}
		
	}
}
