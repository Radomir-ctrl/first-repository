public class Dog {
    String name;
    Integer age;
    Double height;
    Breed breed;

    public Dog(String name, Integer age, Double height, Breed breed) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Double getHeight() {
        return height;
    }

    public Breed getBreed() {
        return breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", breed=" + breed +
                '}';
    }
}
