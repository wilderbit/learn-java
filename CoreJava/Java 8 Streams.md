# Java 8 Stream Tutorial 


- Streams bring functional programming to Java, and are supported starting in Java 8.
- Advantages of Streams:
    - Will make you a more efficient Java programmer
    - Make heavy use of lambda expressions
    - ParallelStreams make it very easy to multi-thread operations
- A stream pipeline consists of a source, followed by zero or more intermediate operations; and terminal operation.

- Source ---> Filter --> Sort --> Map --> Collect

- Streams Source: Streams can be created from Collections, Lists, Sets, Ints, Longs, doubles, lines of a file.
- Stream Operations are either intermediate or terminal.
    - **Intermediate operations** such as filter, mao, or sort return a stream so we can chain multiple intermediate operations.
    - **Terminal operations** such as forEach, collect or reduce are either void or return a non-stream result.

Intermediate Operations
-
- Zero or more intermediate operations are allowed.
- Order matters for large data-sets: filter first, then sort, or map.
- For very large data-sets use parallelStream to enable multiple threads.
- Intermediate operations include: anyMatch, flatMap, distinct, map, filter, skip, findFirst, sorted

```java
import java.uti.stream.*;import java.util.HashMap;import java.util.stream.Collectors;import java.util.stream.Stream;

class StreamTest {
    public static void main() {
        IntStream.range(1, 10).forEach(x-> System.out.println(x));
        IntStream.range(1, 10).forEach(System.out::println);
        IntStream.range(1, 10).forEach(x-> System.out.println(x));
        IntStream.range(1, 10).skip(5).forEach(x-> System.out.println(x));
        IntStream.range(1, 10).skip(5).sum();
        Stream.of("Abrar", "Khan", "Saleem", "Sonu", "Javed", "Guddi").sorted().forEach(System.out::println);
        Stream.of("Abrar", "Khan", "Saleem", "Sonu", "Javed", "Guddi").sorted().findFirst().ifPresent(System.out::println);
        String[] names = {"Al", "Ankit", "Kushal", "Brent", "Sarika", "Amanda", "Hans", "Shivika"};
        Arrays.stream(names).filter(x->x.startsWith("S")).sorted().forEach(System.out::print);
        Arrays.stream(new int[]{1,2,3,4,5,6,7,8,9}).map(x -> x*x).average().ifPresent(System.out::print);
        Stream<String> bands = Files.lines(Paths.get("bands.txt"));
        bands.sorted().filter(x->x.length() > 1).count();
        
        Stream<String> bands1 = Files.lines(Paths.get("bands.txt"))
            .filter(x -> x.contains("it"))
            .collect(Collectors.toList());
        bands1.forEach(x -> System.out.println);
        HashMap<String, Integer> hm = Stream.of("A,1,2,3,4,5", "B,3,4,5,6,7", "C,5,3,23,4423")
            .map(x -> x.split(","))
            .filter(x -> x.length > 2)
            .collect(Collectors.toMap(x-> x[0], x-> Integer.parseInt(x[1])));
    }
}
```