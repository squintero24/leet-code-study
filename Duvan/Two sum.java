class Solution {
    public int[] twoSum(int[] nums, int target) {
    
        int posicion1 = 0;
        int posicion2 = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
            if((nums[i] + nums[j] ) == target ){
                posicion1 = i;
                posicion2 = j;
            }
        }
        }
        int[] posFilaColumna = {posicion1, posicion2};
        return posFilaColumna;
    }
}


//SOLUCION CHAT GPT o(n)

import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();  // (1)

        for (int i = 0; i < nums.length; i++) {  // (2)
            int complemento = target - nums[i];  // (3)

            if (map.containsKey(complemento)) {  // (4)
                return new int[]{map.get(complemento), i};  // (5)
            }

            map.put(nums[i], i);  // (6)
        }

        return new int[]{};  // (7)
    }
}
