package p000;

import android.content.Context;
import android.text.TextUtils;

public final class jhh implements jhf {
    final Context f20064a;
    final jkn f20065b;
    private int f20066c = -1;
    private jhi f20067d = null;
    private final jhk f20068e = new jhk(this);
    private final jhl f20069f = new jhl(this);
    private final jtv f20070g = new jhj();

    public jhh(Context context) {
        this.f20064a = context;
        jyn b = jyn.m25435b(context);
        this.f20065b = (jkn) b.m25443a(jkn.class);
        jhg jhg = (jhg) b.m25454b(jhg.class);
        if (jhg != null) {
            this.f20066c = jhg.m24212a();
        }
    }

    public jtv mo3506a(Context context, String str, int i, int i2, jtx jtx) {
        return m24213a(context, str, i, i2, jtx, false);
    }

    public jtv mo3507b(Context context, String str, int i, int i2, jtx jtx) {
        return m24213a(context, str, i, i2, jtx, true);
    }

    private jtv m24213a(Context context, String str, int i, int i2, jtx jtx, boolean z) {
        if (TextUtils.isEmpty(str)) {
            jtx.mo1323a(this.f20070g);
            return this.f20070g;
        }
        int i3;
        jhi jhi;
        jpf a = jpf.m24888a(context, str, jpl.IMAGE);
        int i4 = this.f20066c;
        if (z) {
            i3 = 524288;
        } else {
            i3 = 0;
        }
        if (this.f20067d != null) {
            jhi jhi2 = this.f20067d;
            this.f20067d = (jhi) this.f20067d.m24225h();
            jhi2.m24219a(null);
            jhi = jhi2;
        } else {
            jhi = new jhi();
        }
        jhi.m24227a(((i3 & -33) & -5) & -257, a, gwb.m2368v(this.f20064a, i), i4, i2);
        return m24214a(jhi, jtx);
    }

    public jph m24214a(jhi jhi, jtx jtx) {
        jtv jtv = (jph) this.f20065b.mo3539a((jtw) jhi);
        if (jtv == null) {
            jtv = new jph(this.f20065b, jhi);
            switch (jhi.m24228b()) {
                case 1:
                    jtv.f20098c = this.f20068e;
                    break;
                case 2:
                    jtv.f20098c = this.f20069f;
                    break;
                default:
                    jtv.f20098c = null;
                    break;
            }
        }
        jhi.m24219a(this.f20067d);
        this.f20067d = jhi;
        this.f20065b.mo3543a(jtv, jtx);
        return jtv;
    }
}
