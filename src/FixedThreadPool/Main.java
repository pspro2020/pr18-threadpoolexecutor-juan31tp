package FixedThreadPool;

public class Main {

    public static void main(String[] args) {
        PotentialScript script;
        Executor executor = new Executor();

        for(int i=0; i < 10; i++){
            script = new PotentialScript(i+1);
            executor.execute(script);
        }

        executor.shutdown();
    }

}
