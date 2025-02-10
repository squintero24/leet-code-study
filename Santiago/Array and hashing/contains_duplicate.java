import java.util.HashMap;

class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        var countNumsHash = new HashMap<>(); 

        for (int i = 0; i < nums.length; i++) {
            if(countNumsHash.get(nums[i]) == null){ 
                countNumsHash.put(nums[i], 1); 
                continue; 
            }

            return true; 
        }

        return false;
 
    }
}