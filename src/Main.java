import java.util.*;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        //Arrays
       Cat[] cats = new Cat[3];
//        cats[0] = new Cat("Tomas");
//        cats[1] = new Cat("Dgim");
//        cats[2] = new Cat("Belka");
//        System.out.println(Arrays.toString(cats));
//    }
        // ArrayList
        ArrayList<Cat> catsList = new ArrayList<>();
        for (Cat cat : cats) {
            catsList.add(cat);
        }
        catsList.add(new Cat("Tomas2"));

        Cat cat = catsList.get(0); // поиск индекса
        System.out.println(cat);

        System.out.println(catsList.indexOf(cat));

        catsList.add(2, cat);
        catsList.set(2, new Cat("Меня сюда вставили"));

        System.out.println(catsList.toString());
        System.out.println(catsList.size());

        // LinkedList
        String str1 = new String("Hello world");
        String str2 = new String("My name is Future");
        String str3 = new String("I love Java");

        LinkedList<String> artemBio = new LinkedList<>();
        artemBio.add(str1);
        artemBio.add(str2);
        artemBio.add(str3);

        System.out.println(artemBio);

        artemBio.remove(1);
        System.out.println(artemBio);

        // Linked List on practice
     LinkedList<Car> cars = new LinkedList<>();
     Car ferrary = new Car("Ferrary Spider");
     Car buggati = new Car("Veyron");
     Car mercedes = new Car("Mersedex Benz");

     cars.addAll(Arrays.asList(ferrary,buggati,mercedes));
     System.out.println(cars);

     cars.addFirst(new Car("Ford gt300"));
     cars.addLast(new Car("Fiata"));
     System.out.println(cars);

     // ArrayList vs LinkedList
     List<Integer> list = new LinkedList<>();
     for (int i = 0; i < 5000000; i++){
      list.add(new Integer(i));
     }
     long start = System.currentTimeMillis();
     for (int i = 0; i <100; i++){
      list.add(2000000, Integer.MAX_VALUE);
     }
     System.out.println("Время работы для LinkedList в (миллисекундах)" + (System.currentTimeMillis() - start));
     list = new ArrayList<>();
     for (int i = 0; i < 5000000; i++){
      list.add(new Integer(i));
     }
     start = System.currentTimeMillis();
     for (int i = 0; i<100;i++){
      list.add(2000000,Integer.MAX_VALUE);
     }
     System.out.println("Время работы для ArrayList в (миллиссекундах)" + (System.currentTimeMillis() - start));

     // Set
     Set<String> states = new HashSet<>();
     states.add("Germany");
     states.add("France");
     states.add("Italy");

     boolean isAdded = states.add("Italy");
     System.out.println(" Italy is added:  " + isAdded);
     System.out.println("Set contains: " + states.size());

     System.out.println(states);
     states.remove("Germany");
     System.out.println(states);
  // Map
     Map<Integer,String> statesMap = new HashMap<>();
     statesMap.clear();
     statesMap.put(1,"Germany");
     statesMap.put(2,"Spain");
     statesMap.put(3,"France");
     statesMap.put(4,"Italy");

     System.out.println(statesMap.keySet());

     statesMap.remove(2);
     for (Map.Entry<Integer,String> item : statesMap.entrySet()){
      System.out.printf("|Key: %d | value: %s \n",item.getKey(),item.getValue());
     }
     String first = statesMap.get(2);
     System.out.println(first);
      }
    }
