package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/* compiled from: PG */
/* renamed from: id */
final class id implements Set {
    private /* synthetic */ ib a;

    id(ib ibVar) {
        this.a = ibVar;
    }

    public final boolean addAll(Collection collection) {
        int a = this.a.a();
        for (Entry entry : collection) {
            this.a.a(entry.getKey(), entry.getValue());
        }
        return a != this.a.a();
    }

    public final void clear() {
        this.a.c();
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        int a = this.a.a(entry.getKey());
        if (a >= 0) {
            return hx.a(this.a.a(a, 1), entry.getValue());
        }
        return false;
    }

    public final boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean isEmpty() {
        return this.a.a() == 0;
    }

    public final Iterator iterator() {
        return new if(this.a);
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final int size() {
        return this.a.a();
    }

    public final Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray(Object[] objArr) {
        throw new UnsupportedOperationException();
    }

    public final boolean equals(Object obj) {
        return ib.a((Set) this, obj);
    }

    public final int hashCode() {
        int a = this.a.a() - 1;
        int i = 0;
        while (a >= 0) {
            int i2;
            Object a2 = this.a.a(a, 0);
            Object a3 = this.a.a(a, 1);
            int hashCode = a2 == null ? 0 : a2.hashCode();
            if (a3 == null) {
                i2 = 0;
            } else {
                i2 = a3.hashCode();
            }
            a--;
            i += i2 ^ hashCode;
        }
        return i;
    }

    public final /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }
}
