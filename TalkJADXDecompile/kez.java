import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NoSuchElementException;

final class kez implements Iterator<Entry<K, V>> {
    final /* synthetic */ kex a;
    private boolean b;
    private int c;

    kez(kex kex) {
        this.a = kex;
    }

    public /* synthetic */ Object next() {
        return a();
    }

    public boolean hasNext() {
        return this.c < this.a.a;
    }

    private Entry<K, V> a() {
        int i = this.c;
        if (i == this.a.a) {
            throw new NoSuchElementException();
        }
        this.c++;
        return new key(this.a, i);
    }

    public void remove() {
        int i = this.c - 1;
        if (this.b || i < 0) {
            throw new IllegalArgumentException();
        }
        this.a.b(i << 1);
        this.b = true;
    }
}
