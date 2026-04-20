import university.Student;
package university;
public class Student {
    int roll;
    String name;
    String course;

    public void getData(int r, String n, String c) {
        roll = r;
        name = n;
        course = c;
    }

    public void showData() {
        System.out.println("Roll No: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }
}
public class Test {
    public static void main(String[] args) {
        Student s = new Student();

        s.getData(101, "Utkrisht", "B.Tech -M.Tech CSE");
        s.showData();
    }
}