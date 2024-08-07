package day14;

public class Test {
public static void main(String[] args) {
    Animal cat = new Cat(4,"black");
    Animal dog = new Dog(3,"white");
    Person tom = new Person("Tom",20);
    Person tim = new Person("Tim",21);
    tom.keepPet(cat,"fish");
    tim.keepPet(dog, "bone");
}
}
