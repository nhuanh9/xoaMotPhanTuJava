package QLSP;

import java.io.Serializable;
import java.util.List;

public class Person implements Serializable {
    private int id;
    private String name;
    private int age;
    private List<Country> countries;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Person() {

    }

    public Person(int id, String name, int age, List<Country> countries) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.countries = countries;
    }

    public List<Country> getCountries() {
        return countries;
    }

    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age + ", " + countries.toString() +
                '}';
    }
}
