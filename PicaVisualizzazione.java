private static void visualizzaGriglia() {
        System.out.println("|\\|||||||||||||||||||||||||||||||||||||||||\\|");
        System.out.print("|\\| ");
        for (int i = 0; i < COLONNE; i++) {
            System.out.print(i + " | ");
        }
        System.out.println("\\|");
        System.out.println("|\\|||||||||||||||||||||||||||||||||||||||||\\|");
    }
