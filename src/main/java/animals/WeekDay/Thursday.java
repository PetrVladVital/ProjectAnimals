package animals.WeekDay;

public class Thursday implements WeekDay{
    String thursday = "thursday";

    public String getThursday() {
        return thursday;
    }

    public void setThursday(String thursday) {
        this.thursday = thursday;
    }
    public String getWeekDayName() {
        return getThursday();
    }
}
