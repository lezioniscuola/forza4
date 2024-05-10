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
    }
