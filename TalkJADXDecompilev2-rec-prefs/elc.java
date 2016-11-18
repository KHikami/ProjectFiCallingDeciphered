package p000;

import android.content.Context;
import com.google.android.apps.hangouts.phone.DebugActivity;

public final class elc implements Runnable {
    final /* synthetic */ Context f11796a;

    public elc(Context context) {
        this.f11796a = context;
    }

    public void run() {
        iil.m21876b();
        try {
            bko b = fde.m15007b(this.f11796a);
            if (b != null && bkq.m5659a(this.f11796a, b.m5638g(), "DEBUG_RTCS", 0) > 0) {
                this.f11796a.startService(DebugActivity.m8910a(this.f11796a));
            }
        } catch (Throwable e) {
            glk.m17975b("BabelDebugActivity", "account not found starting debug activity", e);
        }
    }
}
