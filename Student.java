public class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void information() {
        System.out.println("My name is " + name);
        System.out.println("My age is " + age);
    }

    public static void main(String[] args) {
        Student student1 = new Student("harshal", 20);

        System.out.println(student1.name);
        System.out.println(student1.age);

        student1.information();
    }
}
