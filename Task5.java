
package assaigmen;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args){
         int a,b;
        Scanner input =new Scanner(System.in);
        System.out.println("Enter 1st Number");
        a=input.nextInt();
        System.out.println("Enter 2nd Number");
        b=input.nextInt();
        if(a>b)
        {
        System.out.println("First is greater ");
        }
        else if(a<b)
                {
                    System.out.println("secound is greater");
                }
        else
        {
            System.out.println("Equl");
        }
}
}