// 12. palindrome -- 3.00pm

import java.util.Scanner;
public class palindrome{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("enter a number: ");
        int number = scan.nextInt();
        int given_number=number;
        int num=number;
        int reversed =0;
        while(number!=0){
            reversed = (reversed*10)+(number%10);
            number/=10;

        }
        if(given_number == reversed){
            System.out.print("palindrome");
        }
        else{
            System.out.print("not a palindrome");
        }
    }
}