import java.util.Arrays;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

@FunctionalInterface
interface Temp {

    void temp(String s);
}

class Person {

    String firstName;
    String lastName;

    Person() {
    }

    Person(String fname, String lname) {
        this.firstName = fname;
        this.lastName = lname;
    }

    public String toString() {
        return "Person { firstName: " + firstName + " lastName: " + lastName + " }";
    }
}

interface PersonFactory<P extends Person> {

    P create(String fname, String lname);
}

public class FuncInterface {

    static void funMethod(String s) {
        System.out.println("Hello Java" + s);
    }

    public static void main(String[] args) {

        // Example1
        Temp temp = (String v1) -> System.out.println("Hello Java" + v1);
        temp.temp("5");

        // Example2
        Temp temp2 = FuncInterface::funMethod;
        temp2.temp("10");

        // Constructor Example
        //The Java compiler automatically chooses the right constructor by
        // matching the signature of PersonFactory.create
        PersonFactory<Person> personFactory = Person::new;
        Person person = personFactory.create("Abrar", "Khan");
        System.out.println(person);

        // Lambda Scopes
        Lambda l = new Lambda();
        l.testIt();
        System.out.println("Lambda " + l.outerNum + " " + l.outerStaticNum);

        // Predicate
        PredicateExample.predicate();

        // Functional
        FunctionsExample.functional();
    }
}

class Lambda {

    static int outerStaticNum;
    int outerNum;

    void testIt() {
        Temp t = (from) -> {
            outerNum = 23;
        };
        t.temp("Hello");

        Temp t1 = (from) -> {
            outerStaticNum = 10;
        };
        t1.temp("Hello");
    }
}

class PredicateExample {

    public static void predicate() {
        Predicate<String> predicate = (s) -> s.length() > 0;
        System.out.println("predicate.test() = " + predicate.test("Abrar Khan"));

        Predicate<Predicate> predicate1 = Objects::isNull;
        System.out.println(predicate1.test(predicate));

        Predicate<String> predicate2 = String::isEmpty;
        System.out.println(predicate2.negate().test("ehe"));
    }
}

class FunctionsExample {

    public static void functional() {
        Function<String, Integer> toInteger = Integer::valueOf;
        System.out.println("Integer Value = " + toInteger.apply("123"));
        Function<String, String> backToString = toInteger.andThen(String::valueOf);
        System.out.println("backToString.apply(\"123\") = " + backToString.apply("123"));
    }
}
