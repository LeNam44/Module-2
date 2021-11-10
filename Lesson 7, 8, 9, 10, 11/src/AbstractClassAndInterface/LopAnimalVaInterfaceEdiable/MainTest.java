package AbstractClassAndInterface.LopAnimalVaInterfaceEdiable;

public class MainTest {
    public static void main(String[] args) {
        //test animals
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            animal.makeSound();
        } // khong dung duoc

        Animal animal1 = animals[0];
        Tiger tiger = (Tiger) animal1;
        System.out.println(tiger.makeSound());

        Animal animal2 = animals[1];
        Chicken chicken = (Chicken) animal2;
        System.out.println(chicken.makeSound());
        System.out.println(chicken.howToEat());

        //test fruit
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
