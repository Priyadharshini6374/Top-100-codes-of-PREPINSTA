import java.util.Scanner;
public class positiveornegative{
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number:  ");
        int number = scan.nextInt();
        
        if(number>0){
            System.out.print("The number is a positive number");
        }

        else if(number<0){
            System.out.print(" The number is a negative number");
        }

        else{
            System.out.print("The number is zero");
        }

    }
}