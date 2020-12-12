package sample.gui;

import sample.classes.Scheduler;

public class TLauncher implements Runnable {
    public static Scheduler sc;

    @Override
    public void run() {
        sc = new Scheduler();
        sc.Start();
    }

}
