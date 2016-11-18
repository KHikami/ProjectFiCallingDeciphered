package p000;

import java.lang.ref.WeakReference;

public abstract class jjv<T> {
    WeakReference<T> f20315a;
    private T f20316b;
    private boolean f20317c = false;

    public abstract T mo3627a();

    public final synchronized T m24521b() {
        T t;
        if (!this.f20317c) {
            this.f20317c = true;
            jjw.m24524a(this);
        }
        t = this.f20315a == null ? null : this.f20315a.get();
        if (t == null) {
            t = ba.m4536a(mo3627a());
            this.f20316b = t;
            this.f20315a = new WeakReference(this.f20316b);
        }
        return t;
    }

    final synchronized void m24520a(int i) {
        Object obj = null;
        synchronized (this) {
            jjv jjv;
            if (20 <= i) {
                jjv = this;
            } else if (this.f20315a == null) {
                jjv = this;
            } else {
                obj = this.f20315a.get();
                jjv = this;
            }
            jjv.f20316b = obj;
        }
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final int hashCode() {
        return super.hashCode();
    }
}
