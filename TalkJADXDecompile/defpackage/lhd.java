package defpackage;

import android.os.Looper;
import java.util.Set;

/* renamed from: lhd */
public final class lhd {
    final Set<a> a;

    lhd(Set<a> set) {
        this.a = set;
    }

    public void a() {
        if (!this.a.isEmpty()) {
            Thread thread = Looper.getMainLooper().getThread();
            thread.setUncaughtExceptionHandler(new lhe(this, thread.getUncaughtExceptionHandler()));
        }
    }
}
