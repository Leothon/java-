package he;

import java.util.Scanner;

public class stringEq {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scanner in=new Scanner(System.in);
		//while(in.hasNextLine()){
			//String a=in.nextLine();
			//String b=in.nextLine();
			String a="word";
			String b="word";
			int [][]dp=new int[a.length()+1][b.length()+1];
			int maxlen=0;
			for(int i=1;i<=a.length();i++){
				for(int j=1;j<=b.length();j++){
					if(a.charAt(i-1)==b.charAt(j-1)){
						dp[i][j]=dp[i-1][j-1]+1;
					}
					maxlen=Math.max(maxlen, dp[i][j]);
				}
			}
			System.out.println(maxlen);
		}
		
		
	//}

}
