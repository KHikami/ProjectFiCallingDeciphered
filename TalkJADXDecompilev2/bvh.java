package defpackage;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class bvh implements Runnable {
    final /* synthetic */ bvf a;

    bvh(bvf bvf) {
        this.a = bvf;
    }

    public void run() {
        RealTimeChatService.a(this.a.b(), this.a.d, this.a.e);
    }
}
