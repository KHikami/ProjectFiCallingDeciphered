package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class mdw<T> implements Iterator<T> {
    int a;
    final CharSequence b;
    final mdz c;
    final boolean d;
    int e;
    int f;
    private T g;

    abstract int a(int i);

    abstract int b(int i);

    protected mdw() {
        this.a = mdy.b;
    }

    public final boolean hasNext() {
        bm.b(this.a != mdy.d);
        switch (mdx.a[this.a - 1]) {
            case 1:
                return true;
            case 2:
                return false;
            default:
                this.a = mdy.d;
                this.g = a();
                if (this.a == mdy.c) {
                    return false;
                }
                this.a = mdy.a;
                return true;
        }
    }

    public final T next() {
        if (hasNext()) {
            this.a = mdy.b;
            T t = this.g;
            this.g = null;
            return t;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    protected /* synthetic */ T a() {
        return b();
    }

    protected mdw(mfq mfq, CharSequence charSequence) {
        this();
        this.e = 0;
        this.c = mfq.a;
        this.d = mfq.b;
        this.f = mfq.c;
        this.b = charSequence;
    }

    protected String b() {
        int i = this.e;
        while (this.e != -1) {
            int a = a(this.e);
            if (a == -1) {
                a = this.b.length();
                this.e = -1;
            } else {
                this.e = b(a);
            }
            if (this.e == i) {
                this.e++;
                if (this.e >= this.b.length()) {
                    this.e = -1;
                }
            } else {
                int i2 = i;
                while (i2 < a && this.c.b(this.b.charAt(i2))) {
                    i2++;
                }
                i = a;
                while (i > i2 && this.c.b(this.b.charAt(i - 1))) {
                    i--;
                }
                if (this.d && i2 == i) {
                    i = this.e;
                } else {
                    if (this.f == 1) {
                        i = this.b.length();
                        this.e = -1;
                        while (i > i2 && this.c.b(this.b.charAt(i - 1))) {
                            i--;
                        }
                    } else {
                        this.f--;
                    }
                    return this.b.subSequence(i2, i).toString();
                }
            }
        }
        this.a = mdy.c;
        return null;
    }
}
