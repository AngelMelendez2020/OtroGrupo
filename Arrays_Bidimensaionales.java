package arrays_bidimensaionales;

public class Arrays_Bidimensaionales {

    public static void main(String[] args) {
        int[][] arreglos = {
            {1, 2, 3, 4, 5, 6},
            {2, 3, 4, 5, 6, 7},
            {3, 4, 5, 6, 7, 8}};

        int restacolumna = 0;

        for (int i = 0; i < arreglos.length; i++) {
            for (int y = 0; y < arreglos[i].length; y++) {
                restacolumna -= arreglos[i][y];
                System.out.print(" | " + arreglos[i][y] + " | ");

            }
            System.out.println("  La resta  de la fila " +i+ " es: " + restacolumna);
            restacolumna = 0;
            System.out.println("\n----------------------------------------");

        }
    }

}
