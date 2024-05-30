
import java.util.Scanner;
import java.util.Stack;

import Tugas_7_NotasiPostfix.StackArray;

/**
 * DecimaltoBiner
 */
public class DecimaltoBiner {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan desimal : ");
        int decimal = input.nextInt();

        StackArray<Integer> stack = new StackArray<>();

        int temp = decimal;

        while (decimal > 0) {
            int sisa = decimal % 2;
            stack.push(sisa);
            decimal = decimal / 2;
        }

        System.out.print("Hasil konversi bilangan desimal " + temp + " ke biner adalah : ");
        while (!stack.empty()) {
            System.out.print(stack.pop());
        }

    }

}