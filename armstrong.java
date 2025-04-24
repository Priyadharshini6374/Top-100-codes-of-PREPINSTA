// 13. armstrong number -- 03.07pm

import java.util.Scanner;
public class armstrong{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        int given_number = number;
        int num= number;
        int count=0;
        int remainder=1;
        int sum=0;
        while(number!=0){
            count++;
            number/=10;
        }
        while(num!=0){
            remainder = num%10;
            int Armstrong=1;
            for(int i=1;i<=count;i++){
                Armstrong*=remainder;
            }
            sum+=Armstrong;
            num/=10;
        }

        if(given_number==sum){
            System.out.print("Its an Armstrong number");
        }
        else{
            System.out.print("not an Armstrong number");
        }
    }
}