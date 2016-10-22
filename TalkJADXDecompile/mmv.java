import java.util.Map.Entry;

public final class mmv<K, V> extends mjh<K, V> {
    public static final mmv<Object, Object> b;
    final transient mkd<K, V>[] c;
    final transient Entry<K, V>[] d;
    final transient int e;
    final transient int f;
    private final transient mkd<K, V>[] g;
    private transient mjh<V, K> h;

    static {
        b = new mmv(null, null, mjx.a, 0, 0);
    }

    static <K, V> mmv<K, V> a(int i, Entry<K, V>[] entryArr) {
        Entry[] entryArr2;
        bm.b(i, entryArr.length);
        int a = gwb.a(i, 1.2d);
        int i2 = a - 1;
        mkd[] mkdArr = new mkd[a];
        mkd[] mkdArr2 = new mkd[a];
        if (i == entryArr.length) {
            entryArr2 = entryArr;
        } else {
            entryArr2 = new mkd[i];
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            mkd mkd;
            Entry entry = entryArr[i4];
            Object key = entry.getKey();
            Object value = entry.getValue();
            gwb.j(key, value);
            int hashCode = key.hashCode();
            int hashCode2 = value.hashCode();
            int G = gwb.G(hashCode) & i2;
            int G2 = gwb.G(hashCode2) & i2;
            mkd mkd2 = mkdArr[G];
            mnb.a(key, entry, mkd2);
            mkd mkd3 = mkdArr2[G2];
            for (Object obj = mkd3; obj != null; mkd b = obj.b()) {
                mjx.a(!value.equals(obj.getValue()), "value", entry, obj);
            }
            if (mkd3 == null && mkd2 == null) {
                Object obj2 = ((entry instanceof mkd) && ((mkd) entry).c()) ? 1 : null;
                mkd = obj2 != null ? (mkd) entry : new mkd(key, value);
            } else {
                mkd = new mke(key, value, mkd2, mkd3);
            }
            mkdArr[G] = mkd;
            mkdArr2[G2] = mkd;
            entryArr2[i4] = mkd;
            i3 += hashCode ^ hashCode2;
        }
        return new mmv(mkdArr, mkdArr2, entryArr2, i2, i3);
    }

    private mmv(mkd<K, V>[] mkd_K__VArr, mkd<K, V>[] mkd_K__VArr2, Entry<K, V>[] entryArr, int i, int i2) {
        this.g = mkd_K__VArr;
        this.c = mkd_K__VArr2;
        this.d = entryArr;
        this.e = i;
        this.f = i2;
    }

    public V get(Object obj) {
        return this.g == null ? null : mnb.a(obj, this.g, this.e);
    }

    mks<Entry<K, V>> f() {
        if (isEmpty()) {
            return mnc.a;
        }
        return new mki(this, this.d);
    }

    boolean i() {
        return true;
    }

    public int hashCode() {
        return this.f;
    }

    boolean d() {
        return false;
    }

    public int size() {
        return this.d.length;
    }

    public mjh<V, K> a() {
        if (isEmpty()) {
            return b;
        }
        mjh<V, K> mjh_V__K = this.h;
        if (mjh_V__K != null) {
            return mjh_V__K;
        }
        mjh_V__K = new mmw(this);
        this.h = mjh_V__K;
        return mjh_V__K;
    }
}
