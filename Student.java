public class Student {
    String name;
    int age;
    String department;

    public Student() {
        name = "Unknown";
        age = 20;
        department = "Unassigned";
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.department = "IT";
    }

    public Student(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Department: " + department);
    }
}
class MainClass {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Alice", 22);
        Student s3 = new Student("Bob", 23, "Computer Science");

        s1.display();
        s2.display();
        s3.display();
    }
}

