package day14;

public class Cat extends Animal{
    public Cat(int age, String color){
        super(age,color);
    }
    @Override
    public void eat(String something){
        System.out.println("This "+this.getAge()+" year-old "+this.getColor()+" cat is eating "+something);
    }

    public void catchMouse(){
        System.out.println("cat is catching mouse");
    }
}
