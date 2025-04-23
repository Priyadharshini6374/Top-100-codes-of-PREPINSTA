// 23.04.25 -- 04.09pm
import java.util.Scanner;
public class leapyear{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scan.nextInt();
        if(year%4==0 && year%100!=0 || year%400==0){
            System.out.print(year+" Its a leap year!!");
        }
        else{
            System.out.print(year+" Not a leap year");
        }
    }
}