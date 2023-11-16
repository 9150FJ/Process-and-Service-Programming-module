package Exercise1.Exercise10;

import java.util.Objects;

public class Person {

    private String name, surname, email;

    public Person() {
    }

    public Person(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    public Person(Person person) {
        this.name = person.name;
        this.surname = person.surname;
        this.email = person.email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 3) {
            this.name = name;
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname.toUpperCase().strip();
    }

    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        if (email.contains("@")) {
            if (email.charAt(email.length() - 1) == 's' && email.charAt(email.length() - 2) == 'e' && email.charAt(email.length() - 3) == '.') {
                this.email = email;
            } else if (email.charAt(email.length() - 1) == 'm' && email.charAt(email.length() - 2) == 'o' && email.charAt(email.length() - 3) == 'c' && email.charAt(email.length() - 4) == '.') {
                this.email = email;
            }
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(email, person.email);
    }

    @Override
    protected Person clone() throws CloneNotSupportedException {
        return new Person(this);
    }
}
