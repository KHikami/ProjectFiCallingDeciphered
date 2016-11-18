package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

final class bia implements ServiceConnection {
    final /* synthetic */ bhz f3417a;

    bia(bhz bhz) {
        this.f3417a = bhz;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        gwb.aJ();
        if (iBinder instanceof bio) {
            this.f3417a.f3408b = ((bio) iBinder).m5305a();
            synchronized (this.f3417a) {
                this.f3417a.m5290a(this.f3417a.f3409c);
                this.f3417a.f3409c.clear();
                this.f3417a.m5290a(this.f3417a.f3410d);
                this.f3417a.f3410d.clear();
                if (this.f3417a.f3411e != null) {
                    new Object[1][0] = Integer.valueOf(this.f3417a.f3411e.size());
                    for (bhc a : this.f3417a.f3411e) {
                        this.f3417a.f3408b.m8229a(a);
                    }
                    this.f3417a.f3411e = null;
                }
                this.f3417a.f3407a.open();
            }
            return;
        }
        glk.m17982e("Babel_ConcService", "iBinder is not an instance of ConcurrentService.LocalBinder.", new Object[0]);
        String valueOf = String.valueOf(iBinder);
        glk.m17982e("Babel_ConcService", new StringBuilder(String.valueOf(valueOf).length() + 11).append("iBinder is ").append(valueOf).toString(), new Object[0]);
    }

    public void onServiceDisconnected(ComponentName componentName) {
        gwb.aJ();
        synchronized (this.f3417a) {
            this.f3417a.f3407a.close();
            this.f3417a.f3408b = null;
        }
    }
}
