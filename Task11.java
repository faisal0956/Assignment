
package assaigmen;

import java.util.Scanner;

public class Task11 {
     public static void main(String[] args){
    int AVERAGE ,a,b,c,d,e;
    Scanner input =new Scanner(System.in);
         System.out.println("Give Five number's");
     a=input.nextInt();
     b=input.nextInt();
     c=input.nextInt();
     d=input.nextInt();
     e=input.nextInt();
    
    
    AVERAGE= (a+b+c+d+e)/5;
         System.out.println( "Avareage is " +AVERAGE);
}
}