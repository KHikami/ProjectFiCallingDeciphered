package p000;

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Collection;
import java.util.List;

public final class etj extends euj<knf, kng> {
    private final boolean f12232a;
    private final int f12233b;

    protected /* synthetic */ evz mo1045a(nzf nzf) {
        return fgq.m15269a((kng) nzf);
    }

    protected /* synthetic */ void mo1041b(nzf nzf) {
        m14467a((knf) nzf);
    }

    public etj(Context context, int i, fgp fgp, boolean z) {
        super(jvc.newBuilder().m25299a(context, i).m25298a(), fgp, "lookupmergedperson", fom.PLUSI, new knf(), new kng());
        this.f12233b = i;
        this.f12232a = z;
    }

    public void mo1046a(int i, String str, Exception exception) {
        evz d = mo1043d();
        if (d != null && this.f12232a) {
            RealTimeChatService.m8998a(this.f12233b, d);
        }
    }

    public static etj m14466a(Context context, int i, int i2, int i3, Integer num, Collection<String> collection) {
        gwb.aK();
        etj etj = new etj(context, i, new fgp(i2, 0, num, collection), false);
        etj.m8069g();
        return etj;
    }

    private void m14467a(knf knf) {
        fgp fgp = (fgp) this.f5790e;
        knf.f22419a = new krs();
        knf.f22419a.f22931a = new kjc();
        knf.f22419a.f22931a.f21902b = Integer.valueOf(fgp.m15265c());
        knf.f22419a.f22931a.f21903c = Integer.valueOf(fgp.m15266d());
        knf.f22419a.f22931a.f21907g = fgp.m15267e();
        List f = fgp.m15268f();
        knf.f22419a.f22931a.f21901a = (String) f.get(0);
        String[] strArr = new String[f.size()];
        f.toArray(strArr);
        knf.f22419a.f22931a.f21905e = strArr;
    }
}
