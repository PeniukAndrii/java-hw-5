package Task2;

public class Time {
    private int hour;
    private int min;

    public Time() {
    }

    public Time(int hour, int min) {
        if(min >= 0 && min < 60) this.min = min;
        if(hour >= 0 && hour <= 23) this.hour = hour;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }


    @Override
    public String toString() {
        return  hour + "год " +  min + "хв";
    }
}
