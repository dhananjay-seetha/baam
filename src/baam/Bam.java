package baam;




import java.util.*;
class Bam {

    public static void main(String[] args) {
        
           
               System.out.println("number");
      try (Scanner scanner = new Scanner(System.in)) {
        int x = scanner.nextInt();
       
      boolean result = x > 0 && ((x & (x - 1)) == 0);
      if(result == true){
          System.out.println("YES");
      }
      else{
       System.out.println("NO");
    } 
      }
    }
   
}
