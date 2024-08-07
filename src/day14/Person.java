package day14;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    public void keepPet(Animal animal,String something){
        if(animal instanceof Cat cat){
            System.out.println(this.name+" age "+this.age +" keeps a "+cat.getAge()+" year-old "+cat.getColor()+" cat");
             cat.eat(something);
        }
        else if(animal instanceof Dog dog){
            System.out.println(this.name+" age "+this.age +" keeps a "+dog.getAge()+" year-old "+dog.getColor()+" dog");
            dog.eat(something);
        }
    }
}
