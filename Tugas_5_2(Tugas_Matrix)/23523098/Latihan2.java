import java.util.Scanner;

public class Latihan2 {
    
    public static void main(String[] args) {
        
        int jumlahBenar = 0;
        Scanner input = new Scanner(System.in);
        char[] kunciJawaban = {'A', 'C', 'B'};
        char[] jawabanMahasiswa = new char[3];

        for (int i = 0; i < jawabanMahasiswa.length; i++) {
            System.out.println("Masukkan jawaban mahasiswa ke-" + (i + 1) + ": ");
            jawabanMahasiswa[i] = input.next().charAt(0);
        }

        for (int i = 0; i < kunciJawaban.length; i++) {
            if (kunciJawaban[i] == jawabanMahasiswa[i]) {
                jumlahBenar++;
            }
        }

        System.out.println("Jumlah jawaban benar: " + jumlahBenar);
        input.close();
    }

}
