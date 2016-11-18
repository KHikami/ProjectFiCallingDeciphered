package defpackage;

import java.lang.ref.WeakReference;

public abstract class jjv<T> {
    WeakReference<T> a;
    private T b;
    private boolean c = false;

    public abstract T a();

    public final synchronized T b() {
        T t;
        if (!this.c) {
            this.c = true;
            jjw.a(this);
        }
        t = this.a == null ? null : this.a.get();
        if (t == null) {
            t = ba.a(a());
            this.b = t;
            this.a = new WeakReference(this.b);
        }
        return t;
    }

    final synchronized void a(int i) {
        Object obj = null;
        synchronized (this) {
            jjv jjv;
            if (20 <= i) {
                jjv = this;
            } else if (this.a == null) {
                jjv = this;
            } else {
                obj = this.a.get();
                jjv = this;
            }
            jjv.b = obj;
        }
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final int hashCode() {
        return super.hashCode();
    }
}
