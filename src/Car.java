public class Car {
    String name;
    int age;

    public Car(String make, int model) {
        this.name = make;
        this.age = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
