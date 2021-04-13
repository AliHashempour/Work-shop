public class Main {

    public static void main(String[] args) throws InterruptedException {
        ClockDisplay clock = new ClockDisplay();
        System.out.println(clock.getTime());
        while(true){
            Thread.sleep(1000);
            clock.timeTick();
            System.out.println(clock.getTime());
        }




    }
}
