class Solution {
    public int[] twoSum(int[] nums, int target) {
        var hashmap = new HashMap<Integer, Integer>();
        Integer finding;
        Integer num;
        for (int i = 0; i < nums.length; i++) {
            num = nums[i] ;
            finding = target - num ;
            if (hashmap.containsKey(num)) {
                return new int[]{hashmap.get(num), i};
            }
            hashmap.put(finding,i);
        }
        return new int[0];
    }
}


key value