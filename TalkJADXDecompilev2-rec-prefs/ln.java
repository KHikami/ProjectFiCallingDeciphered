package p000;

public final class ln<T> extends lm<T> {
    private final Object f25721a = new Object();

    public ln(int i) {
        super(i);
    }

    public T mo436a() {
        T a;
        synchronized (this.f25721a) {
            a = super.mo436a();
        }
        return a;
    }

    public boolean mo437a(T t) {
        boolean a;
        synchronized (this.f25721a) {
            a = super.mo437a(t);
        }
        return a;
    }
}
