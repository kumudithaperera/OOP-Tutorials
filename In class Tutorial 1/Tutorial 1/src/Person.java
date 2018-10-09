public class Person {
    private String name;
    private String surname;
    private int age;

    public Person(String n){
        name = n;

    }

    public void displayName(){
        System.out.println(name);
    }
    public void displaySurname(){
        System.out.println(surname);
    }
    public void displayAge(){
        System.out.println(age);
    }

    public void setSurname(String s){
        this.surname = s;
    }

    public void setAge(int num){
        this.age = num;
    }

    public String getSurname(){
        return getSurname();
    }

    public int getAge(){
        return getAge();
    }
}
