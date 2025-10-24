/*
// create a class in java 
class person {
    int age = 21; // instance variable 
    int weight = 60;
    String color = "Light";

    void eat(){
        System.out.println("Eating...");
    }
    void sleep(){
        System.out.println("Sleeping...");
    }


    public static void main(String[] args) {
        person p = new person();
        System.out.println(p.age);
        System.out.println(p.weight);
        System.out.println(p.color);
        p.eat();
        p.sleep();
    }

}

// constructor in java
class oops 
{
    int a; String name;
    oops(){
        a=0; name=null; 
    }
    void display(){
        System.out.println(a+" "+name); 
    }
}
class B
{
    public static void main(String[]args){
        oops ref = new oops();
        ref.display();
        oops ref2 = new oops();
        ref2.display();

    }
}

// Default constructor 

class A {
    int a; String b; boolean c;
    A(){
        a =100; b="Codewithutkrisht"; c=true;
    }
    void Disp(){
        System.out.println(a+""+b+""+c);
    }
}
class oops
{
    public static void main(String[] args) {
        
        A ref = new A();
        ref.Disp();

    }
}
/*
// Parametrized Constructor
class A {
    int a; String b; boolean c;
    A(int x, String y, boolean z) // parametrized 
    {
        a = x; b = y; c = z;
    }
    void Disp(){
        System.out.println(a+""+b+""+c);
    }
}
class B
{
    public static void main(String[] args) {

        A ref = new A(100, "Codewithutkrisht", true);
        ref.Disp();

    }
}


// Copy Constructor 
class oops {
    int a; String b; boolean c;
    oops(int x, String y, boolean z) // parametrized 
    {
        a = x; b = y; c = z;
    }
    oops(oops ref) // copy constructor
    {
        a = ref.a; b = ref.b; c = ref.c;
    }
    void Disp(){
        System.out.println(a+""+b+""+c);
    }
}


// Private Constructor 
class A {
    int a; String b; boolean c;
    private A() // private constructor 
    {
        a = 100; b = "Codewithutkrisht"; c = true;
    }
    void Disp(){
        System.out.println(a+""+b+""+c);
    }
    static A GetA(){ // static method to get the instance of class A
        return new A();
    }
} 

// Super Keyword
class oops {
    int a = 10; 
}
class B extends oops {
    int a = 20;
    void display(){
        System.out.println(a); // 20
        System.out.println(super.a); // 10
    }
    public static void main(String[] args) {
        B ref = new B();
        ref.display();
    }
}

// This keyword 
class oops{
    int a ;
    oops(int a){
        this.a=a;
    }
    void show()
    {
        System.out.println(this);
    }
    public static void main(String[] args) {
       oops r=new oops();  
       System.out.println(r);
       r.show();
    }
    }


// Instance block and Static block in JAVA 
class oops {
    // Instance block in java 
    {
        System.out.println("Codewithutkrisht");
        
    }
}

// static block in java 
class oops {
    static {
        System.out.println("codewithutkrisht");     
}
public static void main (string[]args){

}
}

// Abstraction in JAVA 
abstract class oops 
{
    public String Name = "myBank";
    public String IFSC = "myBank2816";
    
    public void bankDetail()

{
    System.out.println("Bank_Name: " + Name + ", IFSC_Code: " +IFSC);
   
}
abstract void deposit();// abstract method 
abstract void withdraw();// abstract method
abstract void checkbalance(); // abstract method 

}
class Bank extends oops{
    private double bal = 5000; 
    private int pwd = 12345;

    public void deposit(){
        System.out.println("Deposit method");
    }
    public void withdraw(){
        System.out.println("Withdraw method");
    }
    public void checkbalance(){
        System.out.println("Check Balance method");
    }
    public static void main(String[] args) {
        Bank b = new Bank();
        b.bankDetail();
        b.deposit();
        b.withdraw();
        b.checkbalance();
    }
}

// Polymorphism in JAVA
class oops {
    void show() {
        System.out.println("Parent class");
    }
}
class B extends oops {
    void show() {
        System.out.println("Child class");
    }
    public static void main(String[] args) {
        oops ref = new B();
        ref.show();
    }
}

// method overloading in Java (Compile time  polymorphism)
class oops 
{
    void add ()
    {
        int a = 10, b = 20;
        c = a + b;
        System.out.println(c);
    }
    void add (int x , int y )
    {
        int c ;
        c = x+y;
        System.out.println(c);
    }
    void add (int x, double y)
    {
        double c;
        c = x+y; 
        System.out.println(c); 
    }
   public static void main (String[] args) {
        oops ref = new oops();
        ref.add();
        ref.add(100,200);
        ref.add(100, 99.99);
   }
   
//  method overloading in Java (Run time  polymorphism)

class oops {
    void show(){
        System.out.println("Parent class");

    }
    void show(String s){
        System.out.println(s);
    }
    public static void main(String[] args) {
        oops ref = new oops();
        ref.show();
        ref.show("Codewithutkrisht");
    }
}

// other program for runtime polymorphism
class oops {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends oops {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends oops {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class main{
    public static void main(String[] args) {
        oops a;

        a = new Dog();
        a.sound(); // Output: Dog barks

        a = new Cat();
        a.sound(); // Output: Cat meows
    }
}
*/
















