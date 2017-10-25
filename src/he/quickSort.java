package he;

import java.util.ArrayList;
import java.util.List;

public class quickSort {

	//˼·��
	//1��ѡȡһ�����ᣬ��Ϊ������м�ֵ��Ȼ��������Ϊ�����֣���߶��ȸ���С���ұ߶��ȸ�����Ȼ��ݹ�������ߺ��ұ�
	//2��ѡȡ����ķ�����д��ѡȡ�����п�ͷ����ΪpivotKey�����Ѹ�ֵ�ݴ���temp��
	//3��������ҵ�������keyֵ��������ֵǰ��һλ��ֱ��С��keyֵ������ѭ������С�����滻������λ��
	//4������������С��Keyֵ��������ֵ����һλ��ֱ������Keyֵ������ѭ�����Ѵ�����滻������λ��
	//5���������м��ƽ���ֱ������ֵ�������ѭ������temp�е�keyֵȡ������ֵ�����м�ĵط������ظ����ᡣ
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
