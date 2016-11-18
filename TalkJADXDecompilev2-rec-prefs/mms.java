package p000;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map.Entry;

public abstract class mms<T> implements Comparator<T> {
    public abstract int compare(T t, T t2);

    public static <T> mms<T> m32221a(Comparator<T> comparator) {
        if (comparator instanceof mms) {
            return (mms) comparator;
        }
        return new miw(comparator);
    }

    protected mms() {
    }

    public <S extends T> mms<S> mo3888c() {
        return new mnf(this);
    }

    public <S extends T> mms<S> mo3886a() {
        return new mmp(this);
    }

    public <S extends T> mms<S> mo3887b() {
        return new mmq(this);
    }

    public <F> mms<F> m32224a(met<F, ? extends T> met_F___extends_T) {
        return new miu(met_F___extends_T, this);
    }

    <T2 extends T> mms<Entry<T2, ?>> m32227d() {
        return m32224a(mls.m32482a());
    }

    public <E extends T> mjq<E> m32222a(Iterable<E> iterable) {
        Object[] c = gwb.m2119c((Iterable) iterable);
        for (Object a : c) {
            bm.m6122a(a);
        }
        Arrays.sort(c, this);
        return mjq.m32316b(c, c.length);
    }
}
