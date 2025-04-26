// 25.0525-- 3.16pm

import java.util.Scanner;
public class factor{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("enter a number: ");
        int number = scan.nextInt();
        int given_number = number;
        for(int i= 1; i<=number;i++){
            if(number%i==0){
                System.out.print(i +" ");
            }
        }

        
    }
}