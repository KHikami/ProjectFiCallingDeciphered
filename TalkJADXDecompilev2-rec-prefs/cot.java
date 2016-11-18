package p000;

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public class cot extends cpc {
    private final long f8740g;

    public cot(Context context, bko bko, String str, CharSequence charSequence, bxn bxn, int i, String str2, boolean z, String str3, long j) {
        super(context, bko, str, charSequence, bxn, i, str2, z, str3);
        this.f8740g = j;
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

    protected void mo1366a(blo blo, long j, int i, String str, bls bls, String str2, boolean z, CharSequence charSequence) {
        long j2 = this.f8740g;
        blo blo2 = new blo(this.a, this.f5736c.f12721a);
        bme b = blo2.m6009b(j2);
        String str3 = b.f3936j;
        if (str3 == null) {
            str3 = b.f3937k;
        }
        long a = glj.m17956a() * 1000;
        blo2.m6005a(b.f3928b, a, b.f3935i, 6, b.f3941o, blo2.m6056g().m5632b(), b.f3931e, str3, j2, b.f3952z, 0);
        blo2.m5965a(j2, fwx.QUEUED, a);
        m10557a(blo, z, i, str, bls, str2, charSequence);
        blo.m5992a(str2, m10565h(), fwx.UPLOADING, 0);
    }

    protected void mo1369f() {
        RealTimeChatService.m9034a(this.f5736c.f12722b, new Long[]{Long.valueOf(this.f8740g)}, this.b);
    }
}
