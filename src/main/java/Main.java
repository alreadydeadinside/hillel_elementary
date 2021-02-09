import entities.Human;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //first
        List<Object> streamEmpty = Stream
                .empty()
                .sorted()
                .skip(1)
                .collect(Collectors.toList());
        streamEmpty.forEach(System.out::println);

        //second
        List<String> listNames = Arrays.asList("Antony", "Will", "John", "Taylor", "Sanchez");

        Stream<String> streamNames = listNames.stream()
                .filter(string -> string.length() < 5)
                .map(String::toUpperCase);
        streamNames.forEach(System.out::println);

        //third
        Stream<Object> streamRandom = Stream.of("Sanchez", 12, "Taylor", 17);
        List<Object> listOfNumbers = streamRandom
                .collect(Collectors.toList());
        listOfNumbers.forEach(System.out::println);

        //fourth
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "one");
        hashMap.put(2, "two");
        hashMap.put(3, "three");
        hashMap.put(4, "four");
        hashMap.put(5, "five");

        Set<Object> optionalMap = new HashSet<>(hashMap.values());
        optionalMap.forEach(System.out::println);

        //fifth
        List<String> digits = Arrays.asList("1", "2", "3", "4","4","6","7","8","9","10");
        List<Integer> integerList = digits.stream()
                .skip(1)
                .limit(8)
                .map(Integer::parseInt)
                .filter(n -> n%2 == 0)
                .distinct()
                .collect(Collectors.toList());
        integerList.forEach(System.out::println);

        //sixth
        Stream<String> namesStream = Stream.of("Antony", "Will", "John", "Taylor", "Sanchez", "Carly", "Nate", "Frank");
        Optional<String> parallelStream = namesStream.parallel()
                .sorted()
                .filter(string -> string.length() > 4)
                .findFirst();
        System.out.println(parallelStream.orElse("error"));

        //seventh
        ConvertTo convert = new ConvertTo();

        List<String> namesList = Arrays.asList("Will", "John", "Taylor", "Sanchez", "Carly", "Frank");
        Set<Human> humans = namesList.stream()
                .map(ConvertTo::trimString)
                .map(convert::testString)
                .map(String::toUpperCase)
                .map(Human::new)
                .collect(Collectors.toSet());
        humans.forEach(human -> System.out.println(human.getName()));
    }
}