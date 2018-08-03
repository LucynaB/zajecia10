package zad10_1;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String pesel;

    public Person(String firstName, String lastName, int age, String pesel) throws Exception {
        if (firstName == null || firstName.length() < 2) {
            throw new NameUndefinedException("Podałeś błędne imię.");
        }
        if (lastName == null || lastName.length() < 2) {
            throw new NameUndefinedException("Podałeś błędne nazwisko.");
        }
        if(age<1){
            throw new IncorrectAgeException("Podałeś błędny wiek.");
        }
        if(pesel.length()!=11){
            throw new IncorrectLengthException("Pesel musi mieć 11 znaków.");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pesel = pesel;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + age + " " + pesel;
    }
}
