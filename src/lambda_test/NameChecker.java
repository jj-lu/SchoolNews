package lambda_test;

@FunctionalInterface
public interface NameChecker {
    boolean check(Person person);
}
