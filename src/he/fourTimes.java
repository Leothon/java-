package he;

import java.util.Scanner;

public class fourTimes {

	public static void main(String atsg[]){
		Scanner in= new Scanner(System.in);
		while(in.hasNext()){
			int t=in.nextInt();
			for(int i=0;i<t;i++){
				int n=in.nextInt();
				int cnt4=0;
				int cnt2=0;
				int cnt1=0;
				for(int j=0;j<n;j++){
					int x=in.nextInt();
					if(x%4==0){
						cnt4++;
					}else if(x%2==0){
						cnt2++;
					}else{
						cnt1++;
					}
				}
				if(cnt2==0){
					if(cnt4>=cnt1-1){
						System.out.println("yes");
					}else{
						System.out.println("no");
					}
				}else{
					if(cnt4>=cnt1){
						System.out.println("yes");
					}else{
						System.out.println("no");
					}
				}
				
			}
		}
	}
	
}
