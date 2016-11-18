package defpackage;

public abstract class mps<T> {
    final T b;

    public abstract String a();

    public mps(T t) {
        this.b = t;
    }

    public final String toString() {
        return a();
    }
}
