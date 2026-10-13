class Student {
    String name;
}

public class main2{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Rahul";

        Student s2 = s1;
        s2.name = "Amit";

        System.out.println(s1.name);
        System.out.println(s2.name);
    }
}