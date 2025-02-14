class Solution {
    public int[] productExceptSelf(int[] nums) {

        int prod = 1;
        int zeroCount = 0; 
        int[] returnArray = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                prod *= nums[i];
            }else{ 
                zeroCount++; 
            }
        }
        
        if (zeroCount > 1) {
            return new int[nums.length]; 
        }

        for (int i = 0; i < nums.length; i++) {
            if (zeroCount>0 && nums[i] != 0) {
                returnArray[i] = 0; 
            }else if(nums[i] != 0){ 
                returnArray[i] = prod/nums[i];  
            }else{ 
                returnArray[i] = prod; 
            }
        }
        return returnArray;
    }
}
