package animals.WeekDay;

public class Tuesday implements WeekDay{
String tuesday = "tuesday";

    public String getTuesday() {
        return tuesday;
    }

    public void setTuesday(String tuesday) {
        this.tuesday = tuesday;
    }
    public String getWeekDayName() {
        return getTuesday();
    }
}
