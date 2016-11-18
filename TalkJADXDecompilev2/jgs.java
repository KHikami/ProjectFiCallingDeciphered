package defpackage;

import android.os.Handler;
import android.os.Message;

final class jgs implements Runnable {
    final /* synthetic */ jgc a;
    final /* synthetic */ jgz b;
    final /* synthetic */ jgo c;

    jgs(jgo jgo, jgc jgc, jgz jgz) {
        this.c = jgo;
        this.a = jgc;
        this.b = jgz;
    }

    public void run() {
        this.c.c.a(this.a, this.b);
        if (!this.c.c.b()) {
            Handler d = this.c.c.d();
            d.removeMessages(510);
            if (this.a == this.c.d) {
                this.c.a.stopService(this.c.b);
                return;
            }
            Message obtain = Message.obtain(d, ljy.a(this.c.e));
            obtain.what = 510;
            d.sendMessageDelayed(obtain, 5000);
        }
    }
}
