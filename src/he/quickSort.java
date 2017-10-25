package he;

import java.util.ArrayList;
import java.util.List;

public class quickSort {

	//思路：
	//1、选取一个枢轴，作为数组的中间值，然后把数组分为两部分，左边都比该数小，右边都比该数大，然后递归排序左边和右边
	//2、选取枢轴的方法编写。选取数组中开头的数为pivotKey，并把该值暂存在temp中
	//3、如果最右的数大于key值，则最右值前推一位，直到小于key值，跳出循环，把小的数替换到最左位置
	//4、如果最左的数小于Key值，则最左值后推一位，直到大于Key值，跳出循环，把大的数替换到最右位置
	//5、两边向中间推进，直到两个值相等跳出循环，把temp中的key值取出，赋值到最中间的地方，返回给枢轴。
	public static void sort(int[] a,int low,int high){
		int pivot;
		if(low<high){
			pivot=pivotition(a,low,high);
			sort(a,low,pivot-1);
			sort(a,pivot+1,high);
		}
	}
	
	public static int pivotition(int[] a,int low,int high){
		int pivotKey=a[low];
		int temp=pivotKey;
		while(low<high){
			while(low<high&&a[high]>pivotKey){
				high--;
			}
			a[low]=a[high];
			while(low<high&&a[low]<pivotKey){
				low++;
			}
			a[high]=a[low];
		}
		a[low]=temp;
		return low;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};
		sort(a,0,a.length-1);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}
