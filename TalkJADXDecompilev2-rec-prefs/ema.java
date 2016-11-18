package p000;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class ema extends emv {
    final /* synthetic */ long f11836a;
    final /* synthetic */ elk f11837b;

    ema(elk elk, String str, long j) {
        this.f11837b = elk;
        this.f11836a = j;
        super(str);
    }

    public void mo811a() {
        RealTimeChatService.m9070b(this.f11837b.f11811b, this.f11836a + 1000);
    }
}
