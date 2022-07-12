package main.part1definingclasses;

public class Main {

    public static void main(String[] args) {
        Alarm alarm = new Alarm("Temperature too high");
        alarm.turnOn();
        alarm.sendReport();
    }
}
