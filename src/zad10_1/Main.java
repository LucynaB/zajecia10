package zad10_1;

public class Main {
    public static void main(String[] args) {
        Person person = null;
        try {
            person = new Person("Jan","Kowalski",30,"12345678910");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(person);
    }
}
