package Task2;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //Даний проект має такі сутності: Days, Time, Movie, Seance, Schedule, Cinema.
        //enum Days:
        //  - прописати дні тижня;
        //Time:
        //    - int min, int hour;
        //    - передбачити межі для цих полів (для min 0..59, для hour 0..23);
        //Movie:
        //   - String title,
        //   Time duration (або ж можете забити на власний Time і використати java.time.Duration, як і тут, так і в інших класах. це за власним бажанням)
        //Seance:
        //   - Movie movie, Time startTime, Time endTime;
        //   - в конструктор має надходити параметрами значення для перших двох полів, третє поле повинне обчислюватись (start + duration);
        //Schedule:
        //   - TreeSet <Seance> (в полі пишемо Set <Seance>, а в конструкторі вже =new TreeSet <Seance>() );
        //   - Сортування по startTime.
        //   - методи: addSeance (Seance), removeSeance (Seance);
        //Cinema:
        //   - TreeMap<Days, Schedule>, Time open, Time close;
        //   - врахувати час відкриття і закриття при формуванні сеансів!
        //   - методи: addSeances (String day, Seance...seance) (додає набір сеансів в конкретний день),
        //   addSeance (Seance, String) (додає один сеанс в конкретний день),
        //   removeMovie(Movie) (повністю видаляє усі сеанси вказаного фільму з розкладу),
        //   removeSeance (Seance, String) (видаляє конкретний сеанс фільму в конкретний день, який задається параметром String).
        //
        //Main class:
        //   - створення об'єкту Cinema;
        //   - викликаємо всі методи Cinema
        //
        // Для кожного класу зробити адекватний toString, щоб все було читабельно і доступно.
        // Там де потрібно, зробити compareTo(). Маєте якісь власні ідеї для розробки - будь-ласка.
        // Це моделювання роботи кінотеатру, тому все що наблизить програму до реальності вітається.

        Set<Seance> seanceSet = new TreeSet<>();
        seanceSet.add(new Seance(new Movie("Шрек", new Time(2,0)), new Time(17,30)));
        seanceSet.add(new Seance(new Movie("Кіт в чоботах", new Time(2,5)), new Time(22,0)));
        seanceSet.add(new Seance(new Movie("Бетмен", new Time(2,20)), new Time(11,30)));

//        Schedule dopSeance = new Schedule(seanceSet);
//        dopSeance.addSeance("Форсаж 1",2,0, 8,0);
//        dopSeance.addSeance("Форсаж 2",2,1, 10,0);

        Set<Seance> dopSeance = new TreeSet<>();
        dopSeance.add(new Seance(new Movie("Форсаж 1", new Time(2,0)), new Time(8,30)));
        dopSeance.add(new Seance(new Movie("Форсаж 2", new Time(2,5)), new Time(10,0)));



        Schedule schedule1 = new Schedule(seanceSet);
        Schedule schedule2 = new Schedule(seanceSet);
        Schedule schedule3 = new Schedule(seanceSet);
        Schedule schedule4 = new Schedule(seanceSet);
        Schedule schedule5 = new Schedule(seanceSet);
        Schedule schedule6 = new Schedule(seanceSet);
        Schedule schedule7 = new Schedule(seanceSet);
        schedule1.addSeance("Месники 1",3,0,13,0);
        schedule2.addSeance("Месники 1",3,0,13,0);
        schedule3.addSeance("Месники 2",3,5,13,0);
        schedule4.addSeance("Месники 3",3,4,13,0);
        schedule5.addSeance("Месники 4",3,3,13,0);
        schedule6.addSeance("Месники 5",3,2,13,0);
        schedule7.addSeance("Месники 6",3,1,13,0);
        schedule1.addSeance("Месники 2",2,59,14,0);
        schedule1.removeSeance("Месники 1");
        Map<Days, Schedule> cinema = new TreeMap<>();
        cinema.put(Days.Monday, schedule1);
        cinema.put(Days.Tuesday, schedule2);
        cinema.put(Days.Wednesday, schedule3);
        cinema.put(Days.Thursday, schedule4);
        cinema.put(Days.Friday, schedule5);
        cinema.put(Days.Saturday, schedule6);
        cinema.put(Days.Sunday, schedule7);
        Cinema cinemas = new Cinema(cinema, new Time(8,0), new Time(2,0));
//         cinemas.addSeances("Wednesday", dopSeance);
        cinemas.removeMovie("Бетмен");
//        cinemas.addSeance(Days.Wednesday, "Форсаж 3",2,1,12,0);
        System.out.println(cinemas);
    }
}
