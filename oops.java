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
class B 
{
    public static void main(String[] args) {
        
        A ref = new A();
        ref.Disp();

    }
}

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

*/ 
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

*/
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
    static A getA(){ // static method to get the instance of class A
        return new A();
    }
}