package part2encapsulation;


import part2encapsulation.alarmv2.Alarm;

public class Main {

    public static void main(String[] args) {
        Alarm alarm = new Alarm("Temperature too high");
        alarm.turnOn();
        alarm.snooze();
        alarm.sendReport();
    }
}
