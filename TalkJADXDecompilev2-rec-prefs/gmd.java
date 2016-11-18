package p000;

import android.content.Context;
import java.util.List;

public final class gmd {
    private static final boolean f15643a = false;
    private final Context f15644b;
    private List<bjg> f15645c;

    static {
        kae kae = glk.f15573t;
    }

    public gmd(Context context, List<bjg> list) {
        this.f15644b = context;
        this.f15645c = list;
    }

    public boolean m18082a() {
        if (this.f15645c.isEmpty()) {
            return false;
        }
        if (this.f15645c.size() > 1) {
            return false;
        }
        if (!((bjg) this.f15645c.get(0)).m5407z()) {
            return false;
        }
        boolean a = ((fbx) jyn.m25426a(this.f15644b, fbx.class)).mo1968a(this.f15644b, fde.m15018e(((jca) jyn.m25426a(this.f15644b, jca.class)).mo2317a()));
        boolean d = glq.m18018d(this.f15644b);
        if (f15643a) {
            new StringBuilder(70).append("[canPhoneCall] canCallOverHangoutsDialer: ").append(a).append(" canCallOverPstn: ").append(d);
        }
        return a || d;
    }

    public boolean m18083b() {
        if (this.f15645c.isEmpty()) {
            return false;
        }
        return m18081d();
    }

    public boolean m18084c() {
        boolean z;
        for (bjg s : this.f15645c) {
            if (!s.mo585s()) {
                z = false;
                break;
            }
        }
        z = true;
        boolean d = m18081d();
        if (f15643a) {
            new StringBuilder(90).append("[canContactViaHangouts] isHangoutsCallingEnabled: ").append(d).append(" allContactsAreHangoutsUsers: ").append(z);
        }
        if (d && z) {
            return true;
        }
        return false;
    }

    private boolean m18081d() {
        int a = ((jca) jyn.m25426a(this.f15644b, jca.class)).mo2317a();
        fzw fzw = (fzw) jyn.m25426a(this.f15644b, fzw.class);
        boolean c = dgg.m11692a().m11710c();
        boolean a2 = fzw.mo2146a(a);
        if (f15643a) {
            new StringBuilder(84).append("[isHangoutsCallingEnabled] isHangoutsSupported: ").append(c).append(" isCarrierSmsOnlyAccount: ").append(a2);
        }
        return c && !a2;
    }
}
