package lambdas;

import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {

        List<Integer> intList = List.of(1, 3, 4, 6, 7, 8, 9);
        List<String> streamInt = intList.stream() // Stream<Integer>
                .map(x -> x + 1) // Stream<Integer>
                .filter(x -> x % 2 == 0) // Stream<Integer>
                .map(Objects::toString) // Stream<String>
                .collect(Collectors.toList()); // List<String>
        System.out.println(streamInt);

        Integer x = intList.stream()
                .reduce(0, Math::addExact);

        Product pasta = new Product(1.5);
        Product latte = new Product(1.75);
        Product cheerios = new Product(3.75);
        List<Product> shoppingCart = List
                .of(pasta, pasta, pasta, latte, latte, cheerios, cheerios);

        Double shoppingCartCost = shoppingCart.stream()
                .map(Product::getCost)
                .reduce(0d, Double::sum);
        
        Double shoppingCartCostOld = 0d;
        for (Product p : shoppingCart) {
            shoppingCartCostOld += p.getCost();
        }


    }
}
