public class Random {
    public static void main(String[] args) {
 int numeroRandom= NumeriRandom();
            System.out.println("Numero casuale: " + numeroRandom);
        int numeroRando= NumeriRandom2();
            System.out.println("Numero casuale: " + numeroRandom);
        
    }
    private static int NumeriRandom() {
            Random r= new Random();
            return r.nextInt(3); 
    }
    private static int NumeriRandom2() {
            Random r2= new Random();
            return r2.nextInt(10);
    }
}
