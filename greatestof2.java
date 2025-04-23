// 23.04.25 -- 12.59pm

import java.util.Scanner;
public class greatestof2{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("enter number1: ");
        int number1 = scan.nextInt();
        System.out.print("enter number2: ");
        int number2 = scan.nextInt();
        if(number1>number2){
            System.out.print("Number1 is Greater");
        }
        else{
            System.out.print("Number2 is Greater");
        }
    }
}