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


// class Student {
//     String name;
// }

// class Teacher {
//     Student student;  // storing reference
// }

// public class Test {
//     public static void main(String[] args) {
//         Student s = new Student();  // object created
//         s.name = "Rahim";

//         Teacher t = new Teacher();
//         t.student = s;  // storing reference inside Teacher

//         System.out.println(t.student.name);
//     }
// }