package p000;

import java.util.Iterator;
import java.util.List;

final class mnj<E> extends mjq<E> {
    final transient E f27948a;

    public /* synthetic */ Iterator iterator() {
        return mo3806a();
    }

    public /* synthetic */ List subList(int i, int i2) {
        return mo3855a(i, i2);
    }

    mnj(E e) {
        this.f27948a = bm.m6122a((Object) e);
    }

    public E get(int i) {
        bm.m6119a(i, 1);
        return this.f27948a;
    }

    public mny<E> mo3806a() {
        return mlj.m32458a(this.f27948a);
    }

    public int size() {
        return 1;
    }

    public mjq<E> mo3855a(int i, int i2) {
        bm.m6127a(i, i2, 1);
        if (i == i2) {
            return mna.f27928a;
        }
        return this;
    }

    public String toString() {
        String obj = this.f27948a.toString();
        return new StringBuilder(obj.length() + 2).append('[').append(obj).append(']').toString();
    }

    boolean mo3822e() {
        return false;
    }
}
