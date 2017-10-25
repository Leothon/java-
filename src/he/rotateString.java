package he;

public class rotateString {

	
	public static void rotate(char[] str,int offset){
		
		if(offset==0||str==null||str.length==0){
			return;
		}
		
		offset=offset%str.length;
		
		for(int i=0;i<offset;i++){
			char last=str[str.length-1];
			//System.out.println(last);
			for(int j=str.length-1;j>=1;j--){
				str[j]=str[j-1];
			}
			str[0]=last;
			//System.out.println(str[0]);
		}
		
		for(int k=0;k<str.length;k++){
			System.out.print(str[k]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		char[] str="abcdefg".toCharArray();
		int offset=3;
		rotate(str,offset);
		
		
	}

}
