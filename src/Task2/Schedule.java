package Task2;


import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;


public class Schedule {
    private Set<Seance> treeSet;

    public Schedule(Seance seances) {
    }

    public Schedule(Set<Seance> treeSet) {
        this.treeSet = new TreeSet<Seance>(treeSet);
    }

    public Set<Seance> getTreeSet() {
        return treeSet;
    }

    public void setTreeSet(Set<Seance> treeSet) {
        this.treeSet = treeSet;
    }

    public void addSeance(String title,  int durationHour, int durationMin, int startHour, int startMin){
        treeSet.add(new Seance(new Movie(title, new Time(durationHour,durationMin)), new Time(startHour, startMin)));
    }

    public void removeSeance(String title){
        treeSet.removeIf(seance -> seance.getMovie().getTitle().equals(title));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Schedule schedule = (Schedule) o;
        return Objects.equals(treeSet, schedule.treeSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(treeSet);
    }


    @Override
    public String toString() {
        return treeSet + "";
    }


}
