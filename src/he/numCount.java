package he;

public class numCount {

   
	public static int digitCounts(int k, int n) {
            // write your code here
		
		long base=1;
		long ans=k==0?1:0;
		while(n>=base){
			long prefix=(long)n/base/10;
			long digit=(long)n/base%10;
			long suffix=(long)n%base;
			
			if(k>digit){
				ans+=prefix*base;
			}else if(k==digit){
				ans+=(k==0?(prefix-1)*base:prefix*base)+1+suffix;
			}else{
				ans+=k==0?prefix*base:(prefix+1)*base;
			}
			base*=10;
		}
		return (int) ans;
	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(digitCounts(1,12));
		
	}

}
