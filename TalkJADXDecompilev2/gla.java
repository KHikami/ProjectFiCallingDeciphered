package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class gla {
    static final long a = TimeUnit.SECONDS.toMillis(30);
    static final Handler b = new Handler(Looper.getMainLooper());
    public static final gla c = new gla();
    final List<glc> d = new ArrayList();
    final Runnable e = new glb(this);

    private gla() {
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
