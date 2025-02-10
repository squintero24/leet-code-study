import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        var bigAssHash = new HashMap<String, HashMap<Character, Integer>>();

        var returnList = new ArrayList<List<String>>();

        var indexC = new ArrayList<Integer>();

        for (int i = 0; i < strs.length; i++) {
            var currentHash = new HashMap<Character, Integer>();
            var s = strs[i];
            for (int j = 0; j < s.length(); j++) {
                if (currentHash.get(s.charAt(j)) != null) {
                    currentHash.put(s.charAt(j), currentHash.get(s.charAt(j)) + 1);
                } else {
                    currentHash.put(s.charAt(j), 1);
                }
            }
            bigAssHash.put(s, currentHash);
        }

        for (int i = 0; i < strs.length; i++) {

            var miniList = new ArrayList<String>();
            miniList.add(strs[i]);

            if (!indexC.contains(i)) {
                for (int j = i; j < strs.length; j++) {
                    if (j != i) {
                        if (bigAssHash.get(strs[i]).equals(bigAssHash.get(strs[j]))) {
                            miniList.add(strs[j]);
                            indexC.add(j);
                        }
                    }
                }
                returnList.add(miniList);
            }

        }

        return returnList;
    }
}
