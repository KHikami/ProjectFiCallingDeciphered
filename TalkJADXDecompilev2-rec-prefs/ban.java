package p000;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class ban<T, Y> {
    private final LinkedHashMap<T, Y> f2264a = new LinkedHashMap(100, 0.75f, true);
    private final int f2265b;
    private int f2266c;
    private int f2267d = 0;

    public ban(int i) {
        this.f2265b = i;
        this.f2266c = i;
    }

    public int mo370a(Y y) {
        return 1;
    }

    public void mo375a(T t, Y y) {
    }

    public synchronized int m3911b() {
        return this.f2267d;
    }

    public synchronized Y m3912b(T t) {
        return this.f2264a.get(t);
    }

    public synchronized Y m3913b(T t, Y y) {
        Y y2;
        if (mo370a(y) >= this.f2266c) {
            mo375a(t, y);
            y2 = null;
        } else {
            y2 = this.f2264a.put(t, y);
            if (y != null) {
                this.f2267d += mo370a(y);
            }
            if (y2 != null) {
                this.f2267d -= mo370a(y2);
            }
            m3914b(this.f2266c);
        }
        return y2;
    }

    public synchronized Y m3915c(T t) {
        Y remove;
        remove = this.f2264a.remove(t);
        if (remove != null) {
            this.f2267d -= mo370a(remove);
        }
        return remove;
    }

    public void m3909a() {
        m3914b(0);
    }

    public synchronized void m3914b(int i) {
        while (this.f2267d > i) {
            Entry entry = (Entry) this.f2264a.entrySet().iterator().next();
            Object value = entry.getValue();
            this.f2267d -= mo370a(value);
            Object key = entry.getKey();
            this.f2264a.remove(key);
            mo375a(key, value);
        }
    }
}
