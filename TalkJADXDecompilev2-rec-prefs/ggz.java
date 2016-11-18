package p000;

import android.content.Context;
import android.os.Handler;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class ggz extends fip {
    private final Context f15260a;
    private ghb f15261b;
    private final int f15262c;
    private int f15263d = -1;
    private final Handler f15264e = new Handler();
    private final Runnable f15265f = new gha(this);

    public ggz(Context context, int i, ghb ghb) {
        this.f15260a = context;
        this.f15262c = i;
        this.f15261b = ghb;
    }

    public void m17686d() {
        fme a = ((fmf) jyn.m25426a(this.f15260a, fmf.class)).mo2035a();
        this.f15263d = a.m15674a();
        RealTimeChatService.m9092c(a, this.f15262c);
        if (this.f15263d == -1) {
            m17685a(false);
            return;
        }
        this.f15264e.postDelayed(this.f15265f, (long) gwb.m1492a(this.f15260a, "babel_wifi_call_enable_voice_calling_request_timeout", 20000));
        RealTimeChatService.m9040a((fip) this);
    }

    public void m17687e() {
        this.f15261b = null;
        m17685a(false);
    }

    void m17685a(boolean z) {
        RealTimeChatService.m9077b((fip) this);
        this.f15264e.removeCallbacks(this.f15265f);
        if (this.f15261b == null) {
            return;
        }
        if (z) {
            this.f15261b.m17689a();
        } else {
            this.f15261b.m17690b();
        }
    }

    public void mo610a(int i, bko bko, fiu fiu) {
        boolean z = true;
        if (this.f15263d == i) {
            if (fiu.m15392c().f5801c.f12529b != 1) {
                z = false;
            }
            m17685a(z);
        }
    }

    public void mo640a(int i, bko bko, fok fok, fdo fdo) {
        if (this.f15263d == i) {
            m17685a(false);
        }
    }
}
