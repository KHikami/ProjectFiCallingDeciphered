package p000;

import android.os.Handler;
import android.os.Message;

final class jgs implements Runnable {
    final /* synthetic */ jgc f20029a;
    final /* synthetic */ jgz f20030b;
    final /* synthetic */ jgo f20031c;

    jgs(jgo jgo, jgc jgc, jgz jgz) {
        this.f20031c = jgo;
        this.f20029a = jgc;
        this.f20030b = jgz;
    }

    public void run() {
        this.f20031c.f20022c.m24171a(this.f20029a, this.f20030b);
        if (!this.f20031c.f20022c.m24176b()) {
            Handler d = this.f20031c.f20022c.m24180d();
            d.removeMessages(510);
            if (this.f20029a == this.f20031c.f20023d) {
                this.f20031c.f20020a.stopService(this.f20031c.f20021b);
                return;
            }
            Message obtain = Message.obtain(d, ljy.m29195a(this.f20031c.f20024e));
            obtain.what = 510;
            d.sendMessageDelayed(obtain, 5000);
        }
    }
}
