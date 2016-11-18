package p000;

import java.util.ArrayList;
import java.util.List;

public final class nxn<E> extends nvl<E> {
    public static final nxn<Object> f31214b;
    private final List<E> f31215c;

    public /* synthetic */ nxb mo4061d(int i) {
        return m37030a(i);
    }

    static {
        nvl nxn = new nxn();
        f31214b = nxn;
        nxn.f31132a = false;
    }

    nxn() {
        this(new ArrayList(10));
    }

    private nxn(List<E> list) {
        this.f31215c = list;
    }

    private nxn<E> m37030a(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        List arrayList = new ArrayList(i);
        arrayList.addAll(this.f31215c);
        return new nxn(arrayList);
    }

    public void add(int i, E e) {
        m36736c();
        this.f31215c.add(i, e);
        this.modCount++;
    }

    public E get(int i) {
        return this.f31215c.get(i);
    }

    public E remove(int i) {
        m36736c();
        E remove = this.f31215c.remove(i);
        this.modCount++;
        return remove;
    }

    public E set(int i, E e) {
        m36736c();
        E e2 = this.f31215c.set(i, e);
        this.modCount++;
        return e2;
    }

    public int size() {
        return this.f31215c.size();
    }
}
