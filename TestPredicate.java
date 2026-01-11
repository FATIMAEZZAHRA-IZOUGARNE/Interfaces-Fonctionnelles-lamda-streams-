import java.util.List;
import java.util.Arrays;
import java.util.function.Predicate;

import java.util.function.Function;

public class TestPredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // Liste d'entiers
        List<Integer> numbers = Arrays.asList(12, 3, 0, 11, 8, 21, 14, 222, 99, 10);

        // Predicate pour tester si un nombre est pair
        Predicate<Integer> isEven = n -> n % 2 == 0;

        // Boucle for 
        for (int i = 0; i < numbers.size(); i++) {
            Integer n = numbers.get(i);

            if (isEven.test(n)) { // test du predicate
                System.out.println(n);
            }
        }
		
		///en utilisant Stream  
		///List<Integer> numbers = Arrays.asList(12, 3, 0, 11, 8, 21, 14, 222, 99, 10);
		
		///Predicate<Integer> nbrIs = s->s%2 ==0;
		
		///numbers.stream()
		     /// .filter(nbrIs)
		     /// .forEach(System.out::println);
		
        List<String> words = Arrays.asList("java", "lambda", "stream");

        Function<String, String> toUpper = s -> s.toUpperCase();
        Function<String, Integer> length = s -> s.length();

        for (String word : words) {
            System.out.println(toUpper.apply(word) + " (" + length.apply(word) + ")");
        }
	}

}
