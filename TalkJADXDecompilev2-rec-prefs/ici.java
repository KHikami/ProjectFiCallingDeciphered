package p000;

import java.util.Iterator;

final class ici<T> implements Iterator<T> {
    final int f17571a = 0;
    int f17572b;
    int f17573c;
    boolean f17574d = false;
    final /* synthetic */ ich f17575e;

    ici(ich ich, int i) {
        this.f17575e = ich;
        this.f17572b = ich.mo3134a();
    }

    public boolean hasNext() {
        return this.f17573c < this.f17572b;
    }

    public T next() {
        T a = this.f17575e.mo3136a(this.f17573c);
        this.f17573c++;
        this.f17574d = true;
        return a;
    }

    public void remove() {
        if (this.f17574d) {
            this.f17573c--;
            this.f17572b--;
            this.f17574d = false;
            this.f17575e.mo3138b(this.f17573c);
            return;
        }
        throw new IllegalStateException();
    }
}
