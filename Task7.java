
package assaigmen;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args){
         int a,b,c,d;
        Scanner input =new Scanner(System.in);
        System.out.println("Enter 1st Number");
        a=input.nextInt();
        System.out.println("Enter 2nd Number");
        b=input.nextInt();
        if(a>b)
        {
            c=a-b;
             System.out.println(c);
        }
       
        
    else{
        d=b-a;
            System.out.println(d);}
    }
    
}
