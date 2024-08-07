package Day11_ArrayList.Q1;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        String[] str={"aaa", "bbb", "aaa", "aaa", "ccc", "bbb"};
        for (int i = 0; i < str.length; i++) {
            list.add(str[i]);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
