package p000;

import java.util.Map.Entry;

public final class mnb<K, V> extends mjx<K, V> {
    private static final long serialVersionUID = 0;
    private final transient Entry<K, V>[] f27932b;
    private final transient mkd<K, V>[] f27933c;
    private final transient int f27934d;

    public static <K, V> mnb<K, V> m32543a(int i, Entry<K, V>[] entryArr) {
        Entry[] entryArr2;
        bm.m6146b(i, entryArr.length);
        if (i == entryArr.length) {
            entryArr2 = entryArr;
        } else {
            Object[] objArr = new mkd[i];
        }
        int a = gwb.m1483a(i, 1.2d);
        mkd[] mkdArr = new mkd[a];
        int i2 = a - 1;
        for (int i3 = 0; i3 < i; i3++) {
            Entry entry = entryArr[i3];
            Object key = entry.getKey();
            Object value = entry.getValue();
            gwb.m2264j(key, value);
            int G = gwb.m1394G(key.hashCode()) & i2;
            mkd mkd = mkdArr[G];
            if (mkd == null) {
                Object obj = ((entry instanceof mkd) && ((mkd) entry).mo3866c()) ? 1 : null;
                entry = obj != null ? (mkd) entry : new mkd(key, value);
            } else {
                entry = new mkf(key, value, mkd);
            }
            mkdArr[G] = entry;
            entryArr2[i3] = entry;
            mnb.m32544a(key, entry, mkd);
        }
        return new mnb(entryArr2, mkdArr, i2);
    }

    private mnb(Entry<K, V>[] entryArr, mkd<K, V>[] mkd_K__VArr, int i) {
        this.f27932b = entryArr;
        this.f27933c = mkd_K__VArr;
        this.f27934d = i;
    }

    static void m32544a(Object obj, Entry<?, ?> entry, mkd<?, ?> mkd___) {
        while (mkd___ != null) {
            mjx.m32329a(!obj.equals(mkd___.getKey()), "key", entry, mkd___);
            mkd___ = mkd___.mo3865a();
        }
    }

    public V get(Object obj) {
        return mnb.m32542a(obj, this.f27933c, this.f27934d);
    }

    static <V> V m32542a(Object obj, mkd<?, V>[] mkd___VArr, int i) {
        if (obj == null) {
            return null;
        }
        for (mkd mkd = mkd___VArr[gwb.m1394G(obj.hashCode()) & i]; mkd != null; mkd = mkd.mo3865a()) {
            if (obj.equals(mkd.getKey())) {
                return mkd.getValue();
            }
        }
        return null;
    }

    public int size() {
        return this.f27932b.length;
    }

    boolean mo3850d() {
        return false;
    }

    mks<Entry<K, V>> mo3845f() {
        return new mki(this, this.f27932b);
    }
}
