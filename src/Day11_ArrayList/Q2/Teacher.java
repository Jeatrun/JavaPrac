package Day11_ArrayList.Q2;

public class Teacher {
    private String name;
    private String Major;

    public Teacher() {
    }

    public Teacher(String name, String Major) {
        this.name = name;
        this.Major = Major;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return Major
     */
    public String getMajor() {
        return Major;
    }

    /**
     * 设置
     * @param Major
     */
    public void setMajor(String Major) {
        this.Major = Major;
    }

    public void showInfo() {
        System.out.println("Teacher: " + name + " " + Major);
    }
}
