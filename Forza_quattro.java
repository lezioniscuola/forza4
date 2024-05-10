public class Forza_quattro {
    private static final int RIGHE = 6;
    private static final int COLONNE = 10;
    private static final int[][] griglia = new int[RIGHE][COLONNE];

    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int giocatoreCorrente = 1;
        boolean giocoInCorso = true;

//////////////////////////////////////////////////////////////////////////////////////////////
        //                         Bollettino / Cortinovis                        //


        for (int riga = 0; riga < RIGHE; riga++) {
            for (int colonna = 0; colonna < COLONNE; colonna++) {
                griglia[riga][colonna] = 0;
            }
        }

        while (giocoInCorso) {
            visualizzaGriglia();
            System.out.println("Giocatore " + giocatoreCorrente + "--> inserisci un gettone nella colonna (0-9):");
            int colonnaScelta = in.nextInt();

            if (colonnaScelta < 0 || colonnaScelta >= COLONNE) {
                System.out.println("Colonna non valida. Riprova.");
                continue;
            }

            boolean inserito = inserisciGettone(colonnaScelta, giocatoreCorrente);
            if (!inserito) {
                System.out.println("Colonna piena. Scegli un'altra colonna.");
                continue;
            }

            if (controllaVincita(giocatoreCorrente)) {
                visualizzaGriglia();
                System.out.println("Giocatore " + giocatoreCorrente + " ha vinto!");
                giocoInCorso = false;
            } else if (isGrigliaPiena()) {
                visualizzaGriglia();
                System.out.println("La griglia è piena. Pareggio!");
                giocoInCorso = false;
            } else {
                giocatoreCorrente = (giocatoreCorrente == 1) ? 2 : 1;
            }
        }
        in.close();
    }

//////////////////////////////////////////////////////////////////////////////////////////////
    //                         Alessandro Pica                              //
    private static void visualizzaGriglia() {
        System.out.println("|\\|||||||||||||||||||||||||||||||||||||||||\\|");
        System.out.print("|\\| ");
        for (int i = 0; i < COLONNE; i++) {
            System.out.print(i + " | ");
        }
        System.out.println("\\|");
        System.out.println("|\\|||||||||||||||||||||||||||||||||||||||||\\|");
        for (int riga = 0; riga < RIGHE; riga++) {
            System.out.print("|\\|");
            for (int colonna = 0; colonna < COLONNE; colonna++) {
                System.out.print(griglia[riga][colonna] == 0 ? "- -" : (griglia[riga][colonna] == 1 ? " X " : " O "));
                System.out.print("|");
            }
            System.out.println("\\|");
            System.out.println("|\\|                                       |\\|");
        }
        System.out.println("|\\|||||||||||||||||||||||||||||||||||||||||\\|");
    }
//////////////////////////////////////////////////////////////////////////////////////////////







//////////////////////////////////////////////////////////////////////////////////////////////
    //                         Cortinovis - Bollettino                               //
    private static boolean inserisciGettone(int colonna, int giocatore) {
        for (int riga = RIGHE - 1; riga >= 0; riga--) {
            if (griglia[riga][colonna] == 0) {
                griglia[riga][colonna] = giocatore;
                return true;
            }
        }
        return false;
    }

    //                         Cortinovis - Bollettino                              //
    private static boolean controllaVincita(int giocatore) {
        return controllaOrizzontale(giocatore) || controllaVerticale(giocatore) || controllaDiagonale(giocatore);
    }
//////////////////////////////////////////////////////////////////////////////////////////////










//////////////////////////////////////////////////////////////////////////////////////////////
    //                         Alessandro Longo                              //
    private static boolean controllaOrizzontale(int giocatore) {
        for (int riga = 0; riga < RIGHE; riga++) {
            for (int colonna = 0; colonna < COLONNE - 3; colonna++) {
                if (griglia[riga][colonna] == giocatore && griglia[riga][colonna + 1] == giocatore &&
                        griglia[riga][colonna + 2] == giocatore && griglia[riga][colonna + 3] == giocatore) {
                    return true;
                }
            }
        }
        return false;
    }
//////////////////////////////////////////////////////////////////////////////////////////////








//////////////////////////////////////////////////////////////////////////////////////////////
    //                         Cristian Manenti                             //

    private static boolean controllaVerticale(int giocatore) {
        for (int colonna = 0; colonna < COLONNE; colonna++) {
            for (int riga = 0; riga < RIGHE - 3; riga++) {
                if (griglia[riga][colonna] == giocatore && griglia[riga + 1][colonna] == giocatore &&
                        griglia[riga + 2][colonna] == giocatore && griglia[riga + 3][colonna] == giocatore) {
                    return true;
                }
            }
        }
        return false;
    }
//////////////////////////////////////////////////////////////////////////////////////////////






    //////////////////////////////////////////////////////////////////////////////////////////////
    //                         Leonardo Roncelli                              //

    private static boolean controllaDiagonale(int giocatore) {
        for (int riga = 0; riga < RIGHE - 3; riga++) {
            for (int colonna = 0; colonna < COLONNE - 3; colonna++) {
                if (griglia[riga][colonna] == giocatore && griglia[riga + 1][colonna + 1] == giocatore &&
                        griglia[riga + 2][colonna + 2] == giocatore && griglia[riga + 3][colonna + 3] == giocatore) {
                    return true;
                }
            }
        }

        for (int riga = 0; riga < RIGHE - 3; riga++) {
            for (int colonna = 3; colonna < COLONNE; colonna++) {
                if (griglia[riga][colonna] == giocatore && griglia[riga + 1][colonna - 1] == giocatore &&
                        griglia[riga + 2][colonna - 2] == giocatore && griglia[riga + 3][colonna - 3] == giocatore) {
                    return true;
                }
            }
        }
        return false;
    }
//////////////////////////////////////////////////////////////////////////////////////////////





    //////////////////////////////////////////////////////////////////////////////////////////////
    //                         Cortinovis - Bollettino                               //

    private static boolean isGrigliaPiena() {
        for (int riga = 0; riga < RIGHE; riga++) {
            for (int colonna = 0; colonna < COLONNE; colonna++) {
                if (griglia[riga][colonna] == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
