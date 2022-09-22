package animals.WeekDay;

public class Monday implements WeekDay {
  String monday = "monday";

  public String getMonday() {
    return monday;
  }

  public void setMonday(String monday) {
    this.monday = monday;
  }

  public String getWeekDayName(){
    return getMonday();
  }
}
