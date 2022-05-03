package opvarminig;

public class App {
    public static void main(String[] args) {

        Person person = new Person("Prut", 1997);
        Instruktor instruktor = new Instruktor("Instruktor", 1990,420);
        Student student = new Student("Student", 2001, "Programmering");

        System.out.println(person);
        System.out.println(instruktor);
        System.out.println(student);
    }
}
