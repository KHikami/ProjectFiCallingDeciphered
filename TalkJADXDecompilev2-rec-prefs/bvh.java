package p000;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class bvh implements Runnable {
    final /* synthetic */ bvf f4583a;

    bvh(bvf bvf) {
        this.f4583a = bvf;
    }

    public void run() {
        RealTimeChatService.m9021a(this.f4583a.m6593b(), this.f4583a.f4577d, this.f4583a.f4578e);
    }
}
