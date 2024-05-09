public class ControlloDiagonale (int giocatore) {
    public static void main(String[] args) {
        for(int riga=0;riga<RIGHE-3;riga++){
            for(int colonna=0;colonna<COLONNE-3;colonna++){
                if(griglia[riga][colonna]==giocatore&&griglia[riga+1][colonna+1]==giocatore&&griglia[riga+2][colonna-2]==giocatore&&griglia[riga+3][colonna-3]==giocatore){
                    return true;
                }
            }
        }
    }
}