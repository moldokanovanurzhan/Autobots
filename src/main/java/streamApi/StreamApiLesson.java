package streamApi;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamApiLesson {
    public static void main(String[] args) {
        List<String> names = List.of("Anna", "Bob","Alex","Bella", "Andrew");
        //for(String name : names) {
        //    if (name.startsWith("A"))
        //        System.out.println(name.toUpperCase());

     // List<String>result =names.stream()
        //      .filter(name ->name.startsWith("A"))
       //       .map(String :: toUpperCase)
        //      .sorted()
        //      .collect(Collectors.toList());
       // System.out.println(result);

        List<Integer>numbers = List.of(1, 2, 3, 4, 5, 6);
        int r1 =0;
        for(int num : numbers){
            r1 +=num;
        }
        System.out.println(r1);
        int totalSum = numbers.stream()
                .mapToInt(num->num)
                .sum();
        System.out.println(totalSum);

        int totalElements = (int) numbers.stream()
                .count();
        System.out.println(totalElements);

        numbers.stream()
                .min(Integer::compareTo)
                .ifPresent(System.out::println);


    }
        }



