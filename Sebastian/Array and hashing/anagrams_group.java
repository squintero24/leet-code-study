class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map hashMapGeneral = new HashMap<String, Map>();
        List<List<String>> response = new ArrayList();
        Map hashGroupeds = new HashMap<String, Integer>();

        for (int m = 0; m < strs.length; m++){
            Map hashMapWord = new HashMap();
            String word = strs[m];
            for (int n = 0; n < word.length(); n++){
                if(hashMapWord.get(word.charAt(n)) == null){
                    hashMapWord.put(word.charAt(n),1);
                }else {
                    hashMapWord.put(word.charAt(n), hashMapWord.get(word.charAt(n) + 1));
                }
            }
            hashMapGeneral.put(word, hashMapWord);
        }

        for (int i = 0; i < strs.length; i++){
            String wordActual = strs[i];
            if(!hashGroupeds.containsKey(wordActual)){
                List<String> groupAnagram = new ArrayList();
                groupAnagram.add(wordActual);
                for (int j = i+1; j < strs.length; j++){
                    String wordPivot = strs[j];
                    var hashActual = hashMapGeneral.get(wordActual);
                    var hashNext = hashMapGeneral.get(wordPivot);
                    if (hashActual.equals(hashNext)){
                        groupAnagram.add(wordPivot);
                        hashGroupeds.put(wordPivot,j);
                    }
                }
                response.add(groupAnagram);
            }
        }
        return response;
    }
}