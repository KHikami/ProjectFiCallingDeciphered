package p000;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

final class mnd<E> extends mlf<E> {
    static final mnd<Comparable> f27940c = new mnd(mna.f27928a, mmo.f27910a);
    private final transient mjq<E> f27941d;

    public /* synthetic */ Iterator descendingIterator() {
        return mo3817c();
    }

    public /* synthetic */ Iterator iterator() {
        return mo3806a();
    }

    mnd(mjq<E> mjq_E, Comparator<? super E> comparator) {
        super(comparator);
        this.f27941d = mjq_E;
    }

    public mny<E> mo3806a() {
        return this.f27941d.mo3806a();
    }

    public mny<E> mo3817c() {
        return this.f27941d.mo3856d().mo3806a();
    }

    public int size() {
        return this.f27941d.size();
    }

    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return Collections.binarySearch(this.f27941d, obj, m32551g()) >= 0;
        } catch (ClassCastException e) {
            return false;
        }
    }

    public boolean containsAll(Collection<?> collection) {
        if (collection instanceof mmn) {
            Iterable a = ((mmn) collection).m32512a();
        }
        if (!gwb.m1942a(comparator(), a) || a.size() <= 1) {
            return super.containsAll(a);
        }
        mmt e = mlj.m32470e(mo3806a());
        Iterator it = a.iterator();
        Object next = it.next();
        while (e.hasNext()) {
            try {
                int a2 = m32265a(e.mo3881a(), next);
                if (a2 < 0) {
                    e.next();
                } else if (a2 == 0) {
                    if (!it.hasNext()) {
                        return true;
                    }
                    next = it.next();
                } else if (a2 > 0) {
                    return false;
                }
            } catch (NullPointerException e2) {
                return false;
            } catch (ClassCastException e3) {
                return false;
            }
        }
        return false;
    }

    boolean mo3822e() {
        return this.f27941d.mo3822e();
    }

    int mo3832a(Object[] objArr, int i) {
        return this.f27941d.mo3832a(objArr, i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Iterable iterable = (Set) obj;
        if (size() != iterable.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!gwb.m1942a(this.a, iterable)) {
            return containsAll(iterable);
        }
        Iterator it = iterable.iterator();
        try {
            Iterator a = mo3806a();
            while (a.hasNext()) {
                Object next = a.next();
                Object next2 = it.next();
                if (next2 != null) {
                    if (m32265a(next, next2) != 0) {
                    }
                }
                return false;
            }
            return true;
        } catch (ClassCastException e) {
            return false;
        } catch (NoSuchElementException e2) {
            return false;
        }
    }

    public E first() {
        if (!isEmpty()) {
            return this.f27941d.get(0);
        }
        throw new NoSuchElementException();
    }

    public E last() {
        if (!isEmpty()) {
            return this.f27941d.get(size() - 1);
        }
        throw new NoSuchElementException();
    }

    public E lower(E e) {
        int e2 = m32561e(e, false) - 1;
        return e2 == -1 ? null : this.f27941d.get(e2);
    }

    public E floor(E e) {
        int e2 = m32561e(e, true) - 1;
        return e2 == -1 ? null : this.f27941d.get(e2);
    }

    public E ceiling(E e) {
        int f = m32563f(e, true);
        return f == size() ? null : this.f27941d.get(f);
    }

    public E higher(E e) {
        int f = m32563f(e, false);
        return f == size() ? null : this.f27941d.get(f);
    }

    mlf<E> mo3813a(E e, boolean z) {
        return m32556a(0, m32561e(e, z));
    }

    int m32561e(E e, boolean z) {
        return gwb.m1513a(this.f27941d, bm.m6122a((Object) e), comparator(), z ? mnq.FIRST_AFTER : mnq.FIRST_PRESENT, mnm.NEXT_HIGHER);
    }

    mlf<E> mo3814a(E e, boolean z, E e2, boolean z2) {
        return mo3816b(e, z).mo3813a((Object) e2, z2);
    }

    mlf<E> mo3816b(E e, boolean z) {
        return m32556a(m32563f(e, z), size());
    }

    int m32563f(E e, boolean z) {
        return gwb.m1513a(this.f27941d, bm.m6122a((Object) e), comparator(), z ? mnq.FIRST_PRESENT : mnq.FIRST_AFTER, mnm.NEXT_HIGHER);
    }

    private Comparator<Object> m32551g() {
        return this.a;
    }

    mnd<E> m32556a(int i, int i2) {
        if (i == 0 && i2 == size()) {
            return this;
        }
        if (i < i2) {
            return new mnd(this.f27941d.mo3855a(i, i2), this.a);
        }
        return mlf.m32263a(this.a);
    }

    int mo3812a(Object obj) {
        if (obj == null) {
            return -1;
        }
        try {
            int a = gwb.m1513a(this.f27941d, obj, m32551g(), mnq.ANY_PRESENT, mnm.INVERTED_INSERTION_INDEX);
            if (a >= 0) {
                return a;
            }
            return -1;
        } catch (ClassCastException e) {
            return -1;
        }
    }

    mjq<E> mo3868d() {
        return size() <= 1 ? this.f27941d : new mky(this, this.f27941d);
    }

    mlf<E> U_() {
        Comparator c = mms.m32221a(this.a).mo3888c();
        if (isEmpty()) {
            return mlf.m32263a(c);
        }
        return new mnd(this.f27941d.mo3856d(), c);
    }
}
