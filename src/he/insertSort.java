package he;

public class insertSort {

	//思路：
	//1、从第二个数开始循环，把当前的数作为标记
	//2、如果他前面的数小于标记，保持原状，反之，将该数后移一位
	//3、循环，标记前面的第二个数，小于标记保持原状，反之，将该数继续后移，直到前面无数
	//4、将标记放到查到正确位置
	//
	public static void sort(int[] a){
		for(int i=1;i<a.length;i++){
			int temp=a[i];//把一个数拿出
			int j=i-1;
			for(;j>=0&&a[j]>temp;j--){
				a[j+1]=a[j];//与他前面的所有数对比，大于这个数的往后移，直到前面没有数j>=0或者前面的数小于这个数
			}
			a[j+1]=temp;//此时j的值为所有小于temp的值的下标+1，把拿出的数插进去。
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a={49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};
		sort(a);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}

}
