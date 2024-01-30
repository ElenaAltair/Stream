import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));
        //получения потока из массива целых чисел
        //Stream<Integer> numbers = Stream.of(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        //numbers.filter(x -> x > 0).filter(x -> x % 2 == 0).sorted(Comparator.naturalOrder()).forEach(n -> System.out.println(n));
        intList.stream()
                .filter(x -> x > 0)
                .filter(x -> x % 2 == 0)
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);
    }

}
