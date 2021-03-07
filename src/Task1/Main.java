package Task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Створити клас Зооклуб. В цьому класі створити одне поле: private Map <Task1.Person, List <Task1.Pet>> club;
        // В мейн методі створити меню, яке буде реалізовувати наступні функції:

        List<Pet> pets1 = new ArrayList<>();
        List<Pet> pets2 = new ArrayList<>();
        List<Pet> pets3 = new ArrayList<>();
        pets1.add(new Pet("cat","Albert"));
        pets1.add(new Pet("dog","Einstein"));
        pets1.add(new Pet("fish","Gold"));
        pets2.add(new Pet("cat","Mas9"));
        pets2.add(new Pet("dog","Elma"));
        pets3.add(new Pet("cat","Piton"));
        pets3.add(new Pet("dog","Stark"));

        Map<Person, List<Pet>> map = new HashMap<>();
        // 1) додати учасника в клуб;
        // 2) додати тваринку до учасника клубу.
        map.put(new Person("Anton"), pets1);
        map.put(new Person("Oleg"), pets2);
        map.put(new Person("Ira"), pets3);

        // 3) видалити тваринку з власника.
        map.get(new Person("Anton")).remove(new Pet("dog","Einstein"));
        // 4) видалити учасника клубу.
        map.remove(new Person("Oleg"));

        // 5) видалити конкретну тваринку з усіх власників.
        // map.forEach((person, pets) -> pets.removeIf(pet -> pet.getType().equals("cat")));
        //or
        for (Map.Entry<Person, List<Pet>> next : map.entrySet()) {
            next.getValue().removeIf(pet -> pet.getType().equals("fish"));
        }
        // or map.forEach((person, pets) -> pets.removeIf(pet -> pet.getName().equals("Stark")));

        // 6) вивести на екран зооклуб.
        ZooClub zooClub = new ZooClub(map);
        System.out.println(zooClub);
    }
}
