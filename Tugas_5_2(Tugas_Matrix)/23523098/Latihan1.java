import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        int evenCount = 0;
        int oddCount = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Jumlah Baris: ");
        int baris = input.nextInt();
        System.out.println("Jumlah Kolom: ");
        int kolom = input.nextInt();

        int[][] matrix = new int[baris][kolom];

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.println("Masukkan elemen matrix ke [" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
        }

        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
        }

        System.out.println("Banyak bilangan genap: " + evenCount);
        System.out.println("Banyak bilangan ganjil: " + oddCount);
        input.close();
    }    
}
