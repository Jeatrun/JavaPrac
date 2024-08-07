package day15.Q1;



public class Test {
    public static void main(String[] args) {
        Round r = new Round(10);
        Rectangle re = new Rectangle(10, 20);
        System.out.println(r.area());
        System.out.println(r.perimeter());
        System.out.println(re.area());
        System.out.println(re.perimeter());
    }
}
