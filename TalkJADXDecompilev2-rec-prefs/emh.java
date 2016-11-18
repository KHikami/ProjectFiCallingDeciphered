package p000;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class emh extends emv {
    final /* synthetic */ elk f11846a;

    emh(elk elk, String str) {
        this.f11846a = elk;
        super(str);
    }

    public void mo811a() {
        RealTimeChatService.m9006a(this.f11846a.f11812c, false, fjl.NO_DELAY, flt.FORCE_SYNC);
    }
}
