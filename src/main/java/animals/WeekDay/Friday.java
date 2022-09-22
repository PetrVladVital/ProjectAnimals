package animals.WeekDay;

public class Friday implements WeekDay{
    String friday = "friday";

    public String getFriday() {
        return friday;
    }

    public void setFriday(String friday) {
        this.friday = friday;
    }
    public String getWeekDayName() {
        return getFriday();
    }
}
