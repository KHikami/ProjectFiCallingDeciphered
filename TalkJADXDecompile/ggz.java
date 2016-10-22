import android.content.Context;
import android.os.Handler;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class ggz extends fip {
    private final Context a;
    private ghb b;
    private final int c;
    private int d;
    private final Handler e;
    private final Runnable f;

    public ggz(Context context, int i, ghb ghb) {
        this.d = -1;
        this.e = new Handler();
        this.f = new gha(this);
        this.a = context;
        this.c = i;
        this.b = ghb;
    }

    public void d() {
        fme a = ((fmf) jyn.a(this.a, fmf.class)).a();
        this.d = a.a();
        RealTimeChatService.c(a, this.c);
        if (this.d == -1) {
            a(false);
            return;
        }
        this.e.postDelayed(this.f, (long) gwb.a(this.a, "babel_wifi_call_enable_voice_calling_request_timeout", 20000));
        RealTimeChatService.a((fip) this);
    }

    public void e() {
        this.b = null;
        a(false);
    }

    void a(boolean z) {
        RealTimeChatService.b((fip) this);
        this.e.removeCallbacks(this.f);
        if (this.b == null) {
            return;
        }
        if (z) {
            this.b.a();
        } else {
            this.b.b();
        }
    }

    public void a(int i, bko bko, fiu fiu) {
        boolean z = true;
        if (this.d == i) {
            if (fiu.c().c.b != 1) {
                z = false;
            }
            a(z);
        }
    }

    public void a(int i, bko bko, fok fok, fdo fdo) {
        if (this.d == i) {
            a(false);
        }
    }
}
