import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {

        var hashmap1 = new HashMap<Character, Integer>(); 
        var hashmap2 = new HashMap<Character, Integer>(); 

        for (int i = 0; i < s.length(); i++) {
            if(hashmap1.get(s.charAt(i)) != null){ 
                hashmap1.put(s.charAt(i), hashmap1.get(s.charAt(i)) + 1);
            }else{ 
                hashmap1.put(s.charAt(i), 1);
            }
             
        }

        for (int i = 0; i < t.length(); i++) {
            if(hashmap2.get(t.charAt(i)) != null){ 
                hashmap2.put(t.charAt(i), hashmap2.get(t.charAt(i)) + 1);
            }else{ 
                hashmap2.put(t.charAt(i), 1);
            }
        }
        if(hashmap1.equals(hashmap2)){ 
            return true; 
        }



        return false; 

    }
}
