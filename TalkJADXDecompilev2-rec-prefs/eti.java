package p000;

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class eti extends euj<kmz, kna> {
    private final int f12231a;

    protected /* synthetic */ evz mo1045a(nzf nzf) {
        return fgn.m15251a((kna) nzf);
    }

    protected /* synthetic */ void mo1041b(nzf nzf) {
        m14462a((kmz) nzf);
    }

    public eti(Context context, int i, fgm fgm) {
        super(jvc.newBuilder().m25299a(context, i).m25298a(), fgm, "getphoto", fom.PLUSI, new kmz(), new kna());
        this.f12231a = i;
    }

    public void mo1046a(int i, String str, Exception exception) {
        evz d = mo1043d();
        if (d != null) {
            RealTimeChatService.m8998a(this.f12231a, d);
        }
    }

    private void m14462a(kmz kmz) {
        fgm fgm = (fgm) this.f5790e;
        kmz.apiHeader = new kmt();
        kmz.f22411a = new kon();
        kmz.f22411a.f22536b = fgm.m8025d();
        kmz.f22411a.f22535a = fgm.m8024c();
        koo koo = new koo();
        koo.f22545g = Boolean.valueOf(false);
        koo.f22547i = Boolean.valueOf(false);
        koo.f22539a = Boolean.valueOf(false);
        koo.f22546h = Boolean.valueOf(false);
        koo.f22550l = Boolean.valueOf(true);
        koo.f22543e = Boolean.valueOf(false);
        koo.f22544f = Boolean.valueOf(true);
        koo.f22542d = Boolean.valueOf(false);
        koo.f22540b = Boolean.valueOf(true);
        koo.f22541c = Boolean.valueOf(true);
        koo.f22549k = Integer.valueOf(1);
        kmz.f22411a.f22537c = koo;
    }
}
