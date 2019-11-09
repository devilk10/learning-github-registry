package learning.github.registry;

public class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Boolean isEligibleForVoting(int minAgeForVoting) {
        return age >= minAgeForVoting;
    }
}
