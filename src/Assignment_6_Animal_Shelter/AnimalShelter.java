package src.Assignment_6_Animal_Shelter;

import java.util.LinkedList;
import java.util.Queue;

public class AnimalShelter {

    private abstract static class Animal {
        private String name;
        private int order;

        public Animal(String name) {
            this.name = name;
        }

        public void setOrder(int order) {
            this.order = order;
        }

        public int getOrder() {
            return this.order;
        }

        public String getName() {
            return this.name;
        }

        public boolean isOlderThan(Animal other) {
            return this.order < other.getOrder();
        }
    }

    private static class Dog extends Animal {
        public Dog(String name) {
            super(name);
        }
    }

    private static class Cat extends Animal {
        public Cat(String name) {
            super(name);
        }
    }

    private Queue<Dog> dogs;
    private Queue<Cat> cats;
    private int order;

    public AnimalShelter() {
        dogs = new LinkedList<>();
        cats = new LinkedList<>();
        order = 0;
    }

    public void enqueue(Animal animal) {
        animal.setOrder(order);
        order++;

        if (animal instanceof Dog) {
            dogs.add((Dog) animal);
        } else if (animal instanceof Cat) {
            cats.add((Cat) animal);
        }
    }

    public Animal dequeueAny() {
        if (dogs.isEmpty() && cats.isEmpty()) {
            return null;
        } else if (dogs.isEmpty()) {
            return dequeueCat();
        } else if (cats.isEmpty()) {
            return dequeueDog();
        }

        Dog oldestDog = dogs.peek();
        Cat oldestCat = cats.peek();

        if (oldestDog.isOlderThan(oldestCat)) {
            return dequeueDog();
        } else {
            return dequeueCat();
        }
    }

    public Dog dequeueDog() {
        return dogs.poll();
    }


    public Cat dequeueCat() {
        return cats.poll();
    }

    public void printAnimals() {
        System.out.println("Dogs in shelter: " + dogs);
        System.out.println("Cats in shelter: " + cats);
    }

    public static void main(String[] args) {
        AnimalShelter shelter = new AnimalShelter();
        shelter.printAnimals();

        shelter.enqueue(new Dog("Rex"));
        shelter.enqueue(new Cat("Whiskers"));
        shelter.printAnimals();
        shelter.enqueue(new Dog("Buddy"));
        shelter.enqueue(new Cat("Mittens"));
        shelter.printAnimals();

        System.out.println("Dequeue any: " + shelter.dequeueAny().getName());
        shelter.printAnimals();
        System.out.println("Dequeue cat: " + shelter.dequeueCat().getName());
        System.out.println("Dequeue dog: " + shelter.dequeueDog().getName());
        shelter.printAnimals();
    }
}
