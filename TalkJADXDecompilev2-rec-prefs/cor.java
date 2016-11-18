package p000;

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public class cor extends cov {
    private final long f8737g;

    public cor(Context context, bko bko, String str, CharSequence charSequence, bxn bxn, int i, String str2, boolean z, String str3, long j) {
        super(context, bko, str, charSequence, bxn, i, str2, z, str3);
        this.f8737g = j;
    }

    protected void mo1365a() {
        ba.m4548a(this.f5736c.f12721a, glj.m17963b(), 10, ba.m4618c().m12794b(m10565h()).m12789a(this.b).m12786a(205));
    }

    protected void mo1367d() {
        ba.m4548a(this.f5736c.f12721a, glj.m17963b(), 10, ba.m4618c().m12794b(m10565h()).m12789a(this.b).m12786a(105));
    }

    protected void mo1368e() {
        ba.m4548a(this.f5736c.f12721a, glj.m17963b(), 10, ba.m4618c().m12794b(m10565h()).m12789a(this.b).m12786a(106));
    }

    public int mo539a(Context context, bhb bhb) {
        super.mo539a(context, bhb);
        return bhn.f3348a;
    }

    protected void mo1366a(blo blo, long j, int i, String str, bls bls, String str2, boolean z, CharSequence charSequence) {
        m10568a(blo, this.f8737g);
        m10557a(blo, z, i, str, bls, str2, charSequence);
        blo.m5992a(m10564g(), m10565h(), fwx.SENDING, 0);
    }

    void m10568a(blo blo, long j) {
        bme b = blo.m6009b(j);
        String str = b.f3936j;
        if (str == null) {
            str = b.f3937k;
        }
        long a = glj.m17956a() * 1000;
        blo.m6005a(b.f3928b, a, b.f3935i, 6, b.f3941o, blo.m6056g().m5632b(), b.f3931e, str, j, b.f3952z, 0);
        blo.m5965a(j, fwx.QUEUED, a);
    }

    protected void mo1369f() {
        RealTimeChatService.m9034a(this.f5736c.f12722b, new Long[]{Long.valueOf(this.f8737g)}, this.b);
    }
}
