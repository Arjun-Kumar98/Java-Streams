import java.util.*;
import java.util.function.*;

public class Day1_LambdaBasics{

    public static void main(String[] args){

        Runnable task = () -> System.out.println("Running a lambda Runnable");

        task.run();

        Predicate<Integer> isEven = n -> n ! = null && n % 2 == 0;

        if(isEven.test(num)){
            System.out.println(num+" is even");
        }
        
        Function<Integer,Integer> square = n->n == null ? 0:n*n;

        Integer value = 5;

        System.out.println("Square:" + square.apply(value));

        Consumer<String> printer = s -> {
              if(s!=null){
                System.out.println("Printing: " +s);
              }

        };
        printer.accept("Hello Lambda")
        
        Supplier<Integer> randomSupplier = () -> new Random().nextInt(100)+1;

        System.out.println("Random number :" + randomSupplier.get());

    }
}