package he;

public class selectSort {

	//˼·��
	//1���������б������Ȱѵ�һ����������Сֵ��
	//2��ѭ����һ����֮������������õ���С������������С�����±���Ϊmin.
	//3����2��ѭ���еõ���С�������±꣬�����С���ǵ�һ���������ֲ��䣬���򣬽�����������
	//4�����������еڶ���������Ϊ��һ�����Ѿ�����С���ˡ��Ժ����ѭ��������һֱѭ�������һ����
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
