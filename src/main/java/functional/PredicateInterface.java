package functional;

@FunctionalInterface
public interface PredicateInterface<T> {
    boolean check(T t);
}