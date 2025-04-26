// 26.5.25 --- perfect number

import java.util.Scanner;
public class PerfectSquare{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("enter a number: ");
        int number = scan.nextInt();
        int new_number=number/2;
        int count=0;
        for(int i=1;i<new_number;i++){
            int perfect_square=i*i;
            if(perfect_square==number){
                System.out.println("Its a perfect square");
                count++;
            }
        }
        if(count==0){
            System.out.println("Not a perfect square");
        }
        
    }
}