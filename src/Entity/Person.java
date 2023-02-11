package Entity;

import java.util.Objects;

public class Person {
    private Long personId;
    private String name;
    private Integer age;

    private String address;

    private Integer salary;

    public Long getPersonId() {
        return personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Person(String name, Integer age, String address, Integer salary) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.salary = salary;
    }

    public Person(Long personId) {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person peerson)) return false;
        return personId.equals(peerson.personId) && name.equals(peerson.name) && age.equals(peerson.age) && address.equals(peerson.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personId, name, age, address);
    }

    @Override
    public String toString() {
        return "Peerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }
}
