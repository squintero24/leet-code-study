import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        var returnList = new ArrayList<Integer>();

        var hashMapCount = new HashMap<Integer, List<Integer>>();

        int nextNumber;
        int count = 0;
        int num;


        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {

            count++; 

            num = nums[i];

            nextNumber = nums.length > 1 && i != nums.length - 1 ? nums[i + 1] : num;

            if (num != nextNumber) {
                hashMapCount.putIfAbsent(count, new ArrayList<>());
                hashMapCount.get(count).add(num);
                count = 0;
            }else if( i == nums.length - 1){ 
                hashMapCount.putIfAbsent(count, new ArrayList<>());
                hashMapCount.get(count).add(num);
            }

        

        }

        System.out.println(hashMapCount.entrySet());

        var hashMapList = new ArrayList<>(hashMapCount.entrySet());

        for (int i = hashMapList.size() - 1; i >= 0; i--) {
            returnList.addAll(hashMapList.get(i).getValue());
        }

        System.out.println(returnList.subList(0, k));

        int[] array = returnList.subList(0, k).stream().mapToInt(i -> i).toArray();

        return array;

    }
}