package he;

public class AandB {

	public static void main(String[] args) {
	
		int a=4;
		int b=5;
	    int and = (a & b);//and��ʾ�Ƿ���Ҫ��λ 
	    //and=0��ʾ����λ��0&0=0��0&1=0��1&0=0��
	    //and=1��ʾ��λ��1&1=1
	    int xor = (a ^ b);
	    //�������λ��ֱ�Ӱ�λ�������
	            
	    while(and != 0){
	    	and =and<<1;
	    	//����һλ��ʾ��λ
	        int tmp = xor;
	        xor = (and ^ xor);
	        //and��ʮλ��xorΪ��λ���ٰ�λ���
	        and = (and & tmp);
	        //�ٴμ���Ƿ���Ҫ��λ
	        }
	    System.out.println(xor);
	    }
	
	        
	    
	

}
