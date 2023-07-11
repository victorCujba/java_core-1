import java.util.*;

public class CollectionExample {

    public static void main(String[] args) {
        List<String> listOfString = List.of("hello", "world", "test", "prova");
        List<String> arrayListOfString = new ArrayList<>();
        System.out.println(listOfString);

        Set<String> setOfString = new HashSet<>();
        setOfString.add("Ciao");
        setOfString.add("Ciao");
        setOfString.add("Hello");
        for (String s: setOfString) {
            System.out.println(s);
        }

        Map<Integer, List<String>> mapOfString = new HashMap<>();
        mapOfString.put(1, List.of("Hydrogen", "Hello", "nuovo valore"));
        mapOfString.put(6, List.of("Carbon"));
        mapOfString.put(8, List.of("Carbon"));
        mapOfString.put(6, List.of("Test"));
        System.out.println(mapOfString);
        mapOfString.containsKey(1);
        mapOfString.containsValue("String");



    }

}
