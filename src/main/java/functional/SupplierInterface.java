package functional;

@FunctionalInterface
public interface SupplierInterface<T> {
    T get();
}