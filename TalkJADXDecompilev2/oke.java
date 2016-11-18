package defpackage;

public final class oke<T> {
    private final String a;
    private final T b;

    oke(String str) {
        this(str, null);
    }

    private oke(String str, T t) {
        this.a = (String) bm.a(str, "name");
        this.b = null;
    }

    public String toString() {
        return this.a;
    }

    public T a(ojz ojz) {
        T a = ojz.a(this);
        return a == null ? this.b : a;
    }
}
