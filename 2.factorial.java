//25.04.25 --03.06pm

import java.util.Scanner;
public class factorial{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("enter a number: ");
        int number = scan.nextInt();
        int fact=1;
        for(int i=1;i<=number;i++){
            fact=fact*i;

        }
        System.out.println(fact);
    
    }
}
