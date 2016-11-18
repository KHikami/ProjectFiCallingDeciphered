package p000;

import android.os.Handler;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class gei extends fip {
    final gca f14853a;
    private gek f14854b;
    private final int f14855c;
    private final String f14856d;
    private final String f14857e;
    private String f14858f;
    private int f14859g;
    private final Handler f14860h = new Handler();
    private final Runnable f14861i = new gej(this);

    public gei(int i, String str, String str2, gek gek, gca gca) {
        this.f14855c = i;
        this.f14856d = str;
        this.f14857e = str2;
        this.f14854b = gek;
        this.f14853a = gca;
    }

    public void m17165d() {
        this.f14853a.mo1403a(201);
        fme a = ((fmf) jyn.m25426a(gwb.m1400H(), fmf.class)).mo2035a();
        this.f14859g = a.m15674a();
        RealTimeChatService.m9046a(a, this.f14855c, this.f14856d, this.f14857e);
        if (this.f14859g == -1) {
            glk.m17979c("Babel_telephony", "TeleProxyNumberHelper, invalid response.", new Object[0]);
            m17164a(false);
            return;
        }
        this.f14860h.postDelayed(this.f14861i, (long) gwb.m1492a(gwb.m1400H(), "babel_wifi_call_get_proxy_number_request_timeout", 5000));
        RealTimeChatService.m9040a((fip) this);
    }

    public void m17166e() {
        glk.m17979c("Babel_telephony", "TeleProxyNumberHelper, request cancelled.", new Object[0]);
        this.f14854b = null;
        m17164a(false);
    }

    void m17164a(boolean z) {
        if (!z) {
            RealTimeChatService.m9077b((fip) this);
            this.f14859g = -1;
        }
        this.f14860h.removeCallbacks(this.f14861i);
        if (this.f14854b == null) {
            return;
        }
        if (this.f14858f != null) {
            this.f14854b.mo2240a(this.f14858f);
        } else {
            this.f14854b.mo2237a();
        }
    }

    public void mo610a(int i, bko bko, fiu fiu) {
        if (this.f14859g != -1 && this.f14859g == i) {
            this.f14853a.mo1403a(202);
            evz c = fiu.m15392c();
            if (c.f5801c.f12529b == 1) {
                etz k = ((eww) c).m14731k();
                if (k != null) {
                    this.f14858f = k.m14527a();
                }
            }
            m17164a(false);
        }
    }

    public void mo640a(int i, bko bko, fok fok, fdo fdo) {
        if (this.f14859g != -1 && this.f14859g == i) {
            this.f14853a.mo1403a(203);
            String valueOf = String.valueOf(fdo);
            glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 50).append("TeleProxyNumberHelper, internal error, exception: ").append(valueOf).toString(), new Object[0]);
            m17164a(false);
        }
    }
}
