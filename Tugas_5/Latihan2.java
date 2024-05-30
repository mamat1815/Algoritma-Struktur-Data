
    public class Latihan2 {

        public static void main(String[] args) {
            int a[][]={{1,3},{2,9},{3,4}};    
       
            int b[][]={{2,3},{2,7}};    
     
            int c[][] = new int[3][2];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b[0].length; j++) {
                    for (int k = 0; k < a[0].length; k++) {
                        c[i][j] += a[i][k] * b[k][j];
                    }
                    System.out.print(c[i][j] + " ");
                }
                
                System.out.println();
            }


        }
    }
