package he;

import java.util.Arrays;

public class kLast {

	public static void main(String args[]){
		int k=1;
		int [] nums={1,2,3,4,5};
		Arrays.sort(nums);
		System.out.println(nums[nums.length-k]);
	}
}
