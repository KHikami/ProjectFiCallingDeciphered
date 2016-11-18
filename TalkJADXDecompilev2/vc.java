package defpackage;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

final class vc {
    wc a;
    boolean b;
    BroadcastReceiver c;
    IntentFilter d;
    final /* synthetic */ va e;

    vc(va vaVar, wc wcVar) {
        this.e = vaVar;
        this.a = wcVar;
        this.b = wcVar.a();
    }

    final void a() {
        if (this.c != null) {
            this.e.c.unregisterReceiver(this.c);
            this.c = null;
        }
    }
}
