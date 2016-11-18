package p000;

import android.os.ConditionVariable;
import java.util.ArrayList;
import java.util.Collection;

final class dxk extends fje {
    exj f10759a;
    final /* synthetic */ dxg f10760b;
    private ConditionVariable f10761c;

    dxk(dxg dxg, ConditionVariable conditionVariable) {
        this.f10760b = dxg;
        super(dxg.f10714d);
        this.f10761c = conditionVariable;
    }

    void m12979a(Collection<String> collection, int i) {
        ArrayList arrayList = new ArrayList();
        for (String a : collection) {
            arrayList.add(fbt.m14918a(a, null, false));
        }
        gwb.m1863a(new dxl(this, i, arrayList));
    }

    protected void mo651a(fiu fiu) {
        this.f10759a = (exj) fiu.m15392c();
        this.f10761c.open();
    }

    protected void mo652a(Exception exception) {
        this.f10761c.open();
    }
}
