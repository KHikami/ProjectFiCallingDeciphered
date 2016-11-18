package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class otv<E> implements Iterator<E> {
    int a;
    int b;
    boolean c;
    final /* synthetic */ otu d;

    otv(otu otu) {
        this.d = otu;
        this.b = 0;
        this.c = false;
        otu.b++;
        this.a = otu.a.size();
    }

    public boolean hasNext() {
        int i = this.b;
        while (i < this.a && this.d.a.get(i) == null) {
            i++;
        }
        if (i < this.a) {
            return true;
        }
        a();
        return false;
    }

    public E next() {
        while (this.b < this.a) {
            otu otu = this.d;
            if (otu.a.get(this.b) != null) {
                break;
            }
            this.b++;
        }
        if (this.b < this.a) {
            otu = this.d;
            int i = this.b;
            this.b = i + 1;
            return otu.a.get(i);
        }
        a();
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    void a() {
        if (!this.c) {
            this.c = true;
            otu otu = this.d;
            otu.b--;
            if (otu.b <= 0 && otu.c) {
                otu.c = false;
                for (int size = otu.a.size() - 1; size >= 0; size--) {
                    if (otu.a.get(size) == null) {
                        otu.a.remove(size);
                    }
                }
            }
        }
    }
}
