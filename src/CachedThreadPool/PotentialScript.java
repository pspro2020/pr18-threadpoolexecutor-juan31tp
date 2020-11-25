package CachedThreadPool;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class PotentialScript implements Runnable {

    int n;
    private static final DateTimeFormatter dateTimeFormatter =  DateTimeFormatter.ofPattern("HH:mm:ss", Locale.getDefault());

    public PotentialScript(int i) {
        this.n=i;
    }

    @Override
    public void run() {
        for (int j=0; j<=10; j++){
            double result = Math.pow(n, j);
            try {
                Thread.sleep(200);
                System.out.printf(LocalTime.now().format(dateTimeFormatter) + " -> " + Thread.currentThread().getName() + " : " + n + "" + j +  " = " + result + "\n");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
