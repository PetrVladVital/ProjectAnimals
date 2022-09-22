package animals.WeekDay;

public class Saturday implements WeekDay{
    String saturday = "saturday";

    public String getSaturday() {
        return saturday;
    }

    public void setSaturday(String saturday) {
        this.saturday = saturday;
    }
    public String getWeekDayName() {
        return getSaturday();
    }
}
