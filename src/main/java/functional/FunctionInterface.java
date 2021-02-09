package functional;

@FunctionalInterface
public interface FunctionInterface<T, U> {
    U convert(T t);
}