package defpackage;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

/* renamed from: emb */
final class emb extends emv {
    final /* synthetic */ long a;
    final /* synthetic */ elk b;

    emb(elk elk, String str, long j) {
        this.b = elk;
        this.a = j;
        super(str);
    }

    public void a() {
        RealTimeChatService.b(this.b.b, this.a + 1000);
    }
}
