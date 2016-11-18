package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class otv<E> implements Iterator<E> {
    int f34285a;
    int f34286b;
    boolean f34287c;
    final /* synthetic */ otu f34288d;

    otv(otu otu) {
        this.f34288d = otu;
        this.f34286b = 0;
        this.f34287c = false;
        otu.f34282b++;
        this.f34285a = otu.f34281a.size();
    }

    public boolean hasNext() {
        int i = this.f34286b;
        while (i < this.f34285a && this.f34288d.f34281a.get(i) == null) {
            i++;
        }
        if (i < this.f34285a) {
            return true;
        }
        m39720a();
        return false;
    }

    public E next() {
        while (this.f34286b < this.f34285a) {
            otu otu = this.f34288d;
            if (otu.f34281a.get(this.f34286b) != null) {
                break;
            }
            this.f34286b++;
        }
        if (this.f34286b < this.f34285a) {
            otu = this.f34288d;
            int i = this.f34286b;
            this.f34286b = i + 1;
            return otu.f34281a.get(i);
        }
        m39720a();
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    void m39720a() {
        if (!this.f34287c) {
            this.f34287c = true;
            otu otu = this.f34288d;
            otu.f34282b--;
            if (otu.f34282b <= 0 && otu.f34283c) {
                otu.f34283c = false;
                for (int size = otu.f34281a.size() - 1; size >= 0; size--) {
                    if (otu.f34281a.get(size) == null) {
                        otu.f34281a.remove(size);
                    }
                }
            }
        }
    }
}
