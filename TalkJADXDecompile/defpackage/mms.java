package defpackage;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map.Entry;

/* renamed from: mms */
public abstract class mms<T> implements Comparator<T> {
    public abstract int compare(T t, T t2);

    public static <T> mms<T> a(Comparator<T> comparator) {
        if (comparator instanceof mms) {
            return (mms) comparator;
        }
        return new miw(comparator);
    }

    protected mms() {
    }

    public <S extends T> mms<S> c() {
        return new mnf(this);
    }

    public <S extends T> mms<S> a() {
        return new mmp(this);
    }

    public <S extends T> mms<S> b() {
        return new mmq(this);
    }

    public <F> mms<F> a(met<F, ? extends T> met_F___extends_T) {
        return new miu(met_F___extends_T, this);
    }

    <T2 extends T> mms<Entry<T2, ?>> d() {
        return a(mls.a());
    }

    public <E extends T> mjq<E> a(Iterable<E> iterable) {
        Object[] c = gwb.c((Iterable) iterable);
        for (Object a : c) {
            bm.a(a);
        }
        Arrays.sort(c, this);
        return mjq.b(c, c.length);
    }
}
