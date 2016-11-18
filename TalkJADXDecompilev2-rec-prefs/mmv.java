package p000;

import java.util.Map.Entry;

public final class mmv<K, V> extends mjh<K, V> {
    public static final mmv<Object, Object> f27916b = new mmv(null, null, mjx.f27821a, 0, 0);
    final transient mkd<K, V>[] f27917c;
    final transient Entry<K, V>[] f27918d;
    final transient int f27919e;
    final transient int f27920f;
    private final transient mkd<K, V>[] f27921g;
    private transient mjh<V, K> f27922h;

    static <K, V> mmv<K, V> m32525a(int i, Entry<K, V>[] entryArr) {
        Entry[] entryArr2;
        bm.m6146b(i, entryArr.length);
        int a = gwb.m1483a(i, 1.2d);
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
            gwb.m2264j(key, value);
            int hashCode = key.hashCode();
            int hashCode2 = value.hashCode();
            int G = gwb.m1394G(hashCode) & i2;
            int G2 = gwb.m1394G(hashCode2) & i2;
            mkd mkd2 = mkdArr[G];
            mnb.m32544a(key, entry, mkd2);
            mkd mkd3 = mkdArr2[G2];
            for (Object obj = mkd3; obj != null; mkd b = obj.mo3867b()) {
                mjx.m32329a(!value.equals(obj.getValue()), "value", entry, obj);
            }
            if (mkd3 == null && mkd2 == null) {
                Object obj2 = ((entry instanceof mkd) && ((mkd) entry).mo3866c()) ? 1 : null;
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
        this.f27921g = mkd_K__VArr;
        this.f27917c = mkd_K__VArr2;
        this.f27918d = entryArr;
        this.f27919e = i;
        this.f27920f = i2;
    }

    public V get(Object obj) {
        return this.f27921g == null ? null : mnb.m32542a(obj, this.f27921g, this.f27919e);
    }

    mks<Entry<K, V>> mo3845f() {
        if (isEmpty()) {
            return mnc.f27935a;
        }
        return new mki(this, this.f27918d);
    }

    boolean mo3891i() {
        return true;
    }

    public int hashCode() {
        return this.f27920f;
    }

    boolean mo3850d() {
        return false;
    }

    public int size() {
        return this.f27918d.length;
    }

    public mjh<V, K> mo3889a() {
        if (isEmpty()) {
            return f27916b;
        }
        mjh<V, K> mjh_V__K = this.f27922h;
        if (mjh_V__K != null) {
            return mjh_V__K;
        }
        mjh_V__K = new mmw(this);
        this.f27922h = mjh_V__K;
        return mjh_V__K;
    }
}
