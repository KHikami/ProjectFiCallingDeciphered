package defpackage;

import android.content.Intent;

final class jdu implements Runnable {
    final /* synthetic */ jdv a;
    final /* synthetic */ Intent b;
    final /* synthetic */ jds c;

    jdu(jds jds, jdv jdv, Intent intent) {
        this.c = jds;
        this.a = jdv;
        this.b = intent;
    }

    public void run() {
        if (this.a.isAdded()) {
            ((jek) jyn.a(this.a.getActivity(), this.a).a(jek.class)).a(gwb.yo, this.b);
        }
    }
}
