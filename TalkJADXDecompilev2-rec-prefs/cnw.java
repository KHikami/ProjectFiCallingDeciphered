package p000;

import android.content.Context;
import android.text.TextUtils;

public final class cnw implements cnt {
    private final Context f5729a;
    private final jyn f5730b;

    public cnw(Context context) {
        this.f5729a = context;
        this.f5730b = jyn.m25435b(context);
    }

    public void mo1028a(int i, String str, CharSequence charSequence, bxn bxn, boolean z, String str2) {
        if (TextUtils.isEmpty(charSequence) && bxn == null) {
            glk.m17982e("Babel_ConvService", "The message has empty text and attachment. Skip sending.", new Object[0]);
            return;
        }
        m8028a(fde.m15018e(i), str, charSequence, "", z, 0, bxn, str2);
    }

    public void mo1027a(int i, String str, bxy bxy) {
        m8028a(fde.m15018e(i), str, "", "", true, 0, bxy, bxy.e);
    }

    private String m8028a(bko bko, String str, CharSequence charSequence, String str2, boolean z, int i, bxn bxn, String str3) {
        bhm cpc;
        if (bxn == null || !(bxn.f4741c == bxo.PHOTO || bxn.f4741c == bxo.VIDEO)) {
            Object cov = new cov(this.f5729a, bko, str, charSequence, bxn, 0, str2, z, str3);
        } else {
            cpc = new cpc(this.f5729a, bko, str, charSequence, bxn, 0, str2, z, str3);
        }
        ba.m4548a(bko.m5638g(), glj.m17963b(), 10, ba.m4618c().m12794b(str3).m12789a(str).m12786a(211));
        ((bhl) jyn.m25426a(this.f5729a, bhl.class)).mo550a(cpc);
        return str3;
    }

    public void mo1025a(int i, String str, int i2) {
        ((bhl) jyn.m25426a(this.f5729a, bhl.class)).mo550a(new coj(fde.m15018e(i), str, i2));
    }

    public void mo1026a(int i, String str, long j) {
        ((bhl) jyn.m25426a(this.f5729a, bhl.class)).mo550a(new cnz(fde.m15018e(i), str, j));
    }

    public void mo1031b(int i, String str, long j) {
        ((bhl) jyn.m25426a(this.f5729a, bhl.class)).mo550a(new cos(fde.m15018e(i), str, j));
    }

    public void mo1029a(int i, String str, String str2) {
        ((bhl) jyn.m25426a(this.f5729a, bhl.class)).mo550a(new coq(fde.m15018e(i), str, str2));
    }

    public void mo1030a(int i, String str, boolean z) {
        ((bhl) jyn.m25426a(this.f5729a, bhl.class)).mo550a(new coe(i, str, z));
    }
}
