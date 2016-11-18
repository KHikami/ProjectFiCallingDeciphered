package defpackage;

import java.util.Iterator;

final class ici<T> implements Iterator<T> {
    final int a = 0;
    int b;
    int c;
    boolean d = false;
    final /* synthetic */ ich e;

    ici(ich ich, int i) {
        this.e = ich;
        this.b = ich.a();
    }

    public boolean hasNext() {
        return this.c < this.b;
    }

    public T next() {
        T a = this.e.a(this.c);
        this.c++;
        this.d = true;
        return a;
    }

    public void remove() {
        if (this.d) {
            this.c--;
            this.b--;
            this.d = false;
            this.e.b(this.c);
            return;
        }
        throw new IllegalStateException();
    }
}
