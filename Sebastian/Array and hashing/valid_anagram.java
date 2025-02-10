class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }else{
            Hashmap hashmapS = new HashMap();
            Hashmap hashmapT = new HashMap();
            for (int i = 0; i < s.length(); i++){
                if(hashmapS.get(s.charAt(i)) == null){
                    hashmapS.put(s.charAt(i),1)
                }else {
                    hashmapS.put(s.charAt(i), hashmapS.get(s.charAt(i) + 1))
                }
            }
            for (int i = 0; i < t.length(); i++){
                if(hashmapT.get(t.charAt(i)) == null){
                    hashmapT.put(t.charAt(i),1)
                }else {
                    hashmapT.put(t.charAt(i), hashmapT.get(t.charAt(i) + 1))
                }
            }

            if(hashmapS.equals(hashmapT)){
                return true;
            }else {
                return false;
            }
        }
    }
}