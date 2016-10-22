package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: ens */
abstract class ens<T> implements Iterator<T> {
    int b;
    T c;
    final CharSequence d;
    final boolean e;
    int f;

    abstract int a(int i);

    abstract int b(int i);

    ens() {
        this.b = ent.b;
    }

    public final boolean hasNext() {
        if (this.b == ent.d) {
            throw new IllegalStateException();
        }
        switch (enn.a[this.b - 1]) {
            case wi.j /*1*/:
                return false;
            case wi.l /*2*/:
                return true;
            default:
                return b();
        }
    }

    boolean b() {
        this.b = ent.d;
        this.c = a();
        if (this.b == ent.c) {
            return false;
        }
        this.b = ent.a;
        return true;
    }

    public final T next() {
        if (hasNext()) {
            this.b = ent.b;
            return this.c;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    protected /* synthetic */ T a() {
        return c();
    }

    protected ens(enp enp, CharSequence charSequence) {
        this();
        this.f = 0;
        this.e = enp.a;
        this.d = charSequence;
    }

    protected String c() {
        while (this.f != -1) {
            int i = this.f;
            int a = a(this.f);
            if (a == -1) {
                a = this.d.length();
                this.f = -1;
            } else {
                this.f = b(a);
            }
            if (this.e) {
                if (i != a) {
                }
            }
            return this.d.subSequence(i, a).toString();
        }
        this.b = ent.c;
        return null;
    }
}
