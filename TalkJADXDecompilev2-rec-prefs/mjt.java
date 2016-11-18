package p000;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

final class mjt<E> extends mjq<E> {
    private final transient mjq<E> f27838a;

    public /* synthetic */ Iterator iterator() {
        return super.mo3806a();
    }

    public /* synthetic */ ListIterator listIterator() {
        return super.m32322c();
    }

    public /* synthetic */ ListIterator listIterator(int i) {
        return super.mo3871a(i);
    }

    public /* synthetic */ List subList(int i, int i2) {
        return mo3855a(i, i2);
    }

    mjt(mjq<E> mjq_E) {
        this.f27838a = mjq_E;
    }

    private int m32367b(int i) {
        return (size() - 1) - i;
    }

    public mjq<E> mo3856d() {
        return this.f27838a;
    }

    public boolean contains(Object obj) {
        return this.f27838a.contains(obj);
    }

    public int indexOf(Object obj) {
        int lastIndexOf = this.f27838a.lastIndexOf(obj);
        return lastIndexOf >= 0 ? m32367b(lastIndexOf) : -1;
    }

    public int lastIndexOf(Object obj) {
        int indexOf = this.f27838a.indexOf(obj);
        return indexOf >= 0 ? m32367b(indexOf) : -1;
    }

    public mjq<E> mo3855a(int i, int i2) {
        bm.m6127a(i, i2, size());
        return this.f27838a.mo3855a(size() - i2, size() - i).mo3856d();
    }

    public E get(int i) {
        bm.m6119a(i, size());
        return this.f27838a.get(m32367b(i));
    }

    public int size() {
        return this.f27838a.size();
    }

    boolean mo3822e() {
        return this.f27838a.mo3822e();
    }
}
