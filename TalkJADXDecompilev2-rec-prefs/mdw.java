package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class mdw<T> implements Iterator<T> {
    int f27538a;
    final CharSequence f27539b;
    final mdz f27540c;
    final boolean f27541d;
    int f27542e;
    int f27543f;
    private T f27544g;

    abstract int mo3742a(int i);

    abstract int mo3743b(int i);

    protected mdw() {
        this.f27538a = mdy.f27547b;
    }

    public final boolean hasNext() {
        bm.m6150b(this.f27538a != mdy.f27549d);
        switch (mdx.f27545a[this.f27538a - 1]) {
            case 1:
                return true;
            case 2:
                return false;
            default:
                this.f27538a = mdy.f27549d;
                this.f27544g = m31919a();
                if (this.f27538a == mdy.f27548c) {
                    return false;
                }
                this.f27538a = mdy.f27546a;
                return true;
        }
    }

    public final T next() {
        if (hasNext()) {
            this.f27538a = mdy.f27547b;
            T t = this.f27544g;
            this.f27544g = null;
            return t;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    protected /* synthetic */ T m31919a() {
        return m31921b();
    }

    protected mdw(mfq mfq, CharSequence charSequence) {
        this();
        this.f27542e = 0;
        this.f27540c = mfq.f27620a;
        this.f27541d = mfq.f27621b;
        this.f27543f = mfq.f27622c;
        this.f27539b = charSequence;
    }

    protected String m31921b() {
        int i = this.f27542e;
        while (this.f27542e != -1) {
            int a = mo3742a(this.f27542e);
            if (a == -1) {
                a = this.f27539b.length();
                this.f27542e = -1;
            } else {
                this.f27542e = mo3743b(a);
            }
            if (this.f27542e == i) {
                this.f27542e++;
                if (this.f27542e >= this.f27539b.length()) {
                    this.f27542e = -1;
                }
            } else {
                int i2 = i;
                while (i2 < a && this.f27540c.mo3738b(this.f27539b.charAt(i2))) {
                    i2++;
                }
                i = a;
                while (i > i2 && this.f27540c.mo3738b(this.f27539b.charAt(i - 1))) {
                    i--;
                }
                if (this.f27541d && i2 == i) {
                    i = this.f27542e;
                } else {
                    if (this.f27543f == 1) {
                        i = this.f27539b.length();
                        this.f27542e = -1;
                        while (i > i2 && this.f27540c.mo3738b(this.f27539b.charAt(i - 1))) {
                            i--;
                        }
                    } else {
                        this.f27543f--;
                    }
                    return this.f27539b.subSequence(i2, i).toString();
                }
            }
        }
        this.f27538a = mdy.f27548c;
        return null;
    }
}
