public class ObjectReference {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        Person person2 = person1;

        System.out.println("Before modification:");
        System.out.println(person1);
        System.out.println(person2);

        person2.setName("Bob");

        System.out.println("After modification:");
        System.out.println(person1);
        System.out.println(person2);
    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }
}