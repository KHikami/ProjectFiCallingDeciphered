package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: PG */
/* renamed from: czt */
public abstract class czt extends czp implements List, RandomAccess {
    public /* synthetic */ Iterator iterator() {
        return b();
    }

    public /* synthetic */ ListIterator listIterator(int i) {
        return a(i);
    }

    public /* synthetic */ List subList(int i, int i2) {
        return a(i, i2);
    }

    public static czt a(Object obj) {
        return new dbk(obj);
    }

    public static czt a(Object[] objArr) {
        switch (objArr.length) {
            case rl.c /*0*/:
                return dbg.a;
            case rq.b /*1*/:
                return new dbk(objArr[0]);
            default:
                Object[] objArr2 = (Object[]) objArr.clone();
                return new dbg(daz.b(objArr2, objArr2.length));
        }
    }

    static czt b(Object[] objArr, int i) {
        switch (i) {
            case rl.c /*0*/:
                return dbg.a;
            case rq.b /*1*/:
                return new dbk(objArr[0]);
            default:
                if (i < objArr.length) {
                    objArr = daz.a(objArr, i);
                }
                return new dbg(objArr);
        }
    }

    czt() {
    }

    public dbo a(int i) {
        return new czu(this, size(), i);
    }

    public int indexOf(Object obj) {
        return obj == null ? -1 : buf.b((List) this, obj);
    }

    public int lastIndexOf(Object obj) {
        return obj == null ? -1 : buf.d((List) this, obj);
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public czt a(int i, int i2) {
        cob.b(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        switch (i3) {
            case rl.c /*0*/:
                return dbg.a;
            case rq.b /*1*/:
                return czt.a(get(i));
            default:
                return b(i, i2);
        }
    }

    czt b(int i, int i2) {
        return new czx(this, i, i2 - i);
    }

    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    public final czt c() {
        return this;
    }

    int a(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    public boolean equals(Object obj) {
        return buf.a((List) this, obj);
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < size(); i2++) {
            i = (((i * 31) + get(i2).hashCode()) ^ -1) ^ -1;
        }
        return i;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    Object writeReplace() {
        return new czw(toArray());
    }

    public dbn b() {
        return a(0);
    }

    public /* synthetic */ ListIterator listIterator() {
        return a(0);
    }
}
