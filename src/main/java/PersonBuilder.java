import java.util.OptionalInt;

public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (name == null || surname == null) {
            if (name == null) {
                name = "вы не ввели имя";
            }
            if (surname == null) {
                surname = "вы не ввели фамилию";
            }
            throw new IllegalStateException("вы не заполнили обязательные данные - имя или фамилию. Ввели имя: " + name + ", фамилия: " + surname);
        }
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("проверьте, правильно ли вы указали возраст. Вам действительно " + age + " лет?");
        }
        return new Person(name, surname, OptionalInt.of(age), address);
    }
}
