
public class Solution {
	
	public int[] twoSum(int[] nums, int target) {
		int max = nums.length;
		int i,j;
		for(i = 0 ; i < max -1 ; i++){
			for(j = i + 1 ; j < max ; j ++){
				if(nums[i]+nums[j] == target){
					System.out.println(i + "  "+ j);
					return new int[] {i,j};
				}
			}
			
		}
		return null;
	  }
	
	public static void main(String[] args) {
		int [] a = {2,7,3,8};
		System.out.println(new Solution().twoSum(a, 9).toString());
	}
	
}
