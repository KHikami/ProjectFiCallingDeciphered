package defpackage;

import java.util.ArrayList;
import java.util.List;

public final class nxn<E> extends nvl<E> {
    public static final nxn<Object> b;
    private final List<E> c;

    public /* synthetic */ nxb d(int i) {
        return a(i);
    }

    static {
        nvl nxn = new nxn();
        b = nxn;
        nxn.a = false;
    }

    nxn() {
        this(new ArrayList(10));
    }

    private nxn(List<E> list) {
        this.c = list;
    }

    private nxn<E> a(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        List arrayList = new ArrayList(i);
        arrayList.addAll(this.c);
        return new nxn(arrayList);
    }

    public void add(int i, E e) {
        c();
        this.c.add(i, e);
        this.modCount++;
    }

    public E get(int i) {
        return this.c.get(i);
    }

    public E remove(int i) {
        c();
        E remove = this.c.remove(i);
        this.modCount++;
        return remove;
    }

    public E set(int i, E e) {
        c();
        E e2 = this.c.set(i, e);
        this.modCount++;
        return e2;
    }

    public int size() {
        return this.c.size();
    }
}
