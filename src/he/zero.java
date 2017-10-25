package he;

public class zero {

	public static void main(String args[]){
		int n=105;
        long i = 5;
        long res = 0;
 
        for(; i <= n; i *= 5)
            res = res+n / i;
 
        System.out.println(res);
	}
}
