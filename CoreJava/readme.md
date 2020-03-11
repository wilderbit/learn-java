
### Built-in Functional Interface

Predicates
-
Predicates are boolean-valued functions of one arguments.
```java

Predicate<String> predicate = (s) -> s.length() > 0;

predicate.test("foo");              // true
predicate.negate().test("foo");     // false

Predicate<Boolean> nonNull = Objects::nonNull;
Predicate<Boolean> isNull = Objects::isNull;

Predicate<String> isEmpty = String::isEmpty;
Predicate<String> isNotEmpty = isEmpty.negate();
```

Functions
---
Functions accept one argument and produce a result. Default methods can be used to chain multiple
multiple functions together(compose, andThen).

```java
Function<String, Integer> toInteger = Integer::valueOf;
Function<String, String> backToString = toInteger.andThen(String::valueOf);
backToString.apply("123");     // "123"
```

Suppliers
-
Suppliers produces the result of given generic type. Unlike Functions, Suppliers don't accept args.
```java
Supplier<Person> personSupplier = Person::new;
personSupplier.get();   // new Person
```

Consumers
-
Consumers represents operation to be performed on a single input argument.
```java
Consumer<Person> greeter = (p) -> System.out.println("Hello, " + p.firstName);
greeter.accept(new Person("Luke", "Skywalker"));
```

Comparator
-
```java
Comparator<Person> comparator = (p1, p2) -> p1.firstName.compareTo(p2.firstName);

Person p1 = new Person("John", "Doe");
Person p2 = new Person("Alice", "Wonderland");

comparator.compare(p1, p2);             // > 0
comparator.reversed().compare(p1, p2);  // < 0
```

Optionals
-
Optionals are not FunctionalInterface, instead it's a nifty utility to prevent `NullPointeException`.
Optional is a simple container for a value which may be `null` or `non-null`. Think of a method 
which may return a `non-null` result but sometimes return nothing. Instead of returning `null` 
you return an `Optional` in Java 8.
```java
Optional<String> optional = Optional.of("bam");

optional.isPresent();           // true
optional.get();                 // "bam"
optional.orElse("fallback");    // "bam"
optional.ifPresent((s) -> System.out.println(s.charAt(0)));     // "b"

```