package day15.Q3;

public class Test {
    public static void main(String[] args) {
        //inner class calling playGame()
        new IPlay(){

            @Override
            public void play() {
                System.out.println("playing games");
            }
        }.play();

    }

}
