package he;

public class bubbleSort {

	//˼·��
	//1��дһ�����鳤�ȵ�ѭ������ѭ����һ��ʱ������ѭ�����顣
	//2������ѭ������ӵ����ڶ�����ʼ�����һ���Աȣ����ǰ��С���򽻻�λ�á�
	//3������ѭ����iֹͣ����ѭ����һ��ʱ������һ����ֹͣ����ʱ��һ����Ϊ��Сֵ
	//4����ѭ���ڶ���ʱ������ѭ�����ڶ�����ֹͣ���ڶ��������ǵڶ�С����
	//5��һֱѭ�������һ�����������
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
