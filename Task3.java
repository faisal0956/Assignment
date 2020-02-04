
package assaigmen;
import java.util.Scanner;
public class Task3 {

    public static void main(String[] args){
        int radius,Area,Circumference;
        Scanner input =new Scanner(System.in);
        System.out.print("Enter circle radius:\n");
        radius =input.nextInt();
        Area=(int) (3.14 * radius * radius);
        Circumference = (int) (2 * 3.14 * radius) ;
        
        System.out.println("Area:"+Area);
        System.out.println("Circumference:"+Circumference);
    }
    
  
}
