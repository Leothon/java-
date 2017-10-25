package he;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class subSet {

    private static void helper(ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> l, int[] nums, int start, int k){
        if(k == 0){
            ans.add(new ArrayList<Integer>(l));
            return;
        }
        
        for(int i = start; i < nums.length; i++){
            l.add(nums[i]);
            helper(ans, l, nums, i + 1, k - 1);
            l.remove(l.size() - 1);
        }
    }
    
    public static ArrayList<ArrayList<Integer>> subsets(int[] nums) {
        // write your code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<Integer>());
        
        if(nums == null || nums.length == 0) return ans;
        
        Arrays.sort(nums);
        
        for(int i = 1; i <= nums.length; i++) 
        	helper(ans, new ArrayList<Integer>(), nums, 0, i);
        
        return ans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int [] a={1,2,3};
		System.out.println(subsets(a));
	}

}
