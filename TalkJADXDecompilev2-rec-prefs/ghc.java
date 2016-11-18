package p000;

import android.content.Context;
import android.os.Handler;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class ghc extends fip {
    private ghe f15268a;
    private final int f15269b;
    private int f15270c = -1;
    private final Handler f15271d = new Handler();
    private final Runnable f15272e = new ghd(this);

    public ghc(int i, ghe ghe) {
        this.f15269b = i;
        this.f15268a = ghe;
    }

    public void m17693a(Context context) {
        fme a = ((fmf) jyn.m25426a(context, fmf.class)).mo2035a();
        this.f15270c = a.m15674a();
        RealTimeChatService.m9078b(a, this.f15269b);
        if (this.f15270c == -1) {
            m17694a(false);
            return;
        }
        this.f15271d.postDelayed(this.f15272e, (long) gwb.m1492a(context, "babel_wifi_call_get_voice_account_info_request_timeout", 20000));
        RealTimeChatService.m9040a((fip) this);
    }

    public void m17695d() {
        this.f15268a = null;
        m17694a(false);
    }

    void m17694a(boolean z) {
        RealTimeChatService.m9077b((fip) this);
        this.f15271d.removeCallbacks(this.f15272e);
        if (this.f15268a == null) {
            return;
        }
        if (z) {
            this.f15268a.m17696a();
        } else {
            this.f15268a.m17697b();
        }
    }

    public void mo610a(int i, bko bko, fiu fiu) {
        boolean z = true;
        if (this.f15270c == i) {
            if (fiu.m15392c().f5801c.f12529b != 1) {
                z = false;
            }
            m17694a(z);
        }
    }

    public void mo640a(int i, bko bko, fok fok, fdo fdo) {
        if (this.f15270c == i) {
            m17694a(false);
        }
    }
}
