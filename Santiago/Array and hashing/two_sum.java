import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        var hashmap1 = new HashMap<Integer, Integer>(); 

        Integer difference;
        Integer num;  

        for (int i = 0; i < nums.length; i++) {

            num = nums[i];

            difference = target - num;
            
            if(hashmap1.containsKey(num)){
                return new int[]{hashmap1.get(num), i};
            }
            

            hashmap1.put(difference, i); 

        }

        return new int[0];
    }
}
