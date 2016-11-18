package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class ens<T> implements Iterator<T> {
    int f11889b;
    T f11890c;
    final CharSequence f11891d;
    final boolean f11892e;
    int f11893f;

    abstract int mo1918a(int i);

    abstract int mo1919b(int i);

    ens() {
        this.f11889b = ent.f11898b;
    }

    public final boolean hasNext() {
        if (this.f11889b == ent.f11900d) {
            throw new IllegalStateException();
        }
        switch (enn.f11885a[this.f11889b - 1]) {
            case 1:
                return false;
            case 2:
                return true;
            default:
                return m14155b();
        }
    }

    boolean m14155b() {
        this.f11889b = ent.f11900d;
        this.f11890c = m14153a();
        if (this.f11889b == ent.f11899c) {
            return false;
        }
        this.f11889b = ent.f11897a;
        return true;
    }

    public final T next() {
        if (hasNext()) {
            this.f11889b = ent.f11898b;
            return this.f11890c;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    protected /* synthetic */ T m14153a() {
        return m14156c();
    }

    protected ens(enp enp, CharSequence charSequence) {
        this();
        this.f11893f = 0;
        this.f11892e = enp.f11887a;
        this.f11891d = charSequence;
    }

    protected String m14156c() {
        while (this.f11893f != -1) {
            int i = this.f11893f;
            int a = mo1918a(this.f11893f);
            if (a == -1) {
                a = this.f11891d.length();
                this.f11893f = -1;
            } else {
                this.f11893f = mo1919b(a);
            }
            if (this.f11892e) {
                if (i != a) {
                }
            }
            return this.f11891d.subSequence(i, a).toString();
        }
        this.f11889b = ent.f11899c;
        return null;
    }
}
