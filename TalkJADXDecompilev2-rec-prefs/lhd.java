package p000;

import android.os.Looper;
import java.util.Set;

public final class lhd {
    final Set<C0000a> f24996a;

    lhd(Set<C0000a> set) {
        this.f24996a = set;
    }

    public void m29063a() {
        if (!this.f24996a.isEmpty()) {
            Thread thread = Looper.getMainLooper().getThread();
            thread.setUncaughtExceptionHandler(new lhe(this, thread.getUncaughtExceptionHandler()));
        }
    }
}
