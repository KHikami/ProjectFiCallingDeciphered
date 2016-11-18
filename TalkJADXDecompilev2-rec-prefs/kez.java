package p000;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NoSuchElementException;

final class kez implements Iterator<Entry<K, V>> {
    final /* synthetic */ kex f21545a;
    private boolean f21546b;
    private int f21547c;

    kez(kex kex) {
        this.f21545a = kex;
    }

    public /* synthetic */ Object next() {
        return m25701a();
    }

    public boolean hasNext() {
        return this.f21547c < this.f21545a.f21541a;
    }

    private Entry<K, V> m25701a() {
        int i = this.f21547c;
        if (i == this.f21545a.f21541a) {
            throw new NoSuchElementException();
        }
        this.f21547c++;
        return new key(this.f21545a, i);
    }

    public void remove() {
        int i = this.f21547c - 1;
        if (this.f21546b || i < 0) {
            throw new IllegalArgumentException();
        }
        this.f21545a.m25700b(i << 1);
        this.f21546b = true;
    }
}
