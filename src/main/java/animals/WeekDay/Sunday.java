package animals.WeekDay;

public class Sunday implements WeekDay{
    String sunday = "sunday";

    public String getSunday() {
        return sunday;
    }

    public void setSunday(String sunday) {
        this.sunday = sunday;
    }
    public String getWeekDayName() {
        return getSunday();
    }
}
