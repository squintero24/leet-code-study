class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map hashmap = new HashMap();

        for (int i = 0; i < nums.length - 1; i++) {
            Int finding = nums[i] - target;
            hashmap.put(finding,i);
            if (hashmap.containsKey(finding)) {
                return new int[]{hashmap.get(finding), i}
            }
            }return new int[0];
        }
    }


