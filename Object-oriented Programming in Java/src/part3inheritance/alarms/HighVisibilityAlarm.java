package part3inheritance.alarms;

public class HighVisibilityAlarm extends Alarm {

    public HighVisibilityAlarm(String message) {
        super(message);
    }

    @Override
    public String getReport(boolean isUppercase) {
        String report = super.getReport(isUppercase);
        return report.equals("") ? "" : report + "!";
    }
}
