package Day11_ArrayList.Q3;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        ArrayList <Employee> a =new ArrayList<>();
        a.add(new Employee("张三",3000));
        a.add(new Employee("李四",3500));
        a.add(new Employee("王五",4000));
        a.add(new Employee("赵六",4500));
        a.add(new Employee("田七",5000));

        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getName().equals("王五")){
                a.get(i).setName("王小五");
            }
            else if(a.get(i).getName().equals("赵六")){
                a.remove(i);
                i--;
            } else if (a.get(i).getName().equals("田七")) {

                a.get(i).setSalary(a.get(i).getSalary()+500);
            }

        }
        System.out.println("after changing:");
        for (int i = 0; i < a.size(); i++) {

            System.out.println(a.get(i));
        }

    }


}
