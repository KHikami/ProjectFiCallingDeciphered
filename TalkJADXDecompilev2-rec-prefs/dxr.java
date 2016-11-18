package p000;

import android.content.Context;
import android.os.ConditionVariable;
import java.util.ArrayList;
import java.util.Collection;

final class dxr extends fje {
    exj f10770a;
    Exception f10771b;
    Context f10772c;
    private ConditionVariable f10773d;

    dxr(Context context, ConditionVariable conditionVariable) {
        super(context);
        this.f10772c = context;
        this.f10773d = conditionVariable;
    }

    void m12994a(Collection<String> collection, int i) {
        ArrayList arrayList = new ArrayList();
        for (String a : collection) {
            arrayList.add(fbt.m14918a(null, a, false));
        }
        gwb.m1863a(new dxs(this, i, arrayList));
    }

    void m12995b(Collection<String> collection, int i) {
        ArrayList arrayList = new ArrayList();
        for (String a : collection) {
            arrayList.add(fbt.m14918a(a, null, false));
        }
        gwb.m1863a(new dxt(this, i, arrayList));
    }

    protected void mo651a(fiu fiu) {
        this.f10770a = (exj) fiu.m15392c();
        this.f10773d.open();
    }

    protected void mo652a(Exception exception) {
        this.f10771b = exception;
        this.f10773d.open();
    }
}
