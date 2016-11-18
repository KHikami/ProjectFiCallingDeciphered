package defpackage;

public final class ln<T> extends lm<T> {
    private final Object a = new Object();

    public ln(int i) {
        super(i);
    }

    public T a() {
        T a;
        synchronized (this.a) {
            a = super.a();
        }
        return a;
    }

    public boolean a(T t) {
        boolean a;
        synchronized (this.a) {
            a = super.a(t);
        }
        return a;
    }
}
