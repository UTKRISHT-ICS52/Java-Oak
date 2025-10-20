/* import java.util.Scanner; 
 class Bank{
    private double bal = 5000; 
    private int pwd = 12345;
   public void Deposit(double money ){
       System.out.println("Enter Password"); 
       Scanner s =new Scanner(System.in);
       pwd = s.nextInt();
       if(pwd == 12345){
              bal = bal + money;
              System.out.println(" Deposit Money: "+money);
              System.out.println("Total Balance: "+bal); 
       }
       else{
        System.out.println("Incorrect Password.....");
       }
   }
   public void withdraw(double money){
        System.out.println("Enter Password"); 
        Scanner s =new Scanner(System.in);
        pwd = s.nextInt();
        if(pwd == 12345){
            if(money <= bal){
                bal = bal - money;
                System.out.println(" Withdraw Money: "+money);
                System.out.println("Total Balance: "+bal); 
            }
            else{
                System.out.println("Insufficient Balance.....");
            }
        }
        else{
         System.out.println("Incorrect Password.....");
   }
        
    }
}


import java.util.Scanner; 

class Bank {
    private double bal = 5000; 
    private int pwd = 12345;   // stored password

    public void Deposit(double money) {
        System.out.println("Enter Password"); 
        Scanner s = new Scanner(System.in);
        int inputPwd = s.nextInt();   // FIX: use a separate variable
        if(inputPwd == pwd){
            bal = bal + money;
            System.out.println("Deposit Money: " + money);
            System.out.println("Total Balance: " + bal); 
        } else {
            System.out.println("Incorrect Password.....");
        }
    }

    public void withdraw(double money) {
        System.out.println("Enter Password"); 
        Scanner s = new Scanner(System.in);
        int inputPwd = s.nextInt();   // FIX: use a separate variable
        if(inputPwd == pwd){
            if(money <= bal){
                bal = bal - money;
                System.out.println("Withdraw Money: " + money);
                System.out.println("Total Balance: " + bal); 
            } else {
                System.out.println("Insufficient Balance.....");
            }
        } else {
            System.out.println("Incorrect Password.....");
        }
    }
}
*/