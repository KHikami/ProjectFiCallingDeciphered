import android.content.Context;
import java.util.HashMap;
import java.util.Map;

public final class ild {
    final Map<iok, ilj> a;
    final irc b;
    final ilg c;

    public ild(Context context) {
        String str;
        this.a = new HashMap();
        boolean a = icb.a(context.getContentResolver(), "babel_hangout_enable_egl14", imx.a(context, "video/x-vnd.on2.vp8", true));
        String str2 = "vclib";
        if (a) {
            str = "Using EGL14";
        } else {
            str = "Using EGL10";
        }
        itx.a(3, str2, str);
        this.b = a ? new ira() : new iqy();
        this.c = new ilg(this);
        this.c.start();
    }

    public void a() {
        this.c.c();
    }

    public void a(Runnable runnable) {
        if (this.c.d() || this.c.isInterrupted()) {
            itx.a(5, "vclib", "Tried to queue an event on a dead GlManager, ignoring.");
        } else {
            this.c.a().post(runnable);
        }
    }

    private void b(Runnable runnable) {
        if (this.c.d() || this.c.isInterrupted()) {
            itx.a(5, "vclib", "Tried to queue an event on a dead GlManager, ignoring.");
        } else {
            this.c.a().postAtFrontOfQueue(runnable);
        }
    }

    public void a(iok iok, long j) {
        if (this.c.d() || this.c.isInterrupted()) {
            itx.a(5, "vclib", "Tried to notify frame on a dead GlManager, ignoring.");
            return;
        }
        this.c.a().sendMessageDelayed(this.c.a().obtainMessage(1, iok), j);
    }

    public void a(iok iok) {
        if (this.c.d() || this.c.isInterrupted()) {
            itx.a(5, "vclib", "Tried to notify frame on a dead GlManager, ignoring.");
            return;
        }
        this.c.a().sendMessage(this.c.a().obtainMessage(1, iok));
    }

    public void b(iok iok) {
        if (iok == null) {
            throw new NullPointerException("Invalid videoSource");
        }
        a(new ile(this, iok));
    }

    public void c(iok iok) {
        if (this.c.d() || this.c.isInterrupted()) {
            itx.a(5, "vclib", "Tried to remove rendering target on a dead GlManager, ignoring.");
        } else {
            b(new ilf(this, iok));
        }
    }

    public irc b() {
        return this.b;
    }
}
