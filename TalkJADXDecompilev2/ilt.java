package defpackage;

import com.google.android.libraries.hangouts.video.internal.CallService;
import com.google.api.client.http.ExponentialBackOffPolicy;
import java.io.IOException;

final class ilt implements ijl<maa>, Runnable {
    final /* synthetic */ ils a;
    private final iiu b;
    private final mav c;
    private final off d;
    private String e;
    private ijh f;

    public /* synthetic */ void b(nzf nzf) {
        a((maa) nzf);
    }

    ilt(ils ils, iiu iiu, mav mav, off off) {
        this.a = ils;
        this.b = iiu;
        this.c = mav;
        this.d = off;
    }

    public void run() {
        Throwable e;
        itx.a(4, "vclib", "Beginning LogData upload.");
        try {
            this.e = this.b.a(this.a.a, "oauth2:https://www.googleapis.com/auth/hangouts ");
            loh loh = new loh();
            loh.a = Integer.valueOf(1);
            loh.d = Long.valueOf(CallService.a(this.a.a));
            this.f = this.a.a(this.e, loh, new loe(), this.d);
            nzf lzz = new lzz();
            if (this.c.f != null) {
                lzz.a = this.c.f.a;
            }
            lzz.b = this.c;
            lzz.b.u = Long.valueOf(System.currentTimeMillis());
            this.f.a("media_sessions/log", lzz, maa.class, this, ExponentialBackOffPolicy.DEFAULT_MAX_INTERVAL_MILLIS, 1000, 5);
        } catch (IOException e2) {
            e = e2;
            itx.a("vclib", "LogData upload failed to get credentials for user", e);
        } catch (gsr e3) {
            e = e3;
            itx.a("vclib", "LogData upload failed to get credentials for user", e);
        }
    }

    private void a() {
        itx.a(4, "vclib", "LogData upload succeeded.");
        b();
    }

    private void a(maa maa) {
        String valueOf = String.valueOf(maa);
        itx.a(5, "vclib", new StringBuilder(String.valueOf(valueOf).length() + 23).append("LogData upload failed!\n").append(valueOf).toString());
        b();
    }

    private void b() {
        this.b.b(this.a.a, this.e);
        this.f.a();
    }
}
