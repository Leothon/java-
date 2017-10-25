package he;

import java.util.Scanner;

public class maxArea {

	public static int getMaxArea(int[] height) {
        int len = height.length;
        int max = 0;//存储最大面积的
        for(int i = 0;i<len;i++){//i表示依次遍历每一个高度
            int minHeight = height[i];//设i为最小高度 
            for(int j=i+1; j<len; j++){ 
                minHeight = Math.min(minHeight, height[j]);
                //找出i之后的最小高度
                max = Math.max(max, (j-i+1)*minHeight);
                //计算以最小高度为高度的最大面积值
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
