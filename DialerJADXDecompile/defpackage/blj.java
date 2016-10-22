package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* renamed from: blj */
abstract class blj implements Iterator {
    int a;
    final CharSequence b;
    final boolean c;
    int d;
    private Object e;

    abstract int a(int i);

    abstract int b(int i);

    blj() {
        this.a = blk.b;
    }

    public final boolean hasNext() {
        if (this.a == blk.d) {
            throw new IllegalStateException();
        }
        switch (blf.a[this.a - 1]) {
            case rq.b /*1*/:
                return false;
            case rq.c /*2*/:
                return true;
            default:
                this.a = blk.d;
                this.e = a();
                if (this.a == blk.c) {
                    return false;
                }
                this.a = blk.a;
                return true;
        }
    }

    public final Object next() {
        if (hasNext()) {
            this.a = blk.b;
            return this.e;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    protected /* synthetic */ Object a() {
        return b();
    }

    protected blj(blg blg, CharSequence charSequence) {
        this();
        this.d = 0;
        this.c = blg.a;
        this.b = charSequence;
    }

    protected String b() {
        while (this.d != -1) {
            int i = this.d;
            int a = a(this.d);
            if (a == -1) {
                a = this.b.length();
                this.d = -1;
            } else {
                this.d = b(a);
            }
            if (this.c) {
                if (i != a) {
                }
            }
            return this.b.subSequence(i, a).toString();
        }
        this.a = blk.c;
        return null;
    }
}
