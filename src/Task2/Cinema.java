package Task2;

import java.util.*;

public class Cinema {
    private Map<Days, Schedule> treeMap;
    private Time open;
    private Time close;

    public Cinema() {
    }

    public Cinema(Map<Days, Schedule> treeMap, Time open, Time close) {
        this.treeMap = treeMap;
        this.open = open;
        this.close = close;
    }

    public Map<Days, Schedule> getTreeMap() {
        return treeMap;
    }

    public void setTreeMap(Map<Days, Schedule> treeMap) {
        this.treeMap = treeMap;
    }

    public Time getOpen() {
        return open;
    }

    public void setOpen(Time open) {
        this.open = open;
    }

    public Time getClose() {
        return close;
    }

    public void setClose(Time close) {
        this.close = close;
    }

    public void addSeance(Days day, String title, int durationHour, int durationMin, int startHour, int startMin){
        treeMap.put(day,new Schedule(Collections.singleton(new Seance(new Movie(title, new Time(durationHour, durationMin)), new Time(startHour, startMin)))));
    }

   /* public void addSeances(Days day, Schedule seances){
        treeMap.put(day,seances);
    }*/
//    public void addSeances(String day, Set<Seance> seances){
//        for (Map.Entry<Days, Schedule> next : treeMap.entrySet()) {
//            if (next.getKey().getDay().equals(day)) {
//                treeMap.put(next.getKey(), new Schedule(seances));
//            }
//        }
//    }
    public void removeMovie(String movie){
        for (Map.Entry<Days, Schedule> next : treeMap.entrySet()) {
            next.getValue().removeSeance(movie);
          }
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cinema cinema = (Cinema) o;
        return Objects.equals(treeMap, cinema.treeMap) && Objects.equals(open, cinema.open) && Objects.equals(close, cinema.close);
    }

    @Override
    public int hashCode() {
        return Objects.hash(treeMap, open, close);
    }

    @Override
    public String toString() {
        return "Cinema:" + ", Працює з: " + open + ", До: " + close + treeMap ;
    }
}
