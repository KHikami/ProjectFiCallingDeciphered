package p000;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

final class mjv extends mjq<E> {
    final transient int f27840a;
    final transient int f27841b;
    final /* synthetic */ mjq f27842c;

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

    mjv(mjq mjq, int i, int i2) {
        this.f27842c = mjq;
        this.f27840a = i;
        this.f27841b = i2;
    }

    public int size() {
        return this.f27841b;
    }

    public E get(int i) {
        bm.m6119a(i, this.f27841b);
        return this.f27842c.get(this.f27840a + i);
    }

    public mjq<E> mo3855a(int i, int i2) {
        bm.m6127a(i, i2, this.f27841b);
        return this.f27842c.mo3855a(this.f27840a + i, this.f27840a + i2);
    }

    boolean mo3822e() {
        return true;
    }
}
