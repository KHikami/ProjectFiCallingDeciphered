package p000;

import java.util.Iterator;

final class mnk<E> extends mks<E> {
    final transient E f27949a;
    private transient int f27950b;

    public /* synthetic */ Iterator iterator() {
        return mo3806a();
    }

    mnk(E e) {
        this.f27949a = bm.m6122a((Object) e);
    }

    mnk(E e, int i) {
        this.f27949a = e;
        this.f27950b = i;
    }

    public int size() {
        return 1;
    }

    public boolean contains(Object obj) {
        return this.f27949a.equals(obj);
    }

    public mny<E> mo3806a() {
        return mlj.m32458a(this.f27949a);
    }

    mjq<E> mo3868d() {
        return mjq.m32313a(this.f27949a);
    }

    boolean mo3822e() {
        return false;
    }

    int mo3832a(Object[] objArr, int i) {
        objArr[i] = this.f27949a;
        return i + 1;
    }

    public final int hashCode() {
        int i = this.f27950b;
        if (i != 0) {
            return i;
        }
        i = this.f27949a.hashCode();
        this.f27950b = i;
        return i;
    }

    boolean V_() {
        return this.f27950b != 0;
    }

    public String toString() {
        String obj = this.f27949a.toString();
        return new StringBuilder(obj.length() + 2).append('[').append(obj).append(']').toString();
    }
}
