package part3inheritance;

import part3inheritance.alarms.PrioritizedAlarm;

public class Main {

    public static void main(String[] args) {
        PrioritizedAlarm prioritizedAlarm = new PrioritizedAlarm("Temperature too high", 3);
        prioritizedAlarm.turnOn();
        System.out.println(prioritizedAlarm.getReport());

        System.out.println(prioritizedAlarm.sendReport());
    }

}
