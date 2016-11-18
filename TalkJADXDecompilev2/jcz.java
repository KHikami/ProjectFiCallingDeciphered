package defpackage;

import java.util.Comparator;

final class jcz implements Comparator<Integer> {
    final /* synthetic */ Comparator a;
    final /* synthetic */ jcx b;

    jcz(jcx jcx, Comparator comparator) {
        this.b = jcx;
        this.a = comparator;
    }

    public /* synthetic */ int compare(Object obj, Object obj2) {
        return a((Integer) obj, (Integer) obj2);
    }

    private int a(Integer num, Integer num2) {
        return this.a.compare(this.b.a(num.intValue()), this.b.a(num2.intValue()));
    }
}
