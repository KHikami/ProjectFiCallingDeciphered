package p000;

import java.util.Arrays;
import java.util.Comparator;

public final class mlg<E> extends mkt<E> {
    private final Comparator<? super E> f27879c;

    public /* synthetic */ mjl mo3854a(Object obj) {
        return m32448d(obj);
    }

    public /* synthetic */ mjm mo3839a(Object[] objArr) {
        return m32456c(objArr);
    }

    public /* synthetic */ mks mo3877a() {
        return m32454b();
    }

    public /* synthetic */ mjm mo3840b(Object obj) {
        return m32448d(obj);
    }

    public /* synthetic */ mkt mo3878b(Object[] objArr) {
        return m32456c(objArr);
    }

    public /* synthetic */ mkt mo3879c(Object obj) {
        return m32448d(obj);
    }

    public mlg(Comparator<? super E> comparator) {
        this.f27879c = (Comparator) bm.m6122a((Object) comparator);
    }

    private mlg<E> m32448d(E e) {
        super.mo3879c(e);
        return this;
    }

    public mlg<E> m32456c(E... eArr) {
        super.mo3878b((Object[]) eArr);
        return this;
    }

    public mlf<E> m32454b() {
        mlf<E> a;
        Object[] objArr = this.a;
        Comparator comparator = this.f27879c;
        int i = this.b;
        if (i == 0) {
            a = mlf.m32263a(comparator);
        } else {
            mmr.m32524b(objArr, i);
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
            a = new mnd(mjq.m32316b(objArr, i3), comparator);
        }
        this.b = a.size();
        return a;
    }
}
