package day15.Q4;

interface Inter {
    void show();
}
class Outer {
    static Inter method(){
        return new Inter(){

            @Override
            public void show() {
                System.out.println("Hello World");
            }
        };
    }
}
public class OuterDemo {
    public static void main(String[] args) {
        Outer.method().show();
    }
}