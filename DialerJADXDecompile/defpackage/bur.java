package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: bur */
public final class bur implements Callback {
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;
    public volatile boolean d;
    public boolean e;
    public final Object f;
    private final bus g;
    private final AtomicInteger h;
    private final Handler i;

    public bur(Looper looper, bus bus) {
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = false;
        this.h = new AtomicInteger(0);
        this.e = false;
        this.f = new Object();
        this.g = bus;
        this.i = new Handler(looper, this);
    }

    public final void a() {
        this.d = false;
        this.h.incrementAndGet();
    }

    public final void a(int i) {
        boolean z = false;
        if (Looper.myLooper() == this.i.getLooper()) {
            z = true;
        }
        buf.a(z, (Object) "onUnintentionalDisconnection must only be called on the Handler thread");
        this.i.removeMessages(1);
        synchronized (this.f) {
            this.e = true;
            ArrayList arrayList = new ArrayList(this.a);
            int i2 = this.h.get();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                brf brf = (brf) it.next();
                if (this.d && this.h.get() == i2) {
                    if (this.a.contains(brf)) {
                        brf.a(i);
                    }
                }
            }
            this.b.clear();
            this.e = false;
        }
    }

    public final void a(Bundle bundle) {
        boolean z = true;
        buf.a(Looper.myLooper() == this.i.getLooper(), (Object) "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.f) {
            buf.a(!this.e);
            this.i.removeMessages(1);
            this.e = true;
            if (this.b.size() != 0) {
                z = false;
            }
            buf.a(z);
            ArrayList arrayList = new ArrayList(this.a);
            int i = this.h.get();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                brf brf = (brf) it.next();
                if (this.d && this.g.b() && this.h.get() == i) {
                    if (!this.b.contains(brf)) {
                        brf.a(bundle);
                    }
                }
            }
            this.b.clear();
            this.e = false;
        }
    }

    public final void a(brf brf) {
        buf.A((Object) brf);
        synchronized (this.f) {
            if (this.a.contains(brf)) {
                Log.w("GmsClientEvents", "registerConnectionCallbacks(): listener " + brf + " is already registered");
            } else {
                this.a.add(brf);
            }
        }
        if (this.g.b()) {
            this.i.sendMessage(this.i.obtainMessage(1, brf));
        }
    }

    public final void a(brg brg) {
        buf.A((Object) brg);
        synchronized (this.f) {
            if (this.c.contains(brg)) {
                Log.w("GmsClientEvents", "registerConnectionFailedListener(): listener " + brg + " is already registered");
            } else {
                this.c.add(brg);
            }
        }
    }

    public final void a(ConnectionResult connectionResult) {
        buf.a(Looper.myLooper() == this.i.getLooper(), (Object) "onConnectionFailure must only be called on the Handler thread");
        this.i.removeMessages(1);
        synchronized (this.f) {
            ArrayList arrayList = new ArrayList(this.c);
            int i = this.h.get();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                brg brg = (brg) it.next();
                if (!this.d || this.h.get() != i) {
                    return;
                } else if (this.c.contains(brg)) {
                    brg.a(connectionResult);
                }
            }
        }
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            brf brf = (brf) message.obj;
            synchronized (this.f) {
                if (this.d && this.g.b() && this.a.contains(brf)) {
                    brf.a(null);
                }
            }
            return true;
        }
        Log.wtf("GmsClientEvents", "Don't know how to handle message: " + message.what, new Exception());
        return false;
    }
}
