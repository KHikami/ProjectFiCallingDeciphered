package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.concurrent.TimeUnit;

public final class ifa implements iez {
    volatile Handler a;
    final Runnable b = new ifd(this);
    private boolean c;
    private final idx d;
    private final idc e;
    private final iee<ied> f = new ife(this);

    ifa(Context context, idx idx, idd idd) {
        this.d = idx;
        this.d.a(new ifb(this));
        this.d.a(new ifc(this));
        this.e = idd.a(context, "UNKNOWN", null);
    }

    void a() {
        synchronized (this.d) {
            if (this.c) {
                this.e.a(this.d, 5000, TimeUnit.MILLISECONDS);
                this.d.b();
                this.c = false;
            }
        }
    }
}
