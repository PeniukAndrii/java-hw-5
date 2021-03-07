package Task2;

import java.util.Objects;

public class Seance implements Comparable<Seance> {
    private Movie movie;
    private Time startTime;
    private Time endTime;

    public Seance() {
    }

    public Seance(Movie movie, Time startTime) {
        this.movie = movie;
        this.startTime = startTime;
        this.endTime = this.movie.calcEndTime(this.startTime, this.movie.getDuration());
    }


    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Seance seance = (Seance) o;
        return Objects.equals(movie, seance.movie) && Objects.equals(startTime, seance.startTime) && Objects.equals(endTime, seance.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movie, startTime, endTime);
    }

    @Override
    public int compareTo(Seance o) {
        return this.getStartTime().getHour() - o.getStartTime().getHour();
    }

    @Override
    public String toString() {
        return '\n' + "Фільм:'" + movie  +
                " ,Початок: " + startTime +
                ", Кінець: " + endTime;
    }
}
