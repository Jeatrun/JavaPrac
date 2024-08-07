package day15.Q2;

public class Test {
    public static void main(String[] args) {
        Phone oldPhone = new OldPhone();
        Phone newPhone = new NewPhone();
        usingPhone(oldPhone);
        usingPhone(newPhone);
    }
    static void  usingPhone(Phone phone) {
        phone.call();
        phone.sendMessage();
        if(phone instanceof NewPhone np) {
           np.play();
        }
    }
}
