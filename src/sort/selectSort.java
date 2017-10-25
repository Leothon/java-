package sort;

public class selectSort {

	int a[]={45,36,52,51,85,97,45};
	public  selectSort(){
		
		int position=0;
		for(int i=1;i<a.length;i++){
			
			position=i;
			int temp=a[i];
			for(int j=i+1;j<a.length;j++){
				if(a[j]<temp){
					temp=a[j];
					position=j;
				}
			}
			a[position]=a[i];
			a[i]=temp;
		}
		
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+"   ");
		}
	}
	
	public static void main(String args[]){
		new selectSort();
	}
}
