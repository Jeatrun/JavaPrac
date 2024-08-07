package day15.Q2;

public class NewPhone extends Phone implements IPlay{
    @Override
    public void play() {
        System.out.println("NewPhone play");
    }
}
