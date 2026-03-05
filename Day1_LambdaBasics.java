import java.util.*;
import java.util.function.*;

public class Day1_LambdaBasics{

    public static void main(String[] args){
        
        List<Integer> nums = Arrays.asList(5,2,null,9,2,10,3,null,8);
        List<String> names = Arrays.asList("Arjun",null,"bob","Alice","alex",null."Bob");

        Predicate<Integer> isEven = n -> n != null && n % 2 == 0;

        System.out.println("Even numbers");
        nums.stream()
            .filter(Objects::nonNull)
            .filter(isEven)
            .forEach(n -> System.out.print(n + ""));
            System.out.println("\n");

        Function<Integer,Integer> square = n -> n== null?0: n*n;

        System.out.println("Squares (null handled as 0)");
        nums.stream()
        .map(square)
        .forEach(n -> System.out.print(n+" "));
        System.out.println("\n");

        Consumer<Integer> printValue = n -> 
         System.out.println("Value:" + (n == null?"null":n));

         System.out.println("Printing using Consumer:");
         nums.forEach(printValue);
         System.out.println();

         Supplier<Integer> randomSupplier = ()->new Random().nextInt(100) + 1;

         System.out.println("Random numbers:");
         for(int i=0;i<3;i++){
            System.out.println(randomSupplier.get());
         }       
         System.out.println();

         Comparator<Integer> descComparator = Comparator.nullsLast((a,b)->b-a);

         List<Integer> sortedDesc = new ArrayList<>(nums);
         sortedDesc.sort(descComparator);
         


         
              

    }
}