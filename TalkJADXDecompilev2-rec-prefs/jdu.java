package p000;

import android.content.Intent;

final class jdu implements Runnable {
    final /* synthetic */ jdv f19915a;
    final /* synthetic */ Intent f19916b;
    final /* synthetic */ jds f19917c;

    jdu(jds jds, jdv jdv, Intent intent) {
        this.f19917c = jds;
        this.f19915a = jdv;
        this.f19916b = intent;
    }

    public void run() {
        if (this.f19915a.isAdded()) {
            ((jek) jyn.m25429a(this.f19915a.getActivity(), this.f19915a).m25443a(jek.class)).m24035a(gwb.yo, this.f19916b);
        }
    }
}
