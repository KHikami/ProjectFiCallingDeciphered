package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

final class mjv extends mjq<E> {
    final transient int a;
    final transient int b;
    final /* synthetic */ mjq c;

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

    mjv(mjq mjq, int i, int i2) {
        this.c = mjq;
        this.a = i;
        this.b = i2;
    }

    public int size() {
        return this.b;
    }

    public E get(int i) {
        bm.a(i, this.b);
        return this.c.get(this.a + i);
    }

    public mjq<E> a(int i, int i2) {
        bm.a(i, i2, this.b);
        return this.c.a(this.a + i, this.a + i2);
    }

    boolean e() {
        return true;
    }
}
