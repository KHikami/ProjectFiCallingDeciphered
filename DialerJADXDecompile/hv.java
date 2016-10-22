import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* compiled from: PG */
public class hv extends ij implements Map {
    private ib d;

    public hv(int i) {
        super(i);
    }

    private final ib a() {
        if (this.d == null) {
            this.d = new hw(this);
        }
        return this.d;
    }

    public void putAll(Map map) {
        int size = this.c + map.size();
        if (this.a.length < size) {
            Object obj = this.a;
            Object obj2 = this.b;
            super.a(size);
            if (this.c > 0) {
                System.arraycopy(obj, 0, this.a, 0, this.c);
                System.arraycopy(obj2, 0, this.b, 0, this.c << 1);
            }
            ij.a(obj, obj2, this.c);
        }
        for (Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public Set entrySet() {
        ib a = a();
        if (a.a == null) {
            a.a = new id(a);
        }
        return a.a;
    }

    public Set keySet() {
        ib a = a();
        if (a.b == null) {
            a.b = new ie(a);
        }
        return a.b;
    }

    public Collection values() {
        ib a = a();
        if (a.c == null) {
            a.c = new ig(a);
        }
        return a.c;
    }
}
