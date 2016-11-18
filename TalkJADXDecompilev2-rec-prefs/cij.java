package p000;

import android.content.Context;
import java.util.List;

final class cij {
    private final Context f5376a;
    private final cik f5377b;
    private fcm f5378c;
    private bpd f5379d;
    private List<String> f5380e;

    public cij(Context context, cik cik) {
        this.f5376a = context;
        this.f5377b = cik;
    }

    public void m7718a(bpd bpd) {
        this.f5379d = bpd;
        if (m7716a()) {
            m7717b();
        }
    }

    public void m7719a(List<String> list) {
        this.f5380e = list;
        if (m7716a()) {
            m7717b();
        }
    }

    private boolean m7716a() {
        if (this.f5379d == null) {
            return false;
        }
        if (!gwb.m2254i(this.f5379d.f4147b)) {
            return true;
        }
        if (this.f5380e != null) {
            return true;
        }
        return false;
    }

    private void m7717b() {
        bxt bxt;
        ba.m4609b(m7716a());
        int a = ((jca) jyn.m25426a(this.f5376a, jca.class)).mo2317a();
        if (gwb.m2254i(this.f5379d.f4147b)) {
            bxt = bxt.SMS_MESSAGE;
        } else {
            bxt = bxt.HANGOUTS_MESSAGE;
        }
        fcn fcn = (fcn) jyn.m25426a(this.f5376a, fcn.class);
        if (bxt != bxt.HANGOUTS_MESSAGE) {
            for (String a2 : this.f5380e) {
                this.f5378c = fcn.mo1976a(a, bxt, this.f5379d.f4147b, a2);
                if (!this.f5378c.m14964a()) {
                    break;
                }
            }
        } else {
            this.f5378c = fcn.mo1976a(a, bxt, this.f5379d.f4147b, this.f5379d.f4148c);
        }
        if (this.f5377b != null) {
            this.f5377b.m7720a(this.f5378c);
        }
    }
}
