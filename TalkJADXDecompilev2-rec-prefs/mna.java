package p000;

import java.util.ListIterator;

public final class mna<E> extends mjq<E> {
    public static final mjq<Object> f27928a = new mna(mmr.f27915a);
    private final transient int f27929b;
    private final transient int f27930c;
    private final transient Object[] f27931d;

    public /* synthetic */ ListIterator listIterator(int i) {
        return mo3871a(i);
    }

    private mna(Object[] objArr, int i, int i2) {
        this.f27929b = i;
        this.f27930c = i2;
        this.f27931d = objArr;
    }

    mna(Object[] objArr) {
        this(objArr, 0, objArr.length);
    }

    public int size() {
        return this.f27930c;
    }

    boolean mo3822e() {
        return this.f27930c != this.f27931d.length;
    }

    int mo3832a(Object[] objArr, int i) {
        System.arraycopy(this.f27931d, this.f27929b, objArr, i, this.f27930c);
        return this.f27930c + i;
    }

    public E get(int i) {
        bm.m6119a(i, this.f27930c);
        return this.f27931d[this.f27929b + i];
    }

    mjq<E> mo3872b(int i, int i2) {
        return new mna(this.f27931d, this.f27929b + i, i2 - i);
    }

    public mnz<E> mo3871a(int i) {
        return mlj.m32461a(this.f27931d, this.f27929b, this.f27930c, i);
    }
}
