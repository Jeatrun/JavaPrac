package day15.Q5;

public class Test {
    public static void main(String[] args) {
    //one
        InterA ia=new InterA() {
            @Override
            public void showA() {
                System.out.println("#1");
            }
        };
        A aa=new A();
        aa.methodA(ia);

        new A().methodA(
                new InterA() {
                    @Override
                    public void showA() {
                        System.out.println("#2");
                    }
                }
        );
    }


}

//定义接口
interface InterA {
    void showA();
}

class A {
    public void methodA(InterA a) {
        a.showA();
    }
}
