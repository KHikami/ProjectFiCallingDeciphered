package p000;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

public final class fdm implements iih {
    private final Object f12744a = new Object();
    private final Map<Integer, iid> f12745b = new HashMap();
    private final Context f12746c;
    private final jcf f12747d;

    public fdm(Context context) {
        this.f12746c = context;
        this.f12747d = (jcf) jyn.m25426a(context, jcf.class);
    }

    public iid mo1979a(int i) {
        String b;
        if (this.f12747d.mo3467c(i)) {
            b = this.f12747d.mo3456a(i).mo3440b("account_name");
        } else {
            b = null;
        }
        iid iid = (iid) this.f12745b.get(Integer.valueOf(i));
        if (iid == null) {
            synchronized (this.f12744a) {
                iid = (iid) this.f12745b.get(Integer.valueOf(i));
                if (iid == null) {
                    iid = new dvn(this.f12746c, b, i);
                    this.f12745b.put(Integer.valueOf(i), iid);
                }
            }
        }
        return iid;
    }

    public iid mo1978a() {
        return mo1979a(((dlh) jyn.m25426a(this.f12746c, dlh.class)).mo1405a());
    }
}
