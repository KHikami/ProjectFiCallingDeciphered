package p000;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

public final class ild {
    final Map<iok, ilj> f17971a = new HashMap();
    final irc f17972b;
    final ilg f17973c;

    public ild(Context context) {
        String str;
        boolean a = icb.m21567a(context.getContentResolver(), "babel_hangout_enable_egl14", imx.m22318a(context, "video/x-vnd.on2.vp8", true));
        String str2 = "vclib";
        if (a) {
            str = "Using EGL14";
        } else {
            str = "Using EGL10";
        }
        itx.m23277a(3, str2, str);
        this.f17972b = a ? new ira() : new iqy();
        this.f17973c = new ilg(this);
        this.f17973c.start();
    }

    public void m22230a() {
        this.f17973c.m22239c();
    }

    public void m22233a(Runnable runnable) {
        if (this.f17973c.m22240d() || this.f17973c.isInterrupted()) {
            itx.m23277a(5, "vclib", "Tried to queue an event on a dead GlManager, ignoring.");
        } else {
            this.f17973c.m22237a().post(runnable);
        }
    }

    private void m22229b(Runnable runnable) {
        if (this.f17973c.m22240d() || this.f17973c.isInterrupted()) {
            itx.m23277a(5, "vclib", "Tried to queue an event on a dead GlManager, ignoring.");
        } else {
            this.f17973c.m22237a().postAtFrontOfQueue(runnable);
        }
    }

    public void m22232a(iok iok, long j) {
        if (this.f17973c.m22240d() || this.f17973c.isInterrupted()) {
            itx.m23277a(5, "vclib", "Tried to notify frame on a dead GlManager, ignoring.");
            return;
        }
        this.f17973c.m22237a().sendMessageDelayed(this.f17973c.m22237a().obtainMessage(1, iok), j);
    }

    public void m22231a(iok iok) {
        if (this.f17973c.m22240d() || this.f17973c.isInterrupted()) {
            itx.m23277a(5, "vclib", "Tried to notify frame on a dead GlManager, ignoring.");
            return;
        }
        this.f17973c.m22237a().sendMessage(this.f17973c.m22237a().obtainMessage(1, iok));
    }

    public void m22235b(iok iok) {
        if (iok == null) {
            throw new NullPointerException("Invalid videoSource");
        }
        m22233a(new ile(this, iok));
    }

    public void m22236c(iok iok) {
        if (this.f17973c.m22240d() || this.f17973c.isInterrupted()) {
            itx.m23277a(5, "vclib", "Tried to remove rendering target on a dead GlManager, ignoring.");
        } else {
            m22229b(new ilf(this, iok));
        }
    }

    public irc m22234b() {
        return this.f17972b;
    }
}
