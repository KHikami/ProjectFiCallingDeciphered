package p000;

import android.util.Log;

final class bax<T> implements ll<T> {
    private final baw<T> f2744a;
    private final baz<T> f2745b;
    private final ll<T> f2746c;

    bax(ll<T> llVar, baw<T> baw_T, baz<T> baz_T) {
        this.f2746c = llVar;
        this.f2744a = baw_T;
        this.f2745b = baz_T;
    }

    public T mo436a() {
        T a = this.f2746c.mo436a();
        if (a == null) {
            a = this.f2744a.mo341a();
            if (Log.isLoggable("FactoryPools", 2)) {
                String valueOf = String.valueOf(a.getClass());
                new StringBuilder(String.valueOf(valueOf).length() + 12).append("Created new ").append(valueOf);
            }
        }
        if (a instanceof bay) {
            ((bay) a).j_().mo438a(false);
        }
        return a;
    }

    public boolean mo437a(T t) {
        if (t instanceof bay) {
            ((bay) t).j_().mo438a(true);
        }
        this.f2745b.mo435a(t);
        return this.f2746c.mo437a(t);
    }
}
