package he;

public class binarySearch {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] nums={1,2,3,3,4,5,10};
		int target=3;
		int low=0;
		int high=nums.length-1;
		int middle=0;
		
		while(low<=high){
			middle=(low+high)/2;
			if(target==nums[middle]){
				System.out.println(middle);
				break;
			}else if(target<nums[middle]){
				high=middle-1;
			}else{
				low=middle+1;
			}
		}
		
	}

}
