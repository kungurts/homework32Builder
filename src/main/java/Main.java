import java.util.OptionalInt;

public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Анна")
                .setSurname("Вольф")
                .setAge(31)
                .setAddress("Сидней")
                .build();
        System.out.println(mom);

        Person son = mom.newChildBuilder()
                .setName("Антошка")
                .setAge(5)
                .build();
        System.out.println("У " + mom.getName() + " " + mom.getSurname() + " есть сын, " + son);

        try {
            Person cat = new PersonBuilder()
                    .setName("Charlie")
                    .setAge(3)
                    .setAddress("Sydney")
                    .build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            Person daughter = new PersonBuilder()
                    .setName("Alice")
                    .setSurname("Volf")
                    .setAge(-100)
                    .build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        try {
            Person cat = new PersonBuilder()
                    .setName("Charlie")
                    .setAge(3)
                    .setAddress("Sydney")
                    .build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

    }
}
