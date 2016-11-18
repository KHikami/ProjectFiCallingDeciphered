package p000;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

final class vc {
    wc f35361a;
    boolean f35362b;
    BroadcastReceiver f35363c;
    IntentFilter f35364d;
    final /* synthetic */ va f35365e;

    vc(va vaVar, wc wcVar) {
        this.f35365e = vaVar;
        this.f35361a = wcVar;
        this.f35362b = wcVar.m41106a();
    }

    final void m41031a() {
        if (this.f35363c != null) {
            this.f35365e.c.unregisterReceiver(this.f35363c);
            this.f35363c = null;
        }
    }
}
