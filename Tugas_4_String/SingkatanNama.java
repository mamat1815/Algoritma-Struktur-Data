import java.util.Scanner;

/**
 * SingkatanNama
 */
public class SingkatanNama {

    public static void main(String[] args) throws Exception {
        String huruf;
        boolean lagi;
        boolean tadiSpasi;

        tadiSpasi = true;
        String singkatan;
        Scanner input = new Scanner(System.in);
        singkatan = "";;
        lagi = true;

        String title = "PROGRAM PEMBUAT INISIAL";
        System.out.println(title);
        for (int i = 0; i < title.length(); i++) {
            System.out.print("=");
        }
        System.out.println();
        String nama = input.nextLine();

        char[] namaArray = nama.toCharArray();


        int i = 0;
        while (lagi) {
            huruf = String.valueOf(namaArray[i]);
            if (tadiSpasi) {
                singkatan += huruf;
            }
            if (huruf.equals(".")) {
                lagi = false;
            }
            if (huruf.equals(" ")) {
                tadiSpasi = true;
            } else {
                tadiSpasi = false;
            }
            i++;
        }

        System.out.println(singkatan);

        input.close();
    }
}