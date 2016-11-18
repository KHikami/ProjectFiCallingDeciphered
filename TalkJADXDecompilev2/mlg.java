package defpackage;

import java.util.Arrays;
import java.util.Comparator;

public final class mlg<E> extends mkt<E> {
    private final Comparator<? super E> c;

    public /* synthetic */ mjl a(Object obj) {
        return d(obj);
    }

    public /* synthetic */ mjm a(Object[] objArr) {
        return c(objArr);
    }

    public /* synthetic */ mks a() {
        return b();
    }

    public /* synthetic */ mjm b(Object obj) {
        return d(obj);
    }

    public /* synthetic */ mkt b(Object[] objArr) {
        return c(objArr);
    }

    public /* synthetic */ mkt c(Object obj) {
        return d(obj);
    }

    public mlg(Comparator<? super E> comparator) {
        this.c = (Comparator) bm.a((Object) comparator);
    }

    private mlg<E> d(E e) {
        super.c(e);
        return this;
    }

    public mlg<E> c(E... eArr) {
        super.b((Object[]) eArr);
        return this;
    }

    public mlf<E> b() {
        mlf<E> a;
        Object[] objArr = this.a;
        Comparator comparator = this.c;
        int i = this.b;
        if (i == 0) {
            a = mlf.a(comparator);
        } else {
            mmr.b(objArr, i);
            Arrays.sort(objArr, 0, i, comparator);
            int i2 = 1;
            int i3 = 1;
            while (i2 < i) {
                int i4;
                Object obj = objArr[i2];
                if (comparator.compare(obj, objArr[i3 - 1]) != 0) {
                    i4 = i3 + 1;
                    objArr[i3] = obj;
                } else {
                    i4 = i3;
                }
                i2++;
                i3 = i4;
            }
            Arrays.fill(objArr, i3, i, null);
            a = new mnd(mjq.b(objArr, i3), comparator);
        }
        this.b = a.size();
        return a;
    }
}
