package defpackage;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: czp */
public abstract class czp extends AbstractCollection implements Serializable {
    private transient czt a;

    public abstract dbn b();

    public abstract boolean contains(Object obj);

    public /* synthetic */ Iterator iterator() {
        return b();
    }

    czp() {
    }

    public final Object[] toArray() {
        int size = size();
        if (size == 0) {
            return daz.a;
        }
        Object[] objArr = new Object[size];
        a(objArr, 0);
        return objArr;
    }

    public final Object[] toArray(Object[] objArr) {
        cob.i((Object) objArr);
        int size = size();
        if (objArr.length < size) {
            objArr = buf.a(objArr, size);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        a(objArr, 0);
        return objArr;
    }

    @Deprecated
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public czt c() {
        czt czt = this.a;
        if (czt != null) {
            return czt;
        }
        czt = d();
        this.a = czt;
        return czt;
    }

    czt d() {
        switch (size()) {
            case rl.c /*0*/:
                return dbg.a;
            case rq.b /*1*/:
                return czt.a(b().next());
            default:
                return new dba(this, toArray());
        }
    }

    int a(Object[] objArr, int i) {
        Iterator b = b();
        while (b.hasNext()) {
            int i2 = i + 1;
            objArr[i] = b.next();
            i = i2;
        }
        return i;
    }

    Object writeReplace() {
        return new czw(toArray());
    }
}
