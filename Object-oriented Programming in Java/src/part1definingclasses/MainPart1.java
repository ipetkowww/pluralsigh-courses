package part1definingclasses;

import part1definingclasses.alarmv1.Alarm;

public class MainPart1 {

    public static void main(String[] args) {
        Alarm alarm = new Alarm("Temperature too high");
        alarm.turnOn();
        alarm.sendReport();
    }
}
