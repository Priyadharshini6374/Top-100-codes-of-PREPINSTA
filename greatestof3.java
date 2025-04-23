// 23.04.25 -- 01.08pm

import java.util.Scanner;
public class greatestof3{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("enter number1: ");
        int number1 = scan.nextInt();
        System.out.print("enter number2: ");
        int number2 = scan.nextInt();
        System.out.print("enter number3: ");
        int number3 = scan.nextInt();
        if(number1>number2 && number1>number3){
            System.out.print("Number1 is Greater");
        }
        
        else if(number2>number3){
            System.out.print("Number2 is greater");
        }
        else{
            System.out.print("Number3 is Greater");
        }
    }
}