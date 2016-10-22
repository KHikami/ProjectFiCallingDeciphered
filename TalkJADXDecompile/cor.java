import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public class cor extends cov {
    private final long g;

    public cor(Context context, bko bko, String str, CharSequence charSequence, bxn bxn, int i, String str2, boolean z, String str3, long j) {
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

    public int a(Context context, bhb bhb) {
        super.a(context, bhb);
        return bhn.a;
    }

    protected void a(blo blo, long j, int i, String str, bls bls, String str2, boolean z, CharSequence charSequence) {
        a(blo, this.g);
        a(blo, z, i, str, bls, str2, charSequence);
        blo.a(g(), h(), fwx.SENDING, 0);
    }

    void a(blo blo, long j) {
        bme b = blo.b(j);
        String str = b.j;
        if (str == null) {
            str = b.k;
        }
        long a = glj.a() * 1000;
        blo.a(b.b, a, b.i, 6, b.o, blo.g().b(), b.e, str, j, b.z, 0);
        blo.a(j, fwx.QUEUED, a);
    }

    protected void f() {
        RealTimeChatService.a(this.c.b, new Long[]{Long.valueOf(this.g)}, this.b);
    }
}
