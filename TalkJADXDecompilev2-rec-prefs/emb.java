package p000;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class emb extends emv {
    final /* synthetic */ long f11838a;
    final /* synthetic */ elk f11839b;

    emb(elk elk, String str, long j) {
        this.f11839b = elk;
        this.f11838a = j;
        super(str);
    }

    public void mo811a() {
        RealTimeChatService.m9070b(this.f11839b.f11811b, this.f11838a + 1000);
    }
}
