package p000;

import com.google.android.libraries.hangouts.video.internal.CallService;
import com.google.api.client.http.ExponentialBackOffPolicy;
import java.io.IOException;

final class ilt implements ijl<maa>, Runnable {
    final /* synthetic */ ils f18005a;
    private final iiu f18006b;
    private final mav f18007c;
    private final off f18008d;
    private String f18009e;
    private ijh f18010f;

    public /* synthetic */ void mo1432b(nzf nzf) {
        m22262a((maa) nzf);
    }

    ilt(ils ils, iiu iiu, mav mav, off off) {
        this.f18005a = ils;
        this.f18006b = iiu;
        this.f18007c = mav;
        this.f18008d = off;
    }

    public void run() {
        Throwable e;
        itx.m23277a(4, "vclib", "Beginning LogData upload.");
        try {
            this.f18009e = this.f18006b.m21902a(this.f18005a.f18003a, "oauth2:https://www.googleapis.com/auth/hangouts ");
            loh loh = new loh();
            loh.f25866a = Integer.valueOf(1);
            loh.f25869d = Long.valueOf(CallService.m10301a(this.f18005a.f18003a));
            this.f18010f = this.f18005a.m22259a(this.f18009e, loh, new loe(), this.f18008d);
            nzf lzz = new lzz();
            if (this.f18007c.f27163f != null) {
                lzz.f27075a = this.f18007c.f27163f.f25158a;
            }
            lzz.f27076b = this.f18007c;
            lzz.f27076b.f27178u = Long.valueOf(System.currentTimeMillis());
            this.f18010f.mo3359a("media_sessions/log", lzz, maa.class, this, ExponentialBackOffPolicy.DEFAULT_MAX_INTERVAL_MILLIS, 1000, 5);
        } catch (IOException e2) {
            e = e2;
            itx.m23281a("vclib", "LogData upload failed to get credentials for user", e);
        } catch (gsr e3) {
            e = e3;
            itx.m23281a("vclib", "LogData upload failed to get credentials for user", e);
        }
    }

    private void m22261a() {
        itx.m23277a(4, "vclib", "LogData upload succeeded.");
        m22263b();
    }

    private void m22262a(maa maa) {
        String valueOf = String.valueOf(maa);
        itx.m23277a(5, "vclib", new StringBuilder(String.valueOf(valueOf).length() + 23).append("LogData upload failed!\n").append(valueOf).toString());
        m22263b();
    }

    private void m22263b() {
        this.f18006b.m21903b(this.f18005a.f18003a, this.f18009e);
        this.f18010f.mo3357a();
    }
}
