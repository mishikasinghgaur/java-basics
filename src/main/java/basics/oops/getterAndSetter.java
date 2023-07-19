package main.java.basics.oops;

// Java Program showing working of data hiding

// Importing generic libraries
import java.io.*;

// Class created named Bank
class BankName {

    // Private data (data hiding)
    private long CurBalance = 0;

    // Bank_id is checked for authentication
    long bank_id;
    String name;

    // Getter function to modify private data
    public long get_balance(long Id)
    {

        // Checking whether the user is
        // authorised or unauthorised

        // Comparing bank_id of user and the given Id
        // then only it will get access
        if (this.bank_id == Id) {

            // Return current balance
            return CurBalance;
        }

        // Unauthorised user
        return -1;
    }
    // Setter function
    public void set_balance(long balance, long Id)
    {
        // Comparing bank_id of user and the given Id
        // then only it will get access
        if (this.bank_id == Id) {
            // Update balance in current ID
            CurBalance = CurBalance + balance;
        }
    }
}

// Another class created- Employee
public class getterAndSetter {
    public static void main(String[] args)
    {
        // Creating employee object of bank type
        BankName _emp = new BankName();

        // Assigning employee object values
        _emp.bank_id = 12345;
        _emp.name = "Roshan";

        // _emp.get_balance(123456)
        _emp.set_balance(10000, 12345);
        // This will no get access as bank_id is given wrong
        // so
        // unauthorised user is not getting access that is
        // data hiding

        long emp_balance = _emp.get_balance(12345);
        // As this time it is valid user it will get access

        // Display commands
        System.out.println("User Name"
                + " " + _emp.name);
        System.out.println("Bank_ID"
                + " " + _emp.bank_id);
        System.out.println("Current Balance"
                + " " + emp_balance);
    }
}
