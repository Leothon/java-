package he;

public class insertSort {

	//˼·��
	//1���ӵڶ�������ʼѭ�����ѵ�ǰ������Ϊ���
	//2�������ǰ�����С�ڱ�ǣ�����ԭ״����֮������������һλ
	//3��ѭ�������ǰ��ĵڶ�������С�ڱ�Ǳ���ԭ״����֮���������������ƣ�ֱ��ǰ������
	//4������Ƿŵ��鵽��ȷλ��
	//
	public static void sort(int[] a){
		for(int i=1;i<a.length;i++){
			int temp=a[i];//��һ�����ó�
			int j=i-1;
			for(;j>=0&&a[j]>temp;j--){
				a[j+1]=a[j];//����ǰ����������Աȣ�����������������ƣ�ֱ��ǰ��û����j>=0����ǰ�����С�������
			}
			a[j+1]=temp;//��ʱj��ֵΪ����С��temp��ֵ���±�+1�����ó��������ȥ��
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
