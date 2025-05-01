import model.entity.Location;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {


    public static void main(String[] args) throws InterruptedException {
        System.out.println("START");
        Thread.sleep(500);
        Location location = new Location();
        location.run();

//        try (ExecutorService executorService = Executors.newSingleThreadExecutor()) {
//            executorService.execute(location);
//        }
    }
}