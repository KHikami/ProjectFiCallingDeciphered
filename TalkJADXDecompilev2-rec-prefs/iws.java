package p000;

import android.content.Context;

final class iws implements Runnable {
    final /* synthetic */ Context f19290a;
    final /* synthetic */ iwr f19291b;

    iws(iwr iwr, Context context) {
        this.f19291b = iwr;
        this.f19290a = context;
    }

    public void run() {
        if (this.f19291b.f19289a.f19284g.compareAndSet(true, false)) {
            this.f19290a.unregisterReceiver(this.f19291b);
            this.f19291b.f19289a.f19283f.set(gwb.az());
            this.f19291b.f19289a.f19280c.m23586a(gwb.ab(this.f19290a));
        }
    }
}
