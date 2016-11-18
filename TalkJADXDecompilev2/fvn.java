package defpackage;

import android.widget.Toast;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class fvn extends czj<evp, fab> {
    final /* synthetic */ fvl d;
    private final int e;
    private final boolean f;

    fvn(fvl fvl, int i, boolean z) {
        this.d = fvl;
        this.e = i;
        this.f = z;
    }

    public void a(fme fme) {
        RealTimeChatService.a(fme, this.d.c, this.e, this.f);
    }

    protected void a(fiu fiu) {
        super.a(fiu);
        fab fab = (fab) fiu.c();
        int a = this.d.a.a();
        Boolean k = fab.k();
        if (k != null) {
            boolean b = gwb.b(k);
            this.d.f.a(b);
            this.d.b.b(a, b);
        }
        Boolean l = fab.l();
        if (l != null) {
            boolean b2 = gwb.b(l);
            this.d.e.a(b2);
            this.d.b.a(a, b2);
        }
    }

    protected void a(Exception exception) {
        super.a(exception);
        if (this.e == 2) {
            this.d.f.a(!this.f);
        }
    }

    public Class<evp> d() {
        return evp.class;
    }

    public Class<fab> e() {
        return fab.class;
    }

    public void b() {
        if (czj.i()) {
            Toast.makeText(this.d.context, bc.jW, 0).show();
        } else {
            Toast.makeText(this.d.context, bc.jX, 0).show();
        }
    }

    public String a() {
        return this.d.getActivity().getString(bc.jV);
    }
}
