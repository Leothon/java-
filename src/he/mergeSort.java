package he;

import java.util.Arrays;

public class mergeSort {

	
	public static void sort(int [] a,int low,int high){
		int mid=(low+high)/2;
		if(low<high){
			sort(a,low,mid);//左边排序
			sort(a,mid+1,high);//右边排序
			merge(a,low,mid,high);//合并
		}
	}
	
	public static void merge(int[] a,int low,int mid,int high){
		int[] temp=new int[high-low+1];//建立临时数组储存归并结果
		int i=low;//左指针
		int j=mid+1;//中间指针
		int k=0;
		
		while(i<=mid&&j<=high){
			if(a[i]<a[j]){//如果左边的数小，将左数加入新数组，反之将中数加入
				temp[k++]=a[i++];
			}else{
				temp[k++]=a[j++];
			}
		}
		
		while(i<=mid){//依次将左边数放入
			temp[k++]=a[i++];
		}
		
		while(j<=high){//一次将右边数放入
			temp[k++]=a[j++];
		}
		for(int l=0;l<temp.length;l++){
			a[l+low]=temp[l];
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a={51,46,30,10,20,54,85,65,21,33,54};
		sort(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
	}

}
