class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<String, Integer> palabra1 = new HashMap<String, Integer>();
        HashMap<String, Integer> palabra2 = new HashMap<String, Integer>();

        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();

        for(char caracter: s1){
            if(palabra1.get(String.valueOf(caracter)) == null ){
                palabra1.put(String.valueOf(caracter),1);
            }else{
                palabra1.put(String.valueOf(caracter), palabra1.get(String.valueOf(caracter)) +1 );
            }
        }
        for(char caracter: s2){
            if(palabra2.get(String.valueOf(caracter)) == null ){
                palabra2.put(String.valueOf(caracter),1);
            }else{
                palabra2.put(String.valueOf(caracter), palabra2.get(String.valueOf(caracter)) +1 );
            }
        }
        if(palabra1.equals(palabra2)){
        
            System.out.println("HashSet 1: " + palabra1);
            System.out.println("HashSet 2: " + palabra2);
            return true;
            
        }else{

            System.out.println(" falso HashSet 1: " + palabra1);
            System.out.println(" falso HashSet 2: " + palabra2);
            return false;
        }
    }
}


//SOLUCION MÁS SIMPLE

class Solution {
    public boolean isAnagram(String s, String t) {
        Set<String> letras1 = new HashSet<>();
        Set<String> letras2 = new HashSet<>();

        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();

        for(char caracter: s1){
            letras1.add(String.valueOf(caracter));
        }
        for(char caracter: s2){
            letras2.add(String.valueOf(caracter));
        }
        if (s.length() != t.length()) {
            return false; // Si tienen diferente longitud, no pueden ser anagramas
        }    
        if(letras1.equals(letras2)){
            return true;
        }else{
            return false;
        }
        

    }
}
