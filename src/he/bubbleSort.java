package he;

public class bubbleSort {

	//思路：
	//1、写一个数组长度的循环，当循环第一个时，倒序循环数组。
	//2、倒序循环数组从倒数第二个开始，与第一个对比，如果前者小，则交换位置。
	//3、倒序循环到i停止，当循环第一个时，到第一个数停止，此时第一个数为最小值
	//4、当循环第二个时，倒序循环到第二个数停止，第二个数即是第二小的数
	//5、一直循环到最后一个，完成排序
	public static void sort(int[] a){
		int temp=0;
		for(int i=0;i<a.length;i++){
			for(int j=a.length-2;j>=i;j--){
				if(a[j]>a[j+1]){
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
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
