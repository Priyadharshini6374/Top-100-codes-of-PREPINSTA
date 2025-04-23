// 23.04.25 -- 12.45pm
import java.util.Scanner;
public class sum_n_natural_no{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("enter a number: ");
        int number = scan.nextInt();
        int sum=0;
        for(int i=1; i<=number; i++){
            sum+=i;

        }
        System.out.print("Sum of first  natural number upto given number is: " +sum );
    }
}