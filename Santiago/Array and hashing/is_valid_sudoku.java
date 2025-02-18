import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public boolean isValidSudoku(char[][] board) {

        int grupo = 0;
        int agregadoGrupo = 0;

        var hashGrupo = new HashMap<Integer, HashSet<Integer>>();
        var hashFila = new HashMap<Integer, Integer>();
        var hashColumna = new HashMap<Integer, Integer>();

        for (int i = 0; i < board.length; i++) {
            grupo = 0; 

            for (int j = 0; j < board.length; j++) {

                if (j == 0) {
                    grupo = agregadoGrupo;
                }

                int numeroEnFila = board[i][j] != '.' ? Character.getNumericValue(board[i][j]) : 0;
                int numeroEnColumna = board[j][i] != '.' ? Character.getNumericValue(board[j][i]) : 0;



                hashFila.put(numeroEnFila, hashFila.get(numeroEnFila) != null ? hashFila.get(numeroEnFila) + 1: 1 );
                hashColumna.put(numeroEnColumna, hashColumna.get(numeroEnColumna) != null ? hashColumna.get(numeroEnColumna) + 1 : 1 );
                hashGrupo.putIfAbsent(grupo, new HashSet<>());

                var repeted = !hashGrupo.get(grupo).add(numeroEnFila); 


                if(((repeted || hashFila.get(numeroEnFila) > 1) && numeroEnFila != 0) || (hashColumna.get(numeroEnColumna) > 1 && numeroEnColumna != 0)) {
                    return false;
                }

                grupo = (j + 1) % 3 == 0 ? grupo + 1 : grupo;

            }

            hashFila.clear();
            hashColumna.clear();

            if ((i + 1) % 3 == 0 && i != 0) {
                agregadoGrupo += 3;
            }
        }

        return true;
    }
}
