/*public class first {
    public static void main(String[]utkrisht){
        System.out.println("codewithutkrisht");
    };
}

class first  {
    int a=10; // instance variable 
    static double b=20.5; // static  variable
    public static void main(String[] args){
        boolean c = true; // local variable
        first s=new first();
        System.out.println(s.a);
        System.out.println(b);
        System.out.println(c);
         
    }
}

class second  {
    int a=10; // instance variable 
    static double b=20.5; // static  variable
    public static void main(String[] args){
        boolean c = true; // local variable
        second s=new second();
        System.out.println(s.a+" "+b+" "+c);
       
         
    }
}


public class A {
    public static void main(String[] args) {
        int a,b,c; 
        System.out.println("Enter two numbers :");
        Scanner s=new  Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        c=a+b;
        System.out.println("The sum is :"+c);
        s.close();
        
    }
}



public class first {
    public static void main(String[] args) {
        int a,b,c; 
        System.out.println("Enter two numbers :");
        Scanner utkrisht =new  Scanner(System.in);
        a=utkrisht.nextInt();
        b=utkrisht.nextInt();
        c=a+b;
        System.out.println("The sum is :"+c);
        utkrisht.close();
    }
}



public class first{
    public static void main(String[] args) {
        int a=37;
        if(a%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}


public class first{
    public static void main(String[]args){
        int num;
        System.out.print("Enter a number : ");
        Scanner s=new Scanner(System.in);
        num=s.nextInt();
        for (int i = 0; i < 10; i++) {
            System.out.print(num*i);

        }
    }
}

import java.util.Scanner;
public class first{
    public static void main(String[] args) {
        int num;
        System.out.print("Enter any number : ");
        Scanner s=new Scanner(System.in);
        num=s.nextInt();
        while(num>=0){
            if(num%2==0){
                System.out.println("even number");
                break;
            }
            else{
                System.out.println("odd number");
                break;
            }
        }
        s.close();
    }
}

// use of relational operators 
public class first{
    public static void main (String[] args){
        int a =10, b =20;
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
    }
}

// use of logical operators
public class first{
    public static void main (String[] args){
        int a =10, b =20;
        System.out.println(a==b && a<b);
        System.out.println(a==b || a!=b);
        System.out.println(!(a>b));
    }
}


// use of Assignment operators
public class first{
    public static void main(String []args){
        int a =10;
        a+=10;
        System.out.println(a);
    }
}


// use of conditional operators
public class first{
    public static void main(String[] args) {
        int a =10, b=20, c=50;
        int r = (a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println(r);
    }
}

// use of Ternary Operators 
class TernaryExample {
    public static void main(String[] args) {
        int a = 10, b = 20;

        int max = (a > b) ? a : b;
        System.out.println("Maximum number is: " + max);
    }
}

// use of Airthmetics Operators 
class ArithmeticOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));
    }
}
// Increment or Decrement operators 
class Demo {
    public static void main(String[] args) {
        int a = 5;

        System.out.println(a++); // post-increment
        System.out.println(++a); // pre-increment
        System.out.println(a--); // post-decrement
        System.out.println(--a); // pre-decrement
    }
}


// use of methods
public class first{
    public static void main(String[] args) {
        System.out.println(sum(10,20)); // method calling 
        
    }
    static int sum(int a, int b){
        return a+b; 
    }
} 

public class first {

    // Method to print a message
    public static void main(String[]args) {
        System.out.println("Hello, this is a method in Java!");
    }   
}


public class first {
    public static void main(String[]args){
        int a[]={1,2,3,4,5}; // a[5]
        System.out.println(a[2]); // ans. 3 
    }
 }

// all element print of Array in JAVA using for-each loop 
 public class first {
    public static void main(String[]args){
        int a[]={1,2,3,4,5}; // a[5]
        for (int b : a) {
            System.out.println(b+ "");
        }
    }
 }

// input from user in  1D Array 
import java.util.Scanner; 
 public class first {
    public static void main(String[]args){
        // int a[]={1,2,3,4,5}; // a[5]
        int a[]=new int[5];
        System.out.println("Enter elements of Array :");
        Scanner s=new Scanner(System.in);
        for (int i=0; i<5; i++) {
            a[i]=s.nextInt();
        }
        System.out.println("\n Array elements are :");
        for (int b : a) {
            System.out.println(b+ "");
        }
    }
 }



// Input from user in 2D Array 
import java.util.Scanner; 
 public class first {
    public static void main(String[]args){
        // int a[]={1,2,3,4,5}; // a[5]
        int a[][]=new int[5][5];
        System.out.println("Enter elements of Array :");
        Scanner s=new Scanner(System.in);
        for (int i=0; i<5; i++) {
            for (int j=0; j<5; j++) {
                a[i][j]=s.nextInt();
            }
        }
        System.out.println("\n Array elements are :");
        
        for (int i=0; i<5; i++) {
            for (int j=0; j<5; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
  }


// String in JAVA
public class first {
    public static void main(String[] args) {
        String str= "codewithutkrisht";
        int len=str.length();
        System.out.print(len); 
    }
}


public class first {
    public static void main(String[] args) {
        String str= "codewithutkrisht";

        System.out.print(str.toUpperCase());
    }
}


public class first {
    public static void main(String[] args) {
        String str= "CODEWITHUTKRISHT";

        System.out.print(str.toLowerCase());
    }
}


public class first {
    public static void main(String[] args) {
        String str= "code"; // immutable(Can not be changed)
        String str2= str.concat("withutkrisht");
        System.out.print(str2);
    }
}

// Bank Mangement Systrem 

import java.util.Scanner;

class Bank {
    int balance = 1000;   // initial balance

    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    void deposit(int amount) {
        balance += amount;
        System.out.println("Amount Deposited: " + amount);
    }

    void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank b = new Bank();
        int choice, amount;

        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");

        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                b.checkBalance();
                break;

            case 2:
                System.out.print("Enter deposit amount: ");
                amount = sc.nextInt();
                b.deposit(amount);
                b.checkBalance();
                break;

            case 3:
                System.out.print("Enter withdraw amount: ");
                amount = sc.nextInt();
                b.withdraw(amount);
                b.checkBalance();
                break;

            default:
                System.out.println("Invalid choice!");
        }
        sc.close();
    }
}

// Calculator using Class & Object 
import java.util.Scanner;

class Calculator {

    // method for addition
    int add(int a, int b) {
        return a + b;
    }

    // method for subtraction
    int subtract(int a, int b) {
        return a - b;
    }

    // method for multiplication
    int multiply(int a, int b) {
        return a * b;
    }

    // method for division
    int divide(int a, int b) {
        return a / b;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Calculator calc = new Calculator(); // object creation

        System.out.print("Enter first number: ");
        int x = sc.nextInt();

        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        System.out.println("Addition: " + calc.add(x, y));
        System.out.println("Subtraction: " + calc.subtract(x, y));
        System.out.println("Multiplication: " + calc.multiply(x, y));
        System.out.println("Division: " + calc.divide(x, y));

        sc.close();
    }
}
// make a program print Brand , Color , Year, Age of Car using Class & Object 
class Car {
    String brand;
    String color;
    int year;

    void displayData() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
    }
}
     void displayAge(int currentYear) {
        int age = currentYear - year;
        System.out.println("Age of Car: " + age + " years");
    }
}
public class Main {
    public static void main(String[] args) {

        Car myCar = new Car();   // object creation

        myCar.brand = "Maruti";
        myCar.color = "Red";
        myCar.year = 2020;
        myCar.displayData();
    }
}
*/
