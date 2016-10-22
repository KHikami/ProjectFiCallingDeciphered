package defpackage;

import android.content.Context;
import com.google.android.apps.hangouts.phone.DebugActivity;

/* renamed from: elc */
public final class elc implements Runnable {
    final /* synthetic */ Context a;

    public elc(Context context) {
        this.a = context;
    }

    public void run() {
        iil.b();
        try {
            bko b = fde.b(this.a);
            if (b != null && bkq.a(this.a, b.g(), "DEBUG_RTCS", 0) > 0) {
                this.a.startService(DebugActivity.a(this.a));
            }
        } catch (Throwable e) {
            glk.b("BabelDebugActivity", "account not found starting debug activity", e);
        }
    }
}
