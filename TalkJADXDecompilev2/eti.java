package defpackage;

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class eti extends euj<kmz, kna> {
    private final int a;

    protected /* synthetic */ evz a(nzf nzf) {
        return fgn.a((kna) nzf);
    }

    protected /* synthetic */ void b(nzf nzf) {
        a((kmz) nzf);
    }

    public eti(Context context, int i, fgm fgm) {
        super(jvc.newBuilder().a(context, i).a(), fgm, "getphoto", fom.PLUSI, new kmz(), new kna());
        this.a = i;
    }

    public void a(int i, String str, Exception exception) {
        evz d = d();
        if (d != null) {
            RealTimeChatService.a(this.a, d);
        }
    }

    private void a(kmz kmz) {
        fgm fgm = (fgm) this.e;
        kmz.apiHeader = new kmt();
        kmz.a = new kon();
        kmz.a.b = fgm.d();
        kmz.a.a = fgm.c();
        koo koo = new koo();
        koo.g = Boolean.valueOf(false);
        koo.i = Boolean.valueOf(false);
        koo.a = Boolean.valueOf(false);
        koo.h = Boolean.valueOf(false);
        koo.l = Boolean.valueOf(true);
        koo.e = Boolean.valueOf(false);
        koo.f = Boolean.valueOf(true);
        koo.d = Boolean.valueOf(false);
        koo.b = Boolean.valueOf(true);
        koo.c = Boolean.valueOf(true);
        koo.k = Integer.valueOf(1);
        kmz.a.c = koo;
    }
}
