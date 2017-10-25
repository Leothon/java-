package he;

import java.util.Arrays;

public class kPoints {

	public static Point[] kCloset(Point[] points,Point origin,int k){
		
		
		int len=points.length;
		int x=0;
		int y=0;
		int Ox=origin.getX();
		int Oy=origin.getY();
		Point[] point=new Point[3];
		Double [] a=new Double[len];
		for(int i=0;i<len;i++){
			x=points[i].getX();
			y=points[i].getY();
			a[i]=Math.hypot(x-Ox, y-Oy);
		}
		Double[] b=new Double[len];
		b=a;
		Arrays.sort(b);
		for(int j=0;j<3;j++){
			for(int q=0;q<len;q++){
				if(b[j].equals(a[q])){
					point[j]=points[q];
				}
			}
		}
		
		return point;
	}
	
	public static void main(String args[]){
		Point [] points=new Point[5];
		Point a1=new Point(4,6);
		points[0]=a1;
		Point a2=new Point(4,7);
		points[1]=a1;
		Point a3=new Point(4,4);
		points[2]=a1;
		Point a4=new Point(2,5);
		points[3]=a1;
		Point a5=new Point(1,1);
		points[4]=a1;
		
		Point origin=new Point(0,0);
		int k=3;
		System.out.print(kCloset(points,origin,k).toString());
	}
}








