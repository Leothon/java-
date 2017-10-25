package andoir;

import java.util.Scanner;

public class Mian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Ox=0;
		int Oy=0;
		int Ex=0;
		int Ey=0;
		int Sx=0;
		int Sy=0;
		int so=0;
		int oe=0;
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		String[][]a=new String[n][m];
		
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				a[i][j]=in.nextLine();
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(a[i][j].equals("0")){
					Ox=i;
					Oy=j;
				}
				if(a[i][j].equals("E")){
					Ex=i;
					Ey=j;
				}
				if(a[i][j].equals("S")){
					Sx=i;
					Sy=j;
				}
			}
		}
		
		if(Ey>Oy){
			so=Math.abs(Oy-1-Sy)+Math.abs(Ox-Sx);
			
		}
	}

}
