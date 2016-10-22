import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* compiled from: PG */
public abstract class czy implements Serializable, Map {
    static final Entry[] a;
    private transient dao b;
    private transient dao c;
    private transient czp d;

    abstract dao d();

    public abstract Object get(Object obj);

    public /* synthetic */ Set entrySet() {
        return c();
    }

    public /* synthetic */ Set keySet() {
        return e();
    }

    public /* synthetic */ Collection values() {
        return b();
    }

    static void a(boolean z, String str, Entry entry, Entry entry2) {
        if (!z) {
            String valueOf = String.valueOf(entry);
            String valueOf2 = String.valueOf(entry2);
            throw new IllegalArgumentException(new StringBuilder(((String.valueOf(str).length() + 34) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length()).append("Multiple entries with same ").append(str).append(": ").append(valueOf).append(" and ").append(valueOf2).toString());
        }
    }

    static {
        a = new Entry[0];
    }

    czy() {
    }

    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public boolean containsValue(Object obj) {
        return b().contains(obj);
    }

    public final dao c() {
        dao dao = this.b;
        if (dao != null) {
            return dao;
        }
        dao = d();
        this.b = dao;
        return dao;
    }

    public final dao e() {
        dao dao = this.c;
        if (dao != null) {
            return dao;
        }
        dao = f();
        this.c = dao;
        return dao;
    }

    dao f() {
        if (isEmpty()) {
            return dbi.a;
        }
        return new dai(this);
    }

    public czp b() {
        czp czp = this.d;
        if (czp != null) {
            return czp;
        }
        czp = new dak(this);
        this.d = czp;
        return czp;
    }

    public boolean equals(Object obj) {
        return day.a((Map) this, obj);
    }

    public int hashCode() {
        return buf.a(c());
    }

    boolean g() {
        return false;
    }

    public String toString() {
        return day.b(this);
    }

    Object writeReplace() {
        return new dab(this);
    }
}
