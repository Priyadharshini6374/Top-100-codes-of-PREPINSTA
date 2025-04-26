// 14 . fibonacci series upto nth term   3.30pm  24.04.25  

import java.util.Scanner;
public class fibonacci_nth{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("enter a number:  ");
        int number = scan.nextInt();
        int number1=0;
        int number2=1;
        System.out.print(number1+" ");
        System.out.print(number2+" ");
        for(int i=1; i<=number-2;i++){
            int number3=number1+number2;
            System.out.print(number3+" ");
            number1=number2;
            number2=number3;
        }
    }
}