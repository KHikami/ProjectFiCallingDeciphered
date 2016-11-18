package defpackage;

import android.content.Context;
import android.os.ConditionVariable;
import java.util.ArrayList;
import java.util.Collection;

final class dxr extends fje {
    exj a;
    Exception b;
    Context c;
    private ConditionVariable d;

    dxr(Context context, ConditionVariable conditionVariable) {
        super(context);
        this.c = context;
        this.d = conditionVariable;
    }

    void a(Collection<String> collection, int i) {
        ArrayList arrayList = new ArrayList();
        for (String a : collection) {
            arrayList.add(fbt.a(null, a, false));
        }
        gwb.a(new dxs(this, i, arrayList));
    }

    void b(Collection<String> collection, int i) {
        ArrayList arrayList = new ArrayList();
        for (String a : collection) {
            arrayList.add(fbt.a(a, null, false));
        }
        gwb.a(new dxt(this, i, arrayList));
    }

    protected void a(fiu fiu) {
        this.a = (exj) fiu.c();
        this.d.open();
    }

    protected void a(Exception exception) {
        this.b = exception;
        this.d.open();
    }
}
