package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

public final class bwo implements jza, kco, kcp, kcq {
    static final long a = TimeUnit.SECONDS.toMillis(1);
    static final long b = TimeUnit.SECONDS.toMillis(2);
    private static final long e = TimeUnit.SECONDS.toMillis(30);
    volatile long c;
    final Runnable d;
    private Timer f;
    private bkf g;
    private final bkg h = new bwp(this);

    public bwo(buc buc) {
        this.d = new bwq(this, buc);
    }

    public void a(Context context, jyn jyn, Bundle bundle) {
        this.g = ((cgr) jyn.a(cgr.class)).k();
    }

    public void z_() {
        this.f = new Timer("ViewHolderRefresher");
        this.f.scheduleAtFixedRate(new bwr(this), e, e);
        this.g.a(this.h);
    }

    public void A_() {
        this.f.cancel();
        this.f = null;
        this.g.b(this.h);
    }
}
