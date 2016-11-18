package defpackage;

import android.os.Handler;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class gei extends fip {
    final gca a;
    private gek b;
    private final int c;
    private final String d;
    private final String e;
    private String f;
    private int g;
    private final Handler h = new Handler();
    private final Runnable i = new gej(this);

    public gei(int i, String str, String str2, gek gek, gca gca) {
        this.c = i;
        this.d = str;
        this.e = str2;
        this.b = gek;
        this.a = gca;
    }

    public void d() {
        this.a.a(201);
        fme a = ((fmf) jyn.a(gwb.H(), fmf.class)).a();
        this.g = a.a();
        RealTimeChatService.a(a, this.c, this.d, this.e);
        if (this.g == -1) {
            glk.c("Babel_telephony", "TeleProxyNumberHelper, invalid response.", new Object[0]);
            a(false);
            return;
        }
        this.h.postDelayed(this.i, (long) gwb.a(gwb.H(), "babel_wifi_call_get_proxy_number_request_timeout", 5000));
        RealTimeChatService.a((fip) this);
    }

    public void e() {
        glk.c("Babel_telephony", "TeleProxyNumberHelper, request cancelled.", new Object[0]);
        this.b = null;
        a(false);
    }

    void a(boolean z) {
        if (!z) {
            RealTimeChatService.b((fip) this);
            this.g = -1;
        }
        this.h.removeCallbacks(this.i);
        if (this.b == null) {
            return;
        }
        if (this.f != null) {
            this.b.a(this.f);
        } else {
            this.b.a();
        }
    }

    public void a(int i, bko bko, fiu fiu) {
        if (this.g != -1 && this.g == i) {
            this.a.a(202);
            evz c = fiu.c();
            if (c.c.b == 1) {
                etz k = ((eww) c).k();
                if (k != null) {
                    this.f = k.a();
                }
            }
            a(false);
        }
    }

    public void a(int i, bko bko, fok fok, fdo fdo) {
        if (this.g != -1 && this.g == i) {
            this.a.a(203);
            String valueOf = String.valueOf(fdo);
            glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 50).append("TeleProxyNumberHelper, internal error, exception: ").append(valueOf).toString(), new Object[0]);
            a(false);
        }
    }
}
