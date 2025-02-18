import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public int longestConsecutive(int[] nums) {

        if (nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return 1;
        }

        Arrays.sort(nums);

        var hashSequences = new HashMap<Integer, List<Integer>>();

        int keyArray = 0;

        int keyGreaterArraySize = 0;

        for (int i = 1; i < nums.length; i++) {

            boolean keyChangeCondition = i == 1 || nums[i] - 1 == nums[i - 1] || nums[i] == nums[i - 1];

            keyArray = keyChangeCondition ? keyArray : keyArray + 1;

            hashSequences.putIfAbsent(keyArray, new ArrayList<Integer>());

            if (i == 1) {
                if (nums[i] - 1 == nums[i - 1]) {
                    hashSequences.get(keyArray).addAll(List.of(nums[i - 1], nums[i]));
                } else if (nums[i] == nums[i - 1]) {
                    hashSequences.get(keyArray).add(nums[i]);
                }
            } else if (nums[i] != nums[i - 1]) {
                hashSequences.get(keyArray).add(nums[i]);
            }

            keyGreaterArraySize = hashSequences.get(keyArray).size() > hashSequences.get(keyGreaterArraySize).size()
                    ? keyArray
                    : keyGreaterArraySize;
        }

        return hashSequences.get(keyGreaterArraySize).size();

    }
}


//Solución recomendada
public class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        //Quita repetidos
        for (int num : nums) {
            numSet.add(num);
        }
        int longest = 0;

        for (int num : numSet) {
            //Va a empezar a contar la racha de un numero sin ordenar la lista.

            //Si el numero num - 1 no existe se para desde ahí para iniciar a contar.
            if (!numSet.contains(num - 1)) {
                //El largo se inicializa por defecto como 1
                int length = 1;
                //Si el numero actual más uno existe se suma al rango lenght
                while (numSet.contains(num + length)) {
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
}
