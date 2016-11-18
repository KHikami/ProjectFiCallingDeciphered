package defpackage;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class ban<T, Y> {
    private final LinkedHashMap<T, Y> a = new LinkedHashMap(100, 0.75f, true);
    private final int b;
    private int c;
    private int d = 0;

    public ban(int i) {
        this.b = i;
        this.c = i;
    }

    public int a(Y y) {
        return 1;
    }

    public void a(T t, Y y) {
    }

    public synchronized int b() {
        return this.d;
    }

    public synchronized Y b(T t) {
        return this.a.get(t);
    }

    public synchronized Y b(T t, Y y) {
        Y y2;
        if (a(y) >= this.c) {
            a(t, y);
            y2 = null;
        } else {
            y2 = this.a.put(t, y);
            if (y != null) {
                this.d += a(y);
            }
            if (y2 != null) {
                this.d -= a(y2);
            }
            b(this.c);
        }
        return y2;
    }

    public synchronized Y c(T t) {
        Y remove;
        remove = this.a.remove(t);
        if (remove != null) {
            this.d -= a(remove);
        }
        return remove;
    }

    public void a() {
        b(0);
    }

    public synchronized void b(int i) {
        while (this.d > i) {
            Entry entry = (Entry) this.a.entrySet().iterator().next();
            Object value = entry.getValue();
            this.d -= a(value);
            Object key = entry.getKey();
            this.a.remove(key);
            a(key, value);
        }
    }
}
