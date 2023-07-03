import java.util.*;

public class Main {

  public static void main(String[] args) {
    List<Element> periodicTable = createPeriodicTable();
    System.out.printf("This is your periodic table: %s\n", periodicTable);
    System.out.println("Insert a new element into your periodic table");
    Scanner scanner = new Scanner(System.in);
    // aggiungere il codice necessario per inserire un nuovo elemento all'interno della tavola periodica implementata da List
  }

  private static List<Element> createPeriodicTable() {

    Element hydrogen = new Element("Hydrogen", "H", 1, 1.0078);
    Element helium = new Element("Helium", "He", 2, 4.0026);
    Element lithium = new Element("Lithium", "Li", 3, 6.9410);
    Element beryllium = new Element("Beryllium", "Be", 4, 9.0122);
    Element boron = new Element("Boron", "B", 5, 10.811);
    Element carbon = new Element("Carbon", "C", 6, 12.011);

    List<Element> periodicTable = new ArrayList<>();
    periodicTable.add(hydrogen);
    periodicTable.add(helium);
    periodicTable.add(lithium);
    periodicTable.add(beryllium);
    periodicTable.add(boron);
    periodicTable.add(carbon);

    return periodicTable;
  }

}
