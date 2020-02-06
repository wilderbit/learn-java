import java.util.*;

class Developer {

    String name;
    Integer salary;
    Integer age;

    public Developer(String name, Integer salary, Integer age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String toString() {
        return "Developer [name=" + name.toString() + ", " + "salary=" + salary.toString() + ", " + "age=" + age.toString() + "]";
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        List<Developer> developers = getDevelopers();
        System.out.println("Before Sort");
        for (Developer dev: developers) {
            System.out.println(dev);
        }

        Collections.sort(developers, new Comparator<Developer>(){
            public int compare(Developer d1, Developer d2) {
                return d1.getAge().compareTo(d2.getAge());
            }
        });

        System.out.println("Before Sort");
        for (Developer dev: developers) {
            System.out.println(dev);
        }
    }

    private static List<Developer> getDevelopers() {
        List<Developer> result = new ArrayList<Developer>();
        result.add(new Developer("qbrar", 10000, 56));
        result.add(new Developer("zeepak", 10000, 34));
        result.add(new Developer("jsit", 10000, 16));
        result.add(new Developer("iris", 10000, 45));
        return result;
    }
}
