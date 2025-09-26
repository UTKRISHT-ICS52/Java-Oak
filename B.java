class A {
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