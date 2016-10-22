import android.content.Context;
import android.os.Handler;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class ghc extends fip {
    private ghe a;
    private final int b;
    private int c;
    private final Handler d;
    private final Runnable e;

    public ghc(int i, ghe ghe) {
        this.c = -1;
        this.d = new Handler();
        this.e = new ghd(this);
        this.b = i;
        this.a = ghe;
    }

    public void a(Context context) {
        fme a = ((fmf) jyn.a(context, fmf.class)).a();
        this.c = a.a();
        RealTimeChatService.b(a, this.b);
        if (this.c == -1) {
            a(false);
            return;
        }
        this.d.postDelayed(this.e, (long) gwb.a(context, "babel_wifi_call_get_voice_account_info_request_timeout", 20000));
        RealTimeChatService.a((fip) this);
    }

    public void d() {
        this.a = null;
        a(false);
    }

    void a(boolean z) {
        RealTimeChatService.b((fip) this);
        this.d.removeCallbacks(this.e);
        if (this.a == null) {
            return;
        }
        if (z) {
            this.a.a();
        } else {
            this.a.b();
        }
    }

    public void a(int i, bko bko, fiu fiu) {
        boolean z = true;
        if (this.c == i) {
            if (fiu.c().c.b != 1) {
                z = false;
            }
            a(z);
        }
    }

    public void a(int i, bko bko, fok fok, fdo fdo) {
        if (this.c == i) {
            a(false);
        }
    }
}
