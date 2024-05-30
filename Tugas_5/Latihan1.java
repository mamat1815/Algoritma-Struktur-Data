public class Latihan1 {
    public static void main(String[] args) {
        
         int a[][]={{2,3},{2,7}};    
         int b[][]={{1,3},{2,9}};    
      
         int c[][]=new int[3][3];  
         
         for(int i=0 ; i < a.length ;i++){    
            for(int j=0; j < a[0].length ;j++){    
               c[i][j] = a[i][j] - b[i][j];    
               System.out.print(c[i][j]+" ");    
            }    
            System.out.println();
         }    

    }
}
