import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

final class mnd<E> extends mlf<E> {
    static final mnd<Comparable> c;
    private final transient mjq<E> d;

    public /* synthetic */ Iterator descendingIterator() {
        return c();
    }

    public /* synthetic */ Iterator iterator() {
        return a();
    }

    static {
        c = new mnd(mna.a, mmo.a);
    }

    mnd(mjq<E> mjq_E, Comparator<? super E> comparator) {
        super(comparator);
        this.d = mjq_E;
    }

    public mny<E> a() {
        return this.d.a();
    }

    public mny<E> c() {
        return this.d.d().a();
    }

    public int size() {
        return this.d.size();
    }

    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return Collections.binarySearch(this.d, obj, g()) >= 0;
        } catch (ClassCastException e) {
            return false;
        }
    }

    public boolean containsAll(Collection<?> collection) {
        if (collection instanceof mmn) {
            Iterable a = ((mmn) collection).a();
        }
        if (!gwb.a(comparator(), a) || a.size() <= 1) {
            return super.containsAll(a);
        }
        mmt e = mlj.e(a());
        Iterator it = a.iterator();
        Object next = it.next();
        while (e.hasNext()) {
            try {
                int a2 = a(e.a(), next);
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

    boolean e() {
        return this.d.e();
    }

    int a(Object[] objArr, int i) {
        return this.d.a(objArr, i);
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
        if (!gwb.a(this.a, iterable)) {
            return containsAll(iterable);
        }
        Iterator it = iterable.iterator();
        try {
            Iterator a = a();
            while (a.hasNext()) {
                Object next = a.next();
                Object next2 = it.next();
                if (next2 != null) {
                    if (a(next, next2) != 0) {
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
            return this.d.get(0);
        }
        throw new NoSuchElementException();
    }

    public E last() {
        if (!isEmpty()) {
            return this.d.get(size() - 1);
        }
        throw new NoSuchElementException();
    }

    public E lower(E e) {
        int e2 = e(e, false) - 1;
        return e2 == -1 ? null : this.d.get(e2);
    }

    public E floor(E e) {
        int e2 = e(e, true) - 1;
        return e2 == -1 ? null : this.d.get(e2);
    }

    public E ceiling(E e) {
        int f = f(e, true);
        return f == size() ? null : this.d.get(f);
    }

    public E higher(E e) {
        int f = f(e, false);
        return f == size() ? null : this.d.get(f);
    }

    mlf<E> a(E e, boolean z) {
        return a(0, e(e, z));
    }

    int e(E e, boolean z) {
        return gwb.a(this.d, bm.a((Object) e), comparator(), z ? mnq.FIRST_AFTER : mnq.FIRST_PRESENT, mnm.NEXT_HIGHER);
    }

    mlf<E> a(E e, boolean z, E e2, boolean z2) {
        return b(e, z).a((Object) e2, z2);
    }

    mlf<E> b(E e, boolean z) {
        return a(f(e, z), size());
    }

    int f(E e, boolean z) {
        return gwb.a(this.d, bm.a((Object) e), comparator(), z ? mnq.FIRST_PRESENT : mnq.FIRST_AFTER, mnm.NEXT_HIGHER);
    }

    private Comparator<Object> g() {
        return this.a;
    }

    mnd<E> a(int i, int i2) {
        if (i == 0 && i2 == size()) {
            return this;
        }
        if (i < i2) {
            return new mnd(this.d.a(i, i2), this.a);
        }
        return mlf.a(this.a);
    }

    int a(Object obj) {
        if (obj == null) {
            return -1;
        }
        try {
            int a = gwb.a(this.d, obj, g(), mnq.ANY_PRESENT, mnm.INVERTED_INSERTION_INDEX);
            if (a >= 0) {
                return a;
            }
            return -1;
        } catch (ClassCastException e) {
            return -1;
        }
    }

    mjq<E> d() {
        return size() <= 1 ? this.d : new mky(this, this.d);
    }

    mlf<E> U_() {
        Comparator c = mms.a(this.a).c();
        if (isEmpty()) {
            return mlf.a(c);
        }
        return new mnd(this.d.d(), c);
    }
}
