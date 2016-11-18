package p000;

import android.content.Context;
import android.os.Bundle;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

public final class bwo implements jza, kco, kcp, kcq {
    static final long f4661a = TimeUnit.SECONDS.toMillis(1);
    static final long f4662b = TimeUnit.SECONDS.toMillis(2);
    private static final long f4663e = TimeUnit.SECONDS.toMillis(30);
    volatile long f4664c;
    final Runnable f4665d;
    private Timer f4666f;
    private bkf f4667g;
    private final bkg f4668h = new bwp(this);

    public bwo(buc buc) {
        this.f4665d = new bwq(this, buc);
    }

    public void mo479a(Context context, jyn jyn, Bundle bundle) {
        this.f4667g = ((cgr) jyn.m25443a(cgr.class)).mo954k();
    }

    public void z_() {
        this.f4666f = new Timer("ViewHolderRefresher");
        this.f4666f.scheduleAtFixedRate(new bwr(this), f4663e, f4663e);
        this.f4667g.m5587a(this.f4668h);
    }

    public void A_() {
        this.f4666f.cancel();
        this.f4666f = null;
        this.f4667g.m5591b(this.f4668h);
    }
}
