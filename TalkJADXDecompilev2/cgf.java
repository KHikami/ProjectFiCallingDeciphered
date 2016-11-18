package defpackage;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class cgf implements Runnable {
    final /* synthetic */ cge a;

    cgf(cge cge) {
        this.a = cge;
    }

    public void run() {
        bpd a = this.a.a.i.a();
        if (a.a != null) {
            RealTimeChatService.b(((fmf) this.a.a.binder.a(fmf.class)).a(-1), this.a.a.av.g(), a.a);
        }
        if (this.a.a.av != null) {
            if (fdq.d.b(this.a.a.av.g())) {
                this.a.a.ba.postDelayed(this, cdr.d);
            }
        }
    }
}
