import java.util.Scanner;
class calculator{
    public static void main(String[] args) {
        int a,b,c,ch;
        System.out.println("Enter two numbers :");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        System.out.println("Enter your choice :");
        ch=s.nextInt();

        switch(ch) 
        {
            case 1: 
                c=a+b;
                System.out.println("The sum is :"+c);
                break;
            case 2:
                c=a-b;
                System.out.println("The difference is :"+c);
                break;
            case 3:
                c=a*b;
                System.out.println("The product is :"+c);
                break;
            case 4:
                c=a/b;
                System.out.println("The quotient is :"+c);
                break;
            case 5:
                c=a%b;
                System.out.println("The remainder is :"+c);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
