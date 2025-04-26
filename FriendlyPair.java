// 26.4.25 -- 4.00pm
// Friendly pair -- get 2number from user (sum of proper divisors of each equal to the other number)
// eg: 220 and 284

import java.util.Scanner;
public class FriendlyPair{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number1: ");
        int number1= scan.nextInt();
        System.out.print("Enter a number2: ");
        int number2= scan.nextInt();   
        int sum1=0;
        int sum2=0;

        for(int i=1; i<number1; i++){
            if(number1%i==0){
                sum1+=i;
            }
        } 

        
        for(int j=1; j<number2; j++){
            if(number2%j==0){
                sum2+=j;
            }
        } 

        if(sum1==number2 && sum2==number1){
            System.out.print("Friendly pair");
        }
        else{
            System.out.print("Not a friendly pair of numbers");
        }    
    }
}