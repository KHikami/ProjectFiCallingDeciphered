package defpackage;

import android.content.Context;

/* renamed from: eog */
final class eog implements Runnable {
    final /* synthetic */ Context a;
    final /* synthetic */ eod b;

    eog(eod eod, Context context) {
        this.b = eod;
        this.a = context;
    }

    public void run() {
        this.b.b = (dex) jyn.a(this.a, dex.class);
        fqo.a(this.a);
        gwb.w(this.a);
    }
}
