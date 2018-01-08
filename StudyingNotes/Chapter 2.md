# Classes and Objects
## Objects
* Objects are things that we program to describe. For example: a book, a person...
* A object is charatered by its state and behavior.
* In Java, a variable that represents an object is called an object reference.
## Classes
* A class is a software blueprint for implementing objects of a given type.
* An object is a single instance of the class.
```Java
public class BankAccount {

private String password;
private double balance;
public static final double OVERDRAWN_PENALTY = 20.00;

//constructors
/** Default constructor.
* Constructs bank account with default values. */
public BankAccount()
{ /* implementation code */ }

/** Constructs bank account with specified password and balance. */
public BankAccount(String acctPassword, double acctBalance)
{ /* implementation code */ }

//accessor
/** @return balance of this account */
public double getBalance()
{ /* implementation code */ }

//mutators
/** Deposits amount in bank account with given password.
* @param acctPassword the password of this bank account
* @param amount the amount to be deposited */
public void deposit(String acctPassword, double amount)
{ /* implementation code */ }

/**Withdraws amount from bank account with given password.
* Assesses penalty if balance is less than amount.
* @param acctPassword the password of this bank account
* @param amount the amount to be withdrawn
*/
public void withdraw(String acctPassword, double amount){
{ /* implementation code */ }
}
}
```
## Public, Private, and Static
### Public
The keyword public preceding the class declaration signals that the class is usable by all client programs. If a class is not public, it can be used only by classes in its own package. In the AP Java subset, all classes are public.
### Private
 Restriction of access is known as information hiding. In Java, this is implemented by using the keyword private. Private methods and vari- ables in a class can be accessed only by methods of that class.
 ### Static
 A static variable (class variable) contains a value that is shared by all instances of the class. “Static” means that memory allocation happens once.The keyword static indicates that there is a single value of the variable that applies to the whole class, rather than a new instance for each object of the class.
 
 Typical uses of a static variable are to
 
 * keep track of statistics for objects of the class.
 *  accumulate a total.
 * provide a new identity number for each new object of the class.
 
 For example:
 ```Java
 public class Employee {
 private String name;
 private static int employeeCount = 0; //number of employees
 public Employee( < parameter list > ) {
 < initialization of private instance variables >
 employeeCount++; //increment count of all employees }
 ... }
 ```
 
 P95


























