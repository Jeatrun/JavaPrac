package day15.Q3;

public class NewPhone extends Phone implements IPlay {
    @Override
    public void play() {
        System.out.println("NewPhone play");
    }
}
