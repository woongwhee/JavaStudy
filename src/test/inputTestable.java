package test;

public abstract class inputTestable<T> extends testable {
    protected T input;
    public void setInput(T input) {
        this.input = input;
    }
}
