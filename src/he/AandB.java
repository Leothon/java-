package he;

public class AandB {

	public static void main(String[] args) {
	
		int a=4;
		int b=5;
	    int and = (a & b);//and表示是否需要进位 
	    //and=0表示不进位，0&0=0，0&1=0，1&0=0。
	    //and=1表示进位，1&1=1
	    int xor = (a ^ b);
	    //如果不进位，直接按位异或运算
	            
	    while(and != 0){
	    	and =and<<1;
	    	//左移一位表示进位
	        int tmp = xor;
	        xor = (and ^ xor);
	        //and是十位，xor为个位，再按位异或
	        and = (and & tmp);
	        //再次检测是否需要进位
	        }
	    System.out.println(xor);
	    }
	
	        
	    
	

}
