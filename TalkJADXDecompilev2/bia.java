package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

final class bia implements ServiceConnection {
    final /* synthetic */ bhz a;

    bia(bhz bhz) {
        this.a = bhz;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        gwb.aJ();
        if (iBinder instanceof bio) {
            this.a.b = ((bio) iBinder).a();
            synchronized (this.a) {
                this.a.a(this.a.c);
                this.a.c.clear();
                this.a.a(this.a.d);
                this.a.d.clear();
                if (this.a.e != null) {
                    new Object[1][0] = Integer.valueOf(this.a.e.size());
                    for (bhc a : this.a.e) {
                        this.a.b.a(a);
                    }
                    this.a.e = null;
                }
                this.a.a.open();
            }
            return;
        }
        glk.e("Babel_ConcService", "iBinder is not an instance of ConcurrentService.LocalBinder.", new Object[0]);
        String valueOf = String.valueOf(iBinder);
        glk.e("Babel_ConcService", new StringBuilder(String.valueOf(valueOf).length() + 11).append("iBinder is ").append(valueOf).toString(), new Object[0]);
    }

    public void onServiceDisconnected(ComponentName componentName) {
        gwb.aJ();
        synchronized (this.a) {
            this.a.a.close();
            this.a.b = null;
        }
    }
}
