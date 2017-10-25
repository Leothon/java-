package he;

import java.util.Scanner;

public class maxArea {

	public static int getMaxArea(int[] height) {
        int len = height.length;
        int max = 0;//�洢��������
        for(int i = 0;i<len;i++){//i��ʾ���α���ÿһ���߶�
            int minHeight = height[i];//��iΪ��С�߶� 
            for(int j=i+1; j<len; j++){ 
                minHeight = Math.min(minHeight, height[j]);
                //�ҳ�i֮�����С�߶�
                max = Math.max(max, (j-i+1)*minHeight);
                //��������С�߶�Ϊ�߶ȵ�������ֵ
            } 
       }
        return max;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
        }
       System.out.println(getMaxArea(arr));
    } 
}
