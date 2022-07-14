package part2encapsulation.alarmv2;

import java.time.LocalDateTime;

public class Alarm {

    private boolean active;
    private final String message;
    private LocalDateTime snoozeUntil;

    public Alarm(String message) {
        this.message = message;
        stopSnoozing();
    }

    public void snooze() {
        if (active) {
            byte fiveMinutes = 5;
            snoozeUntil = LocalDateTime.now().plusMinutes(fiveMinutes);
        }
    }

    boolean isSnoozing() {
        return snoozeUntil.isAfter(LocalDateTime.now());
    }

    void stopSnoozing() {
        byte oneSecond = 1;
        snoozeUntil = LocalDateTime.now().minusSeconds(oneSecond);
    }

    public void turnOn() {
        active = true;
        stopSnoozing();
    }

    public void turnOff() {
        active = false;
        stopSnoozing();
    }

    public String getReport() {
        return getReport(false);
    }

    public String getReport(boolean isUppercase) {
        if (active && !isSnoozing()) {
            return isUppercase ? message.toUpperCase() : message;
        }
        return "";
    }

    public void sendReport() {
        System.out.println(getReport(true));
    }
}
