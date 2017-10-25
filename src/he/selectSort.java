package he;

public class selectSort {

	//思路：
	//1、在数组中遍历，先把第一个数当作最小值。
	//2、循环第一个数之外的其他数，得到最小的数，并把最小的数下标标记为min.
	//3、第2步循环中得到最小的数的下标，如果最小数是第一个数，保持不变，否则，交换这俩数。
	//4、遍历数组中第二个数，因为第一个数已经是最小的了。以后的数循环往复，一直循环到最后一个数
	public static void sort(int[] a){
		for(int i=0;i<a.length;i++){
			int min=i;
			for(int j=i+1;j<a.length;j++){
				if(a[min]>a[j]){
					min=j;
				}
			}
			
			if(min!=i){
				int temp=a[min];
				a[min]=a[i];
				a[i]=temp;
			}
		}
		
		
	}
	
	public static void main(String args[]){
		int[] a={4,8,6,2,1,5,9,6,3};
		sort(a);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}
