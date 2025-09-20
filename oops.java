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