package FixedThreadPool;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Executor {
    ThreadPoolExecutor cachedExecutor = (ThreadPoolExecutor) Executors.newCachedThreadPool();

    void execute(PotentialScript script){
        cachedExecutor.execute(script);
    }

    void shutdown(){
        cachedExecutor.shutdown();
    }

}
