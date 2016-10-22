package defpackage;

import android.content.Context;
import java.util.List;

/* renamed from: cij */
final class cij {
    private final Context a;
    private final cik b;
    private fcm c;
    private bpd d;
    private List<String> e;

    public cij(Context context, cik cik) {
        this.a = context;
        this.b = cik;
    }

    public void a(bpd bpd) {
        this.d = bpd;
        if (a()) {
            b();
        }
    }

    public void a(List<String> list) {
        this.e = list;
        if (a()) {
            b();
        }
    }

    private boolean a() {
        if (this.d == null) {
            return false;
        }
        if (!gwb.i(this.d.b)) {
            return true;
        }
        if (this.e != null) {
            return true;
        }
        return false;
    }

    private void b() {
        bxt bxt;
        ba.b(a());
        int a = ((jca) jyn.a(this.a, jca.class)).a();
        if (gwb.i(this.d.b)) {
            bxt = bxt.SMS_MESSAGE;
        } else {
            bxt = bxt.HANGOUTS_MESSAGE;
        }
        fcn fcn = (fcn) jyn.a(this.a, fcn.class);
        if (bxt != bxt.HANGOUTS_MESSAGE) {
            for (String a2 : this.e) {
                this.c = fcn.a(a, bxt, this.d.b, a2);
                if (!this.c.a()) {
                    break;
                }
            }
        } else {
            this.c = fcn.a(a, bxt, this.d.b, this.d.c);
        }
        if (this.b != null) {
            this.b.a(this.c);
        }
    }
}
