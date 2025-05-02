package services;

import entity.map.Island;
import config.Settings;
import util.CreatureEnum;
import view.PrintInfo;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;


public class Scheduler extends Thread {


    public static final int CORE_POOL_SIZE = 8;
    Island island;

    public Scheduler() {
        this.island = new Island(Settings.rowsCount, Settings.columnsCount);
    }

    @Override
    public void run() {
        PrintInfo printInfo = new PrintInfo(island);
        printInfo.print();
        ScheduledExecutorService mainPool = Executors.newScheduledThreadPool(CORE_POOL_SIZE);
        List<CreatureTasker> list = Arrays.stream(CreatureEnum.values())
                .map(o -> new CreatureTasker(o, island))
                .toList();

        mainPool.scheduleWithFixedDelay(() -> cycleOfLife(list, printInfo), 1000, 1000, TimeUnit.MILLISECONDS);
    }

    void cycleOfLife(List<CreatureTasker> list, PrintInfo info) {
        ExecutorService executorService = Executors.newFixedThreadPool(CORE_POOL_SIZE);
        list.forEach(executorService::submit);
        executorService.shutdown();
        awaitPool(info, executorService);
    }

    private void awaitPool(PrintInfo info, ExecutorService servicePool) {
        try {
            if (servicePool.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS)) {
                info.print();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
