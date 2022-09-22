package animals.WeekDay;

public class Wednesday implements WeekDay{
    String wednesday = "wednesday";

    public String getWednesday() {
        return wednesday;
    }

    public void setWednesday(String wednesday) {
        this.wednesday = wednesday;
    }
    public String getWeekDayName() {
        return getWednesday();
    }
}
