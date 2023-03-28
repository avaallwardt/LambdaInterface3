@FunctionalInterface
// functional interface can only have one method

public interface SaveHandler {

    public void saveObject(Object object);
    // multiple classes can implement an interface but will implement in a different way
    // i.e. all saving but will save a different way
    // so header for method is empty --> contract

}
