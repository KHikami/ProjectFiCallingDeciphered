package defpackage;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

/* renamed from: emh */
final class emh extends emv {
    final /* synthetic */ elk a;

    emh(elk elk, String str) {
        this.a = elk;
        super(str);
    }

    public void a() {
        RealTimeChatService.a(this.a.c, false, fjl.NO_DELAY, flt.FORCE_SYNC);
    }
}
