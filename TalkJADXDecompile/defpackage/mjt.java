package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: mjt */
final class mjt<E> extends mjq<E> {
    private final transient mjq<E> a;

    public /* synthetic */ Iterator iterator() {
        return super.a();
    }

    public /* synthetic */ ListIterator listIterator() {
        return super.c();
    }

    public /* synthetic */ ListIterator listIterator(int i) {
        return super.a(i);
    }

    public /* synthetic */ List subList(int i, int i2) {
        return a(i, i2);
    }

    mjt(mjq<E> mjq_E) {
        this.a = mjq_E;
    }

    private int b(int i) {
        return (size() - 1) - i;
    }

    public mjq<E> d() {
        return this.a;
    }

    public boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    public int indexOf(Object obj) {
        int lastIndexOf = this.a.lastIndexOf(obj);
        return lastIndexOf >= 0 ? b(lastIndexOf) : -1;
    }

    public int lastIndexOf(Object obj) {
        int indexOf = this.a.indexOf(obj);
        return indexOf >= 0 ? b(indexOf) : -1;
    }

    public mjq<E> a(int i, int i2) {
        bm.a(i, i2, size());
        return this.a.a(size() - i2, size() - i).d();
    }

    public E get(int i) {
        bm.a(i, size());
        return this.a.get(b(i));
    }

    public int size() {
        return this.a.size();
    }

    boolean e() {
        return this.a.e();
    }
}
