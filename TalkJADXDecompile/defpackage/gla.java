package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: gla */
public final class gla {
    static final long a;
    static final Handler b;
    public static final gla c;
    final List<glc> d;
    final Runnable e;

    static {
        a = TimeUnit.SECONDS.toMillis(30);
        b = new Handler(Looper.getMainLooper());
        c = new gla();
    }

    private gla() {
        this.d = new ArrayList();
        this.e = new glb(this);
    }

    public void a(glc glc) {
        this.d.add(glc);
        if (this.d.size() == 1) {
            b.postDelayed(this.e, a);
        }
    }

    public void b(glc glc) {
        this.d.remove(glc);
        if (this.d.isEmpty()) {
            b.removeCallbacks(this.e);
        }
    }
}
