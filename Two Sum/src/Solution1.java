import java.util.HashMap;


public class Solution1 {

	public int[] twoSum(int[] nums, int target) {
		HashMap<Integer,Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i],i );
		}
		
		int temp,j;
		for(int i = 0; i < nums.length ;i++){
			temp = target -nums[i];
			if(map.get(temp) != null &&(j =  map.get(temp)) != i){
				return new int[] {i,j};
			}
		}
		return null;
	  }
	
	public static void main(String[] args) {
		int [] a = {3,2,4};
		System.out.println(new Solution().twoSum(a, 6).toString());
	}

}
