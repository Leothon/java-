package he;

import java.util.Scanner;

public class mazeQues {

	static int LineX,LineY;
	static int StartX,StartY;
	static String[][] arr;
	static int count=10000;
	public static void setStart(String a,int x,int y){
		if(a.equals("S")){
			StartX=x;
			StartY=y;
		}
	}
	
	public static void run(int x,int y,int n){
		//��������ƶ����Ҹõ���Χ��G�㣬������ֱ����G�������·����
		if(y-1>=0&&arr[x][y-1].equals("G")){
			run(x,y-1,n+1);
		}
		if(x-1>=0&&arr[x-1][y].equals("G")){
			run(x-1,y,n+1);
		}
		if(y+1<LineY&&arr[x][y+1].equals("G")){
			run(x,y+1,n+1);
		}
		if(x+1<LineX&&arr[x+1][y].equals("G")){
			run(x+1,y,n+1);
		}
		//����õ���Χ����G�㣬�жϸõ��Ƿ���G�㣬�ǣ�������ٲ�
		if(arr[x][y].equals("G")){
			if(n<count){
				count=n;
			}
			return;
		}
		//�õ��߹������Ϊ*
		arr[x][y]="*";
		//����õ㲻��G�㣬������ΧҲû��G�㣬�������ƶ����Ҹõ���Χ��.������ֱ����Χ��·����
		if(y-1>=0&&arr[x][y-1].equals(".")){
			run(x,y-1,n+1);
		}
		if(x-1>=0&&arr[x-1][y].equals(".")){
			run(x-1,y,n+1);
		}
		if(y+1<LineY&&arr[x][y+1].equals(".")){
			run(x,y+1,n+1);
		}
		if(x+1<LineX&&arr[x+1][y].equals(".")){
			run(x+1,y,n+1);
		}
		//����õ���·�����������ˣ��򽫸õ�����Ϊ.
		arr[x][y]=".";
		return;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		LineX=Integer.parseInt(in.next());
		LineY=Integer.parseInt(in.next());
		arr=new String[LineX][LineY];
		for(int i=0;i<LineX;i++){
			String str=in.next();
			for(int j=0;j<LineY-1;j++){
				arr[i][j]=str.substring(j, j+1);
				setStart(str.substring(j,j+1),i,j);
			}
			arr[i][LineY-1]=str.substring(LineY-1);
			setStart(str.substring(LineY-1),i,LineY-1);
		}
		run(StartX,StartY,0);
		if(count==10000){
			System.out.println("û�г���");
		}else{
			System.out.println("������Ҫ"+count+"��");
		}
	}

}
