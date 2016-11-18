package p000;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class cgf implements Runnable {
    final /* synthetic */ cge f5241a;

    cgf(cge cge) {
        this.f5241a = cge;
    }

    public void run() {
        bpd a = this.f5241a.f5240a.f5106i.mo931a();
        if (a.f4146a != null) {
            RealTimeChatService.m9082b(((fmf) this.f5241a.f5240a.binder.m25443a(fmf.class)).mo2036a(-1), this.f5241a.f5240a.av.m5638g(), a.f4146a);
        }
        if (this.f5241a.f5240a.av != null) {
            if (fdq.f12788d.m14370b(this.f5241a.f5240a.av.m5638g())) {
                this.f5241a.f5240a.ba.postDelayed(this, cdr.f5100d);
            }
        }
    }
}
