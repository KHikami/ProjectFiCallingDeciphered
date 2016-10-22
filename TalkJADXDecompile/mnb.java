import java.util.Map.Entry;

public final class mnb<K, V> extends mjx<K, V> {
    private static final long serialVersionUID = 0;
    private final transient Entry<K, V>[] b;
    private final transient mkd<K, V>[] c;
    private final transient int d;

    public static <K, V> mnb<K, V> a(int i, Entry<K, V>[] entryArr) {
        Entry[] entryArr2;
        bm.b(i, entryArr.length);
        if (i == entryArr.length) {
            entryArr2 = entryArr;
        } else {
            Object[] objArr = new mkd[i];
        }
        int a = gwb.a(i, 1.2d);
        mkd[] mkdArr = new mkd[a];
        int i2 = a - 1;
        for (int i3 = 0; i3 < i; i3++) {
            Entry entry = entryArr[i3];
            Object key = entry.getKey();
            Object value = entry.getValue();
            gwb.j(key, value);
            int G = gwb.G(key.hashCode()) & i2;
            mkd mkd = mkdArr[G];
            if (mkd == null) {
                Object obj = ((entry instanceof mkd) && ((mkd) entry).c()) ? 1 : null;
                entry = obj != null ? (mkd) entry : new mkd(key, value);
            } else {
                entry = new mkf(key, value, mkd);
            }
            mkdArr[G] = entry;
            entryArr2[i3] = entry;
            a(key, entry, mkd);
        }
        return new mnb(entryArr2, mkdArr, i2);
    }

    private mnb(Entry<K, V>[] entryArr, mkd<K, V>[] mkd_K__VArr, int i) {
        this.b = entryArr;
        this.c = mkd_K__VArr;
        this.d = i;
    }

    static void a(Object obj, Entry<?, ?> entry, mkd<?, ?> mkd___) {
        while (mkd___ != null) {
            mjx.a(!obj.equals(mkd___.getKey()), "key", entry, mkd___);
            mkd___ = mkd___.a();
        }
    }

    public V get(Object obj) {
        return a(obj, this.c, this.d);
    }

    static <V> V a(Object obj, mkd<?, V>[] mkd___VArr, int i) {
        if (obj == null) {
            return null;
        }
        for (mkd mkd = mkd___VArr[gwb.G(obj.hashCode()) & i]; mkd != null; mkd = mkd.a()) {
            if (obj.equals(mkd.getKey())) {
                return mkd.getValue();
            }
        }
        return null;
    }

    public int size() {
        return this.b.length;
    }

    boolean d() {
        return false;
    }

    mks<Entry<K, V>> f() {
        return new mki(this, this.b);
    }
}
