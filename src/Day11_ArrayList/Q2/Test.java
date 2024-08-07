package Day11_ArrayList.Q2;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Teacher> a = new ArrayList<>();
        a.add(new Teacher("赵老师", "javase"));
        a.add(new Teacher("钱老师", "javaee"));
        a.add(new Teacher("孙老师", "php"));
        a.add(new Teacher("李老师", "python"));
        for (int i = 0; i < a.size(); i++) {
            a.get(i).showInfo();
        }
    }
}
