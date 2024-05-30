import java.util.Scanner;

public class tes {
    public static void main(String[] args) {
        //deklarasi sekaligus inisialisasi
        int nilaiMhs[] = {10, 20, 70, 40, 50}; 
   
        nilaiMhs[5] = 0;
        int x[] = new int[5];
        x[0] = 10;
        // dengan looping for traversal
        for (int i=0; i<5; i++){
           System.out.println(nilaiMhs[i]);    
        }  

    }
}