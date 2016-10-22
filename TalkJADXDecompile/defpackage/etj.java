package defpackage;

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Collection;
import java.util.List;

/* renamed from: etj */
public final class etj extends euj<knf, kng> {
    private final boolean a;
    private final int b;

    protected /* synthetic */ evz a(nzf nzf) {
        return fgq.a((kng) nzf);
    }

    protected /* synthetic */ void b(nzf nzf) {
        a((knf) nzf);
    }

    public etj(Context context, int i, fgp fgp, boolean z) {
        super(jvc.newBuilder().a(context, i).a(), fgp, "lookupmergedperson", fom.PLUSI, new knf(), new kng());
        this.b = i;
        this.a = z;
    }

    public void a(int i, String str, Exception exception) {
        evz d = d();
        if (d != null && this.a) {
            RealTimeChatService.a(this.b, d);
        }
    }

    public static etj a(Context context, int i, int i2, int i3, Integer num, Collection<String> collection) {
        gwb.aK();
        etj etj = new etj(context, i, new fgp(i2, 0, num, collection), false);
        etj.g();
        return etj;
    }

    private void a(knf knf) {
        fgp fgp = (fgp) this.e;
        knf.a = new krs();
        knf.a.a = new kjc();
        knf.a.a.b = Integer.valueOf(fgp.c());
        knf.a.a.c = Integer.valueOf(fgp.d());
        knf.a.a.g = fgp.e();
        List f = fgp.f();
        knf.a.a.a = (String) f.get(0);
        String[] strArr = new String[f.size()];
        f.toArray(strArr);
        knf.a.a.e = strArr;
    }
}
