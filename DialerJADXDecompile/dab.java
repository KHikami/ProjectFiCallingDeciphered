import java.io.Serializable;
import java.util.Iterator;
import java.util.Map.Entry;

/* compiled from: PG */
class dab implements Serializable {
    private static final long serialVersionUID = 0;
    private final Object[] a;
    private final Object[] b;

    dab(czy czy) {
        this.a = new Object[czy.size()];
        this.b = new Object[czy.size()];
        Iterator b = czy.c().b();
        int i = 0;
        while (b.hasNext()) {
            Entry entry = (Entry) b.next();
            this.a[i] = entry.getKey();
            this.b[i] = entry.getValue();
            i++;
        }
    }

    Object readResolve() {
        return a(new daa(this.a.length));
    }

    final Object a(daa daa) {
        for (int i = 0; i < this.a.length; i++) {
            daa.a(this.a[i], this.b[i]);
        }
        return daa.a();
    }
}
