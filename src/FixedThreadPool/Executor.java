package FixedThreadPool;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Executor {
    int nThreads = Runtime.getRuntime().availableProcessors();
    ThreadPoolExecutor fixedExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(nThreads);

    void execute(PotentialScript script){
        fixedExecutor.execute(script);
    }

    void shutdown(){
        fixedExecutor.shutdown();
    }

}
