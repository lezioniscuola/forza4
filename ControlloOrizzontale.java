private static boolean controlloOrizzontale(int giocatore) {
for (int riga = 0; riga < RIGHE; riga++) {
            for (int colonna = 0; colonna < COLONNE - 3; colonna++) {
                        if (griglia[riga][colonna] == giocatore && griglia[riga][colonna + 1] == giocatore && griglia[riga][colonna + 2] == giocatore && griglia[riga][colonna + 3] == giocatore) {
                                    return true;
                                    }
                        }
            }
            return false;
            }
}
