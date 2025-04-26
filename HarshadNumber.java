// 26.04.25 --3.30pm
// harshad number -- number which is divisible by sum of its digits (eg: 1,2,3,4,5,6,7,8,9,10,12,18,36,40)

import java.util.Scanner;
public class HarshadNumber{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        int given_number = number;
        int sum=0;
        int rem;
        while(number>0){
            rem=number%10;
            sum+=rem;
            number/=10;

            
        }

        if(given_number%sum==0){
            System.out.println("Its a harshad number");
        }

        else{
            System.out.println("Not a harshad number");
        }
        
        }
}