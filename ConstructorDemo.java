public class ConstructorDemo {
    public static void main(String[] args) {
        {
            Person1 person=new Person1();
            System.out.println("Default of person1");
            person.Display();
            System.out.println();

            Person1 person2=new Person1("harshal",20);
            System.out.println(person2.name);
            System.out.println(person2.age);
            person2.Display();

            Person1 person3=new Person1(person2);
            System.out.println("Default of person copy of person2");
            person3.Display();

        }
    }

}
