
import services.Scheduler;

public class App {


    public static void main(String[] args) throws InterruptedException {
        System.out.println("START");
        Scheduler scheduler = new Scheduler();
        scheduler.start();
    }
}