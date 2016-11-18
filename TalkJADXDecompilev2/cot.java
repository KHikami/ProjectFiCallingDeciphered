package defpackage;

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public class cot extends cpc {
    private final long g;

    public cot(Context context, bko bko, String str, CharSequence charSequence, bxn bxn, int i, String str2, boolean z, String str3, long j) {
        super(context, bko, str, charSequence, bxn, i, str2, z, str3);
        this.g = j;
    }

    protected void a() {
        ba.a(this.c.a, glj.b(), 10, ba.c().b(h()).a(this.b).a(205));
    }

    protected void d() {
        ba.a(this.c.a, glj.b(), 10, ba.c().b(h()).a(this.b).a(105));
    }

    protected void e() {
        ba.a(this.c.a, glj.b(), 10, ba.c().b(h()).a(this.b).a(106));
    }

    protected void a(blo blo, long j, int i, String str, bls bls, String str2, boolean z, CharSequence charSequence) {
        long j2 = this.g;
        blo blo2 = new blo(this.a, this.c.a);
        bme b = blo2.b(j2);
        String str3 = b.j;
        if (str3 == null) {
            str3 = b.k;
        }
        long a = glj.a() * 1000;
        blo2.a(b.b, a, b.i, 6, b.o, blo2.g().b(), b.e, str3, j2, b.z, 0);
        blo2.a(j2, fwx.QUEUED, a);
        a(blo, z, i, str, bls, str2, charSequence);
        blo.a(str2, h(), fwx.UPLOADING, 0);
    }

    protected void f() {
        RealTimeChatService.a(this.c.b, new Long[]{Long.valueOf(this.g)}, this.b);
    }
}
