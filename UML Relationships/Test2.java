// Association (Uses another class)

class Student {
    String name;
}

class Teacher {
    Student student;  // association
}

public class Test2 {
    public static void main(String[] args) {
        Student s = new Student();
        Teacher t = new Teacher();
        t.student = s;
    }
}