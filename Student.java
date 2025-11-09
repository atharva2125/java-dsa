class Student {
    String name;
    int age;
 
    Student() {
        name = "Unknown";
        age = 0;
    }

  
    Student(String n, int a) {
        name = n;
        age = a;
    }
 
    Student(Student s) {
        name = s.name;
        age = s.age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student(); // Default constructor
        Student s2 = new Student("Atharva", 21); // Parameterized constructor
        Student s3 = new Student(s2); // Copy constructor

        s1.display();
        s2.display();
        s3.display();
    }
}