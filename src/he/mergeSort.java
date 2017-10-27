package he;

import java.util.Arrays;

public class mergeSort {

	
	public static void sort(int [] a,int low,int high){
		int mid=(low+high)/2;
		if(low<high){
			sort(a,low,mid);
			sort(a,mid+1,high);
			merge(a,low,mid,high);
		}
	}
	
	public static void merge(int[] a,int low,int mid,int high){
		int[] temp=new int[high-low+1];
		int i=low;
		int j=mid+1;
		int k=0;
		
		while(i<=mid&&j<=high){
			if(a[i]<a[j]){
				temp[k++]=a[i++];
			}else{
				temp[k++]=a[j++];
			}
		}
		
		while(i<=mid){
			temp[k++]=a[i++];
		}
		
		while(j<=high){
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
