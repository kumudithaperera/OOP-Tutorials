public class myApplication {
    public static void main(String[]args){
        System.out.println("Hello World");

        Person p = new Person("Ben");
        p.displayName();

        Person a = new Person("John");
        a.displayName();

        Person b = new Person("Jack");
        b.displayName();

        p.setSurname("Bones");
        p.displaySurname();
        p.setAge(32);
        p.displayAge();

        a.setSurname("Doe");
        a.displaySurname();
        a.setAge(22);
        a.displayAge();

        b.setSurname("Ryan");
        b.displaySurname();
        b.setAge(30);
        b.displayAge();
    }
}
