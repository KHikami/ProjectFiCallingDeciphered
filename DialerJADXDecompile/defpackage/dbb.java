package defpackage;

import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: dbb */
final class dbb extends czm {
    static final dbb b;
    final transient dac[] c;
    final transient Entry[] d;
    final transient int e;
    final transient int f;
    private final transient dac[] g;
    private transient czm h;

    static {
        b = new dbb(null, null, czy.a, 0, 0);
    }

    static dbb a(int i, Entry[] entryArr) {
        Entry[] entryArr2;
        cob.c(i, entryArr.length);
        int a = buf.a(i, 1.2d);
        int i2 = a - 1;
        dac[] dacArr = new dac[a];
        dac[] dacArr2 = new dac[a];
        if (i == entryArr.length) {
            entryArr2 = entryArr;
        } else {
            entryArr2 = new dac[i];
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            dac dac;
            Entry entry = entryArr[i4];
            Object key = entry.getKey();
            Object value = entry.getValue();
            buf.f(key, value);
            int hashCode = key.hashCode();
            int hashCode2 = value.hashCode();
            int C = buf.C(hashCode) & i2;
            int C2 = buf.C(hashCode2) & i2;
            dac dac2 = dacArr[C];
            dbh.a(key, entry, dac2);
            dac dac3 = dacArr2[C2];
            for (Object obj = dac3; obj != null; dac b = obj.b()) {
                czy.a(!value.equals(obj.getValue()), "value", entry, obj);
            }
            if (dac3 == null && dac2 == null) {
                Object obj2 = ((entry instanceof dac) && ((dac) entry).c()) ? 1 : null;
                dac = obj2 != null ? (dac) entry : new dac(key, value);
            } else {
                dac = new dad(key, value, dac2, dac3);
            }
            dacArr[C] = dac;
            dacArr2[C2] = dac;
            entryArr2[i4] = dac;
            i3 += hashCode ^ hashCode2;
        }
        return new dbb(dacArr, dacArr2, entryArr2, i2, i3);
    }

    private dbb(dac[] dacArr, dac[] dacArr2, Entry[] entryArr, int i, int i2) {
        this.g = dacArr;
        this.c = dacArr2;
        this.d = entryArr;
        this.e = i;
        this.f = i2;
    }

    public final Object get(Object obj) {
        return this.g == null ? null : dbh.a(obj, this.g, this.e);
    }

    final dao d() {
        if (isEmpty()) {
            return dbi.a;
        }
        return new dah(this, this.d);
    }

    final boolean g() {
        return true;
    }

    public final int hashCode() {
        return this.f;
    }

    public final int size() {
        return this.d.length;
    }

    public final czm a() {
        if (isEmpty()) {
            return b;
        }
        czm czm = this.h;
        if (czm != null) {
            return czm;
        }
        czm = new dbc(this);
        this.h = czm;
        return czm;
    }
}
