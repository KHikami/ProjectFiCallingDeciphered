package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* renamed from: fdm */
public final class fdm implements iih {
    private final Object a;
    private final Map<Integer, iid> b;
    private final Context c;
    private final jcf d;

    public fdm(Context context) {
        this.a = new Object();
        this.b = new HashMap();
        this.c = context;
        this.d = (jcf) jyn.a(context, jcf.class);
    }

    public iid a(int i) {
        String b;
        if (this.d.c(i)) {
            b = this.d.a(i).b("account_name");
        } else {
            b = null;
        }
        iid iid = (iid) this.b.get(Integer.valueOf(i));
        if (iid == null) {
            synchronized (this.a) {
                iid = (iid) this.b.get(Integer.valueOf(i));
                if (iid == null) {
                    iid = new dvn(this.c, b, i);
                    this.b.put(Integer.valueOf(i), iid);
                }
            }
        }
        return iid;
    }

    public iid a() {
        return a(((dlh) jyn.a(this.c, dlh.class)).a());
    }
}
