import android.util.Log;

final class bax<T> implements ll<T> {
    private final baw<T> a;
    private final baz<T> b;
    private final ll<T> c;

    bax(ll<T> llVar, baw<T> baw_T, baz<T> baz_T) {
        this.c = llVar;
        this.a = baw_T;
        this.b = baz_T;
    }

    public T a() {
        T a = this.c.a();
        if (a == null) {
            a = this.a.a();
            if (Log.isLoggable("FactoryPools", 2)) {
                String valueOf = String.valueOf(a.getClass());
                new StringBuilder(String.valueOf(valueOf).length() + 12).append("Created new ").append(valueOf);
            }
        }
        if (a instanceof bay) {
            ((bay) a).j_().a(false);
        }
        return a;
    }

    public boolean a(T t) {
        if (t instanceof bay) {
            ((bay) t).j_().a(true);
        }
        this.b.a(t);
        return this.c.a(t);
    }
}
