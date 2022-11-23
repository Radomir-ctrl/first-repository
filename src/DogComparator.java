import java.util.Arrays;
import java.util.Comparator;

public class DogComparator implements Comparator <Dog> {
    @Override
    public int compare(Dog dog1, Dog dog2) {
        int difNames = dog1.getName().compareTo(dog2.getName());
        int difAges = dog1.getAge() - dog2.getAge();
        double difHeights = dog1.getHeight() - dog2.getHeight();
        int difBreeds = dog1.getBreed().toString().compareTo(dog2.getBreed().toString());

        if(difNames != 0){
            return difNames;
        }
        if(difAges != 0){
            return difAges;
        }
        if(difHeights != 0) {
            return (int) difHeights;
        }
        return difBreeds;

    }

    public static void main(String[] args) {
        Dog[] dogs = {
                new Dog("Lucky", 2, 2.2, Breed.Husky),
                new Dog("Sparky", 5, 1.3, Breed.Beagle),
                new Dog("Bobik", 3, 1.7, Breed.Basenji),
                new Dog("Barbos", 7, 2.5, Breed.Alabai)
        };

        Arrays.sort(dogs, new DogComparator());

        for (Dog dog : dogs){
            System.out.println(dog);
        }

    }
}
