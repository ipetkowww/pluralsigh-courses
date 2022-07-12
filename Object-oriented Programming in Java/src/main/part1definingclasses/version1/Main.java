package main.part1definingclasses.version1;

import main.part1definingclasses.version1.Alarm;

public class Main {

    public static void main(String[] args) {
        Alarm alarm = new Alarm("Temperature too high");
        alarm.turnOn();
        alarm.sendReport();
    }
}
