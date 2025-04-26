// 25.05.25 -- 3.22pm

import java.util.Scanner;
public class strong{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("enter a number: ");
        int number = scan.nextInt();
        int given_number= number;
        int sum=0;
        while(number!=0){

            int strong = number%10;
            int fact=1;
            for(int i=1;i<=strong;i++){
                fact=fact*i;

            }
            sum+=fact;
            number/=10;
            
        
        }
        if(given_number==sum){
            System.out.print("Strong number");
        }

        else{
                System.out.print("not a strong number");
            
        }
        
    }
}
    