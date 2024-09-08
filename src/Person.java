import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.lang.Math.abs;
import static java.lang.Math.round;

class Person {
    static int count = 0;
   private int personId;
   private String name;
   private String email;

    public Person(int personId, String name, String email) {
        this.personId = personId;
        this.name = name;
        this.email = email;
        count++;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}

class Entry5{
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(1,"Jane", "jane@mail.com"));
        personList.add(new Person(2,"Peter", "peter@mail.com"));
        personList.add(new Person(3,"Ken", "ken@mail.com"));
        personList.add(new Person(4,"Mark", "mark@mail.com"));

        System.out.println(abs(22.9));
        System.out.println(round(22.9));
        personList.sort(Comparator.comparing(Person::getName));


        //compile time errors
        // int x;

       // System.out.println(x);

        //int y;
        //System.out.println(y);

        int x = 0;
        System.out.println(x);

        //A variable declared as static cannot exist on per-instance basis

        Person another = new Person(10, "Mercy", "mercy@gmail.com");
        Person person3 = new Person(11, "Kim", "kim@mail.com");

        //count the number of objects created or increment the counter everytime an
        // instance is created.
        System.out.println(Person.count);

    }
}
