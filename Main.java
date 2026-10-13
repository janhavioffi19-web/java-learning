class Student {
    String name;
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Rahul";

        s1 = null;

        System.out.println("Program continues");
    }
}