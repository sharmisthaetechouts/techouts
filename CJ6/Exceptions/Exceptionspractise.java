package CJ6.Exceptions;
import java.util.*;

class InvalidAmountException extends Exception{

    public InvalidAmountException(String message) { //
        super(message); //calling the constructor
    }

}
public class Exceptionspractise {
    public static void withdraw(double amount) throws InvalidAmountException{
        int balance=1000;
        if(amount<=0) {
            throw new InvalidAmountException("Zero balance");
        }
        if(amount>balance){
            throw new InvalidAmountException("Bounce back ..");

        }
       balance-=amount;
        System.out.println("Transaction Successful");
        System.out.println("Remaining balance: " + balance);
    }
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the withdraw amount...");
        int withdraw_amt=sc.nextInt();
        try{
            withdraw(withdraw_amt);
        }catch(InvalidAmountException e){
            System.out.println(e);
        }

        finally{System.out.println("Thank You visit again");}

    }
}
