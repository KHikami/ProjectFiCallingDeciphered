package p000;

import android.widget.Toast;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class fvn extends czj<evp, fab> {
    final /* synthetic */ fvl f14106d;
    private final int f14107e;
    private final boolean f14108f;

    fvn(fvl fvl, int i, boolean z) {
        this.f14106d = fvl;
        this.f14107e = i;
        this.f14108f = z;
    }

    public void mo1480a(fme fme) {
        RealTimeChatService.m9051a(fme, this.f14106d.f14100c, this.f14107e, this.f14108f);
    }

    protected void mo1887a(fiu fiu) {
        super.mo1887a(fiu);
        fab fab = (fab) fiu.m15392c();
        int a = this.f14106d.f14098a.mo2317a();
        Boolean k = fab.m14838k();
        if (k != null) {
            boolean b = gwb.m2061b(k);
            this.f14106d.f14103f.mo534a(b);
            this.f14106d.f14099b.m16338b(a, b);
        }
        Boolean l = fab.m14839l();
        if (l != null) {
            boolean b2 = gwb.m2061b(l);
            this.f14106d.f14102e.mo534a(b2);
            this.f14106d.f14099b.m16336a(a, b2);
        }
    }

    protected void mo1888a(Exception exception) {
        super.mo1888a(exception);
        if (this.f14107e == 2) {
            this.f14106d.f14103f.mo534a(!this.f14108f);
        }
    }

    public Class<evp> mo1481d() {
        return evp.class;
    }

    public Class<fab> mo1482e() {
        return fab.class;
    }

    public void mo1475b() {
        if (czj.m11296i()) {
            Toast.makeText(this.f14106d.context, bc.jW, 0).show();
        } else {
            Toast.makeText(this.f14106d.context, bc.jX, 0).show();
        }
    }

    public String mo1479a() {
        return this.f14106d.getActivity().getString(bc.jV);
    }
}
