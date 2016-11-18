package p000;

import java.util.Comparator;

final class jcz implements Comparator<Integer> {
    final /* synthetic */ Comparator f19886a;
    final /* synthetic */ jcx f19887b;

    jcz(jcx jcx, Comparator comparator) {
        this.f19887b = jcx;
        this.f19886a = comparator;
    }

    public /* synthetic */ int compare(Object obj, Object obj2) {
        return m23949a((Integer) obj, (Integer) obj2);
    }

    private int m23949a(Integer num, Integer num2) {
        return this.f19886a.compare(this.f19887b.mo3456a(num.intValue()), this.f19887b.mo3456a(num2.intValue()));
    }
}
