package p000;

import java.util.Iterator;

final class lf<T> implements Iterator<T> {
    final int f24885a;
    int f24886b;
    int f24887c;
    boolean f24888d = false;
    final /* synthetic */ le f24889e;

    lf(le leVar, int i) {
        this.f24889e = leVar;
        this.f24885a = i;
        this.f24886b = leVar.mo3681a();
    }

    public boolean hasNext() {
        return this.f24887c < this.f24886b;
    }

    public T next() {
        T a = this.f24889e.mo3683a(this.f24887c, this.f24885a);
        this.f24887c++;
        this.f24888d = true;
        return a;
    }

    public void remove() {
        if (this.f24888d) {
            this.f24887c--;
            this.f24886b--;
            this.f24888d = false;
            this.f24889e.mo3685a(this.f24887c);
            return;
        }
        throw new IllegalStateException();
    }
}
