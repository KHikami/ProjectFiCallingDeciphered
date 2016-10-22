package defpackage;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

/* renamed from: emd */
final class emd extends emv {
    final /* synthetic */ elk a;

    emd(elk elk, String str) {
        this.a = elk;
        super(str);
    }

    public void a() {
        RealTimeChatService.a(this.a.a, "android.intent.action.PACKAGE_REPLACED");
    }
}
