package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public final class gwh implements Callback {
    final ArrayList<guk> a = new ArrayList();
    private final gwi b;
    private final ArrayList<guk> c = new ArrayList();
    private final ArrayList<gul> d = new ArrayList();
    private volatile boolean e = false;
    private final AtomicInteger f = new AtomicInteger(0);
    private boolean g = false;
    private final Handler h;
    private final Object i = new Object();

    public gwh(Looper looper, gwi gwi) {
        this.b = gwi;
        this.h = new Handler(looper, this);
    }

    public void a() {
        this.e = false;
        this.f.incrementAndGet();
    }

    public void a(int i) {
        int i2 = 0;
        gwb.a(Looper.myLooper() == this.h.getLooper(), (Object) "onUnintentionalDisconnection must only be called on the Handler thread");
        this.h.removeMessages(1);
        synchronized (this.i) {
            this.g = true;
            ArrayList arrayList = new ArrayList(this.c);
            int i3 = this.f.get();
            arrayList = arrayList;
            int size = arrayList.size();
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                guk guk = (guk) obj;
                if (this.e && this.f.get() == i3) {
                    if (this.c.contains(guk)) {
                        guk.a(i);
                    }
                }
            }
            this.a.clear();
            this.g = false;
        }
    }

    public void a(Bundle bundle) {
        boolean z = true;
        int i = 0;
        gwb.a(Looper.myLooper() == this.h.getLooper(), (Object) "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.i) {
            gwb.a(!this.g);
            this.h.removeMessages(1);
            this.g = true;
            if (this.a.size() != 0) {
                z = false;
            }
            gwb.a(z);
            ArrayList arrayList = new ArrayList(this.c);
            int i2 = this.f.get();
            arrayList = arrayList;
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                guk guk = (guk) obj;
                if (this.e && this.b.b() && this.f.get() == i2) {
                    if (!this.a.contains(guk)) {
                        guk.a_(bundle);
                    }
                }
            }
            this.a.clear();
            this.g = false;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.google.android.gms.common.ConnectionResult r8) {
        /*
        r7 = this;
        r1 = 1;
        r2 = 0;
        r0 = android.os.Looper.myLooper();
        r3 = r7.h;
        r3 = r3.getLooper();
        if (r0 != r3) goto L_0x0047;
    L_0x000e:
        r0 = r1;
    L_0x000f:
        r3 = "onConnectionFailure must only be called on the Handler thread";
        defpackage.gwb.a(r0, r3);
        r0 = r7.h;
        r0.removeMessages(r1);
        r3 = r7.i;
        monitor-enter(r3);
        r0 = new java.util.ArrayList;	 Catch:{ all -> 0x0055 }
        r1 = r7.d;	 Catch:{ all -> 0x0055 }
        r0.<init>(r1);	 Catch:{ all -> 0x0055 }
        r1 = r7.f;	 Catch:{ all -> 0x0055 }
        r4 = r1.get();	 Catch:{ all -> 0x0055 }
        r0 = (java.util.ArrayList) r0;	 Catch:{ all -> 0x0055 }
        r5 = r0.size();	 Catch:{ all -> 0x0055 }
    L_0x002f:
        if (r2 >= r5) goto L_0x0058;
    L_0x0031:
        r1 = r0.get(r2);	 Catch:{ all -> 0x0055 }
        r2 = r2 + 1;
        r1 = (defpackage.gul) r1;	 Catch:{ all -> 0x0055 }
        r6 = r7.e;	 Catch:{ all -> 0x0055 }
        if (r6 == 0) goto L_0x0045;
    L_0x003d:
        r6 = r7.f;	 Catch:{ all -> 0x0055 }
        r6 = r6.get();	 Catch:{ all -> 0x0055 }
        if (r6 == r4) goto L_0x0049;
    L_0x0045:
        monitor-exit(r3);	 Catch:{ all -> 0x0055 }
    L_0x0046:
        return;
    L_0x0047:
        r0 = r2;
        goto L_0x000f;
    L_0x0049:
        r6 = r7.d;	 Catch:{ all -> 0x0055 }
        r6 = r6.contains(r1);	 Catch:{ all -> 0x0055 }
        if (r6 == 0) goto L_0x002f;
    L_0x0051:
        r1.a(r8);	 Catch:{ all -> 0x0055 }
        goto L_0x002f;
    L_0x0055:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0055 }
        throw r0;
    L_0x0058:
        monitor-exit(r3);	 Catch:{ all -> 0x0055 }
        goto L_0x0046;
        */
        throw new UnsupportedOperationException("Method not decompiled: gwh.a(com.google.android.gms.common.ConnectionResult):void");
    }

    public void a(guk guk) {
        gwb.L((Object) guk);
        synchronized (this.i) {
            if (this.c.contains(guk)) {
                String valueOf = String.valueOf(guk);
                new StringBuilder(String.valueOf(valueOf).length() + 62).append("registerConnectionCallbacks(): listener ").append(valueOf).append(" is already registered");
            } else {
                this.c.add(guk);
            }
        }
        if (this.b.b()) {
            this.h.sendMessage(this.h.obtainMessage(1, guk));
        }
    }

    public void a(gul gul) {
        gwb.L((Object) gul);
        synchronized (this.i) {
            if (this.d.contains(gul)) {
                String valueOf = String.valueOf(gul);
                new StringBuilder(String.valueOf(valueOf).length() + 67).append("registerConnectionFailedListener(): listener ").append(valueOf).append(" is already registered");
            } else {
                this.d.add(gul);
            }
        }
    }

    public void b() {
        this.e = true;
    }

    public void b(guk guk) {
        gwb.L((Object) guk);
        synchronized (this.i) {
            if (!this.c.remove(guk)) {
                String valueOf = String.valueOf(guk);
                new StringBuilder(String.valueOf(valueOf).length() + 52).append("unregisterConnectionCallbacks(): listener ").append(valueOf).append(" not found");
            } else if (this.g) {
                this.a.add(guk);
            }
        }
    }

    public void b(gul gul) {
        gwb.L((Object) gul);
        synchronized (this.i) {
            if (!this.d.remove(gul)) {
                String valueOf = String.valueOf(gul);
                new StringBuilder(String.valueOf(valueOf).length() + 57).append("unregisterConnectionFailedListener(): listener ").append(valueOf).append(" not found");
            }
        }
    }

    public boolean handleMessage(Message message) {
        if (message.what == 1) {
            guk guk = (guk) message.obj;
            synchronized (this.i) {
                if (this.e && this.b.b() && this.c.contains(guk)) {
                    guk.a_(null);
                }
            }
            return true;
        }
        Log.wtf("GmsClientEvents", "Don't know how to handle message: " + message.what, new Exception());
        return false;
    }
}
