package defpackage;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class fhr implements Runnable {
    final /* synthetic */ fhq a;

    fhr(fhq fhq) {
        this.a = fhq;
    }

    public void run() {
        RealTimeChatService.a();
    }
}
