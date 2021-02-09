package functional;

@FunctionalInterface
public interface ConsumerInterface<T> {
    char[] accept(T t);
}