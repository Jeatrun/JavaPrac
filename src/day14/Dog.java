package day14;

public class Dog extends Animal {
    public Dog(int age, String color){
        super(age,color);
    }
    
    @Override
    public void eat(String something){
        System.out.println("This "+this.getAge()+" year-old "+this.getColor()+" dog is eating "+something);
    }

    public void WatchDoor(){
        System.out.println("dog is watching door");
    }
}
