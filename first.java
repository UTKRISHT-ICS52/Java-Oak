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
*/