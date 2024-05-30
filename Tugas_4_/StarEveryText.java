    import java.util.Scanner;

    public class StarEveryText {
        

        public static void main(String[] args) {
            
            Scanner input = new Scanner(System.in);

            String text = input.nextLine();
            starText(text);
            input.close();
        }

        static void starText(String text) {
            System.out.println(text);
            for (int i = 0; i < text.length(); i++) {
                System.out.print("*");
            }

        }

    }
