package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class gla {
    static final long f15530a = TimeUnit.SECONDS.toMillis(30);
    static final Handler f15531b = new Handler(Looper.getMainLooper());
    public static final gla f15532c = new gla();
    final List<glc> f15533d = new ArrayList();
    final Runnable f15534e = new glb(this);

    private gla() {
    }

    public void m17917a(glc glc) {
        this.f15533d.add(glc);
        if (this.f15533d.size() == 1) {
            f15531b.postDelayed(this.f15534e, f15530a);
        }
    }

    public void m17918b(glc glc) {
        this.f15533d.remove(glc);
        if (this.f15533d.isEmpty()) {
            f15531b.removeCallbacks(this.f15534e);
        }
    }
}
