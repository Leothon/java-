package he;

import java.util.Arrays;

public class mergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a={1,2,3,4};
		int [] b={2,4,5,6};
		int q=0;
		int len=a.length+b.length;
		int[] array=new int[len];
		for(int i=0;i<a.length;i++){
			array[i]=a[i];
		}
		for(int j=a.length;j<len;j++){
			array[j]=b[q];
			q++;
		}
	
		Arrays.sort(array);
		
	}

}
