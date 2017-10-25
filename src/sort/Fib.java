package sort;

public class Fib {

	public static int Fibs(int i){
		if(i<2){
			return i==0?0:1;
		}
		return Fibs(i-1)+Fibs(i-2);
	}
	
	public static void main(String args[]){
		for(int i=0;i<40;i++){
			System.out.print(Fibs(i)+" ");
		}
	}
}
