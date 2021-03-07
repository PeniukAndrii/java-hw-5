package Task2;

import java.util.Objects;

public class Movie {
    private String title;
    private Time duration;

    public Movie() {
    }

    public Movie(String title, Time duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Time getDuration() {
        return duration;
    }

    public void setDuration(Time duration) {
        this.duration = duration;
    }

    public Time calcEndTime(Time start, Time end){
        int hour = start.getHour() + end.getHour();
        int min = start.getMin() + end.getMin();
        if(min >= 60){
            hour = hour + 1;
            min = min - 60;
        }
        if(hour >= 24){
            hour = hour -24;
        }
        return new Time(hour,min);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Objects.equals(title, movie.title) && Objects.equals(duration, movie.duration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, duration);
    }



    @Override
    public String toString() {
        return   title + '\''  + ", Тривалість: " + duration;
    }
}
