public class ControlloVerticale {
    public static void main(String[] args) {
    }
    private static boolean controlloVerticale(int giocatore) {
        for(int i=0; i< COLONNE; i++){
            for (int j=0; j<RIGHE-3; j++){
                if (griglia[j][i]== giocatore && griglia[j+1][i] && griglia [j+2][i]== giocatore && griglia[j+3][i] == giocatore){
                  return true;  
                }
            }
        }
    }
}
