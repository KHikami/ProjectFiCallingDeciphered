package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class bgj implements bhf, bhh, bhj, bhm {
    private final int f3313a;
    private final long f3314b;
    private final List<String> f3315c;
    private final bhr f3316d;
    private transient blo f3317e;

    bgj(int i, long j, List<String> list) {
        this.f3313a = i;
        this.f3314b = j;
        this.f3315c = list;
        this.f3316d = new bhs().m5272d(j).m5267a();
    }

    public bhr mo540a() {
        return this.f3316d;
    }

    public void mo541a(Context context) {
    }

    public String mo542b() {
        return getClass().getName();
    }

    public bhk mo543c() {
        return bhk.USE_OLD;
    }

    public bhu mo544d() {
        return new bhv().m5276a();
    }

    public int mo539a(Context context, bhb bhb) {
        if (this.f3317e == null) {
            this.f3317e = new blo(context, this.f3313a);
        }
        List v = this.f3317e.m6109v();
        Collection arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        for (String str : this.f3315c) {
            if (v.contains(str)) {
                arrayList.add(new euw(str, true, false, false, null, 0, null, 0, null));
                arrayList2.add(str);
            }
        }
        if (arrayList.size() > 0) {
            bko e = fde.m15018e(this.f3313a);
            if (e != null) {
                fdn e2 = fde.m15019e(e);
                if (e2 != null) {
                    e2.m15079a(arrayList, -1);
                    long a = gwb.m1519a(context, "babel_call_media_type_refresh_log_delay_ms", fls.f13447x);
                    ((bhl) jyn.m25426a(context, bhl.class)).mo550a(new bgk(this.f3313a, a, arrayList2));
                    glk.m17970a("Babel_CMTRTask", "call_media_type refresh logging task scheduled with a delay of %d ms and %d conversations for account %d.", Long.valueOf(a), Integer.valueOf(arrayList2.size()), Integer.valueOf(this.f3313a));
                } else {
                    glk.m17981d("Babel_CMTRTask", "BabelClient is null for account %d.", Integer.valueOf(this.f3313a));
                }
            } else {
                glk.m17981d("Babel_CMTRTask", "Account id is not valid: %d.", Integer.valueOf(this.f3313a));
            }
        }
        return bhn.f3348a;
    }
}
