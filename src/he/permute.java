package he;

import java.util.ArrayList;
import java.util.List;

public class permute {

    public static List<List<Integer>> result = new ArrayList<>();
    public static ArrayList<Integer> currArray = new ArrayList<>();
    
    public static List<List<Integer>> permute(int[] nums) {
        // write your code here
        if (nums == null || nums.length == 0) {
            result.add(new ArrayList<Integer>());
            return result;
        }
        ArrayList<Integer> numsArray = new ArrayList<>();
        for (int i : nums) {
            numsArray.add(i);
        }
        Helper(numsArray);
        return result;
    }
    private static void Helper(ArrayList<Integer> numsArray) {
        if (numsArray.size() == 0) {
            result.add(new ArrayList<Integer>(currArray));
            currArray.remove(currArray.size() - 1);
            return;
        }
        for (int i = 0; i < numsArray.size(); i++) {
            currArray.add(numsArray.get(i));
            ArrayList<Integer> numsLeft = new ArrayList<Integer>(numsArray);
            numsLeft.remove(i);
            System.out.println(currArray);
            Helper(numsLeft);
            
        }
        if (currArray.size() > 0) {
            currArray.remove(currArray.size() - 1);
        }
        return;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] nums={1,2,3};
	System.out.println(permute(nums));
			
		}
	}


