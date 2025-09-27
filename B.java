/* class A {
    int a; String b; boolean c;
    A(){
        a =100; b="Codewithutkrisht"; c=true;
    }
    void Disp(){
        System.out.println(a+" "+b+" "+c);
    }
}
class B 
{
    public static void main(String[] args) {
        
        A ref = new A();
        ref.Disp();

    }
} 
*/
    class Animal {
        String color = "white";
    }

    class Dog extends Animal {
        String color = "black";

        void displayColor() {
            System.out.println("Dog color: " + color); // Refers to Dog's color
            System.out.println("Animal color: " + super.color); // Refers to Animal's color
        }
    }

    public class SuperVariableExample {
        public static void main(String[] args) {
            Dog dog = new Dog();
            dog.displayColor();
        }
    }