package p000;

import android.content.Context;

final class eog implements Runnable {
    final /* synthetic */ Context f11922a;
    final /* synthetic */ eod f11923b;

    eog(eod eod, Context context) {
        this.f11923b = eod;
        this.f11922a = context;
    }

    public void run() {
        this.f11923b.f11918b = (dex) jyn.m25426a(this.f11922a, dex.class);
        fqo.m15978a(this.f11922a);
        gwb.m2378w(this.f11922a);
    }
}
