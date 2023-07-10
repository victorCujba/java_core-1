package lambdas;

import oop.Car;

import java.util.function.*;
import java.util.stream.Stream;

public class LambdaTypeExample {

    public static void main(String[] args) {
        Predicate<Integer> p = x -> x % 2 == 0;

        Consumer<String> c = System.out::println;

        Supplier<Car> s0 = () -> new Car();
        Supplier<Car> s1 = Car::new;

        Function<Integer, String> f0 = i -> i.toString();
        Function<Integer, String> f1 = Object::toString;

        Function<Integer, Integer> sumOfHimself = i -> i + i;

        Function<Integer, Integer> foo = i -> (i % 2 == 0) ? (i + 1) : (i + 2);





    }

}
