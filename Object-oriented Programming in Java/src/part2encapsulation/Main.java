package main.part2hidinginformation.main;


import main.part2hidinginformation.version2.Alarm;

public class Main {

    public static void main(String[] args) {
        Alarm alarm = new Alarm("Temperature too high");
        alarm.turnOn();
        alarm.snooze();
        alarm.sendReport();
    }
}
