
package assaigmen;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args){
        int a;
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a Number");
        a=input.nextInt();
        
        if(a % 2 == 0)
        {System.out.println("Even");}
    else
        {
        System.out.println("Odd");}
    }
}
