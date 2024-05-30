import java.util.Scanner;

/**
 * NumberChecker
 */
public class NumberChecker {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Angka : ");
        int angka = input.nextInt();
           
        NumberCounter(angka);

        input.close();

        
    }

    static void NumberCounter(int angka) {
        int temp = angka;
        int counter = 0;
        while (temp > 0) {
            temp /= 10;
            counter++;
        }

        switch (counter) {
            case 1:
                System.out.println(angka + " Merupakan Satuan");
                break;

            case 2:
                System.out.println(angka + " Merupakan Puluhan");
                break;
            case 3:
                System.out.println(angka + " Merupakan Ratusan");
                break;
            case 4:
                System.out.println(angka + " Merupakan Ribuan");
                break;

            default:
                System.out.println(angka + " Diluar Dari Range Counter");
                break;
        }

    }

}