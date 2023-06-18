package Builder;

//Используется для создания сложного объекта с использованием простых объектов.
// Постепенно он создает больший объект от малого и простого объекта. Позволяет изменять внутреннее представление конечного продукта.
class Person{
    int id;
    int age;
    double salary;
}
interface Builder{
    Builder setId (int id);
    Builder setAge (int age);
    Builder setSalary(int salary);
    Person build();
}
class PersonBuilder implements Builder{
    Person person = new Person();
    @Override
    public Builder setId(int id) {
        person.id=id;
        return this;
    }

    @Override
    public Builder setAge(int age) {
        person.age=age;
        return this;
    }

    @Override
    public Builder setSalary(int salary) {
        person.salary=salary;
        return this;
    }

    @Override
    public Person build() {
        return person;
    }
}

public class BuilderTest {
    public static void main(String[] args) {
        Person person = new PersonBuilder().setAge(12).setId(1).build();
        System.out.println(person.id);
        System.out.println(person.salary);
        System.out.println(person.age);
    }
}
