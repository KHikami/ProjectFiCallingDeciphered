package p000;

import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public final class gwh implements Callback {
    final ArrayList<guk> f16284a = new ArrayList();
    private final gwi f16285b;
    private final ArrayList<guk> f16286c = new ArrayList();
    private final ArrayList<gul> f16287d = new ArrayList();
    private volatile boolean f16288e = false;
    private final AtomicInteger f16289f = new AtomicInteger(0);
    private boolean f16290g = false;
    private final Handler f16291h;
    private final Object f16292i = new Object();

    public gwh(Looper looper, gwi gwi) {
        this.f16285b = gwi;
        this.f16291h = new Handler(looper, this);
    }

    public void m18768a() {
        this.f16288e = false;
        this.f16289f.incrementAndGet();
    }

    public void m18769a(int i) {
        int i2 = 0;
        gwb.m1886a(Looper.myLooper() == this.f16291h.getLooper(), (Object) "onUnintentionalDisconnection must only be called on the Handler thread");
        this.f16291h.removeMessages(1);
        synchronized (this.f16292i) {
            this.f16290g = true;
            ArrayList arrayList = new ArrayList(this.f16286c);
            int i3 = this.f16289f.get();
            arrayList = arrayList;
            int size = arrayList.size();
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                guk guk = (guk) obj;
                if (this.f16288e && this.f16289f.get() == i3) {
                    if (this.f16286c.contains(guk)) {
                        guk.mo1150a(i);
                    }
                }
            }
            this.f16284a.clear();
            this.f16290g = false;
        }
    }

    public void m18770a(Bundle bundle) {
        boolean z = true;
        int i = 0;
        gwb.m1886a(Looper.myLooper() == this.f16291h.getLooper(), (Object) "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.f16292i) {
            gwb.m1885a(!this.f16290g);
            this.f16291h.removeMessages(1);
            this.f16290g = true;
            if (this.f16284a.size() != 0) {
                z = false;
            }
            gwb.m1885a(z);
            ArrayList arrayList = new ArrayList(this.f16286c);
            int i2 = this.f16289f.get();
            arrayList = arrayList;
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                guk guk = (guk) obj;
                if (this.f16288e && this.f16285b.mo2526b() && this.f16289f.get() == i2) {
                    if (!this.f16284a.contains(guk)) {
                        guk.a_(bundle);
                    }
                }
            }
            this.f16284a.clear();
            this.f16290g = false;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m18771a(ConnectionResult connectionResult) {
        int i = 0;
        gwb.m1886a(Looper.myLooper() == this.f16291h.getLooper(), (Object) "onConnectionFailure must only be called on the Handler thread");
        this.f16291h.removeMessages(1);
        synchronized (this.f16292i) {
            ArrayList arrayList = new ArrayList(this.f16287d);
            int i2 = this.f16289f.get();
            arrayList = arrayList;
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                gul gul = (gul) obj;
                if (!this.f16288e || this.f16289f.get() != i2) {
                } else if (this.f16287d.contains(gul)) {
                    gul.mo1151a(connectionResult);
                }
            }
        }
    }

    public void m18772a(guk guk) {
        gwb.m1419L((Object) guk);
        synchronized (this.f16292i) {
            if (this.f16286c.contains(guk)) {
                String valueOf = String.valueOf(guk);
                new StringBuilder(String.valueOf(valueOf).length() + 62).append("registerConnectionCallbacks(): listener ").append(valueOf).append(" is already registered");
            } else {
                this.f16286c.add(guk);
            }
        }
        if (this.f16285b.mo2526b()) {
            this.f16291h.sendMessage(this.f16291h.obtainMessage(1, guk));
        }
    }

    public void m18773a(gul gul) {
        gwb.m1419L((Object) gul);
        synchronized (this.f16292i) {
            if (this.f16287d.contains(gul)) {
                String valueOf = String.valueOf(gul);
                new StringBuilder(String.valueOf(valueOf).length() + 67).append("registerConnectionFailedListener(): listener ").append(valueOf).append(" is already registered");
            } else {
                this.f16287d.add(gul);
            }
        }
    }

    public void m18774b() {
        this.f16288e = true;
    }

    public void m18775b(guk guk) {
        gwb.m1419L((Object) guk);
        synchronized (this.f16292i) {
            if (!this.f16286c.remove(guk)) {
                String valueOf = String.valueOf(guk);
                new StringBuilder(String.valueOf(valueOf).length() + 52).append("unregisterConnectionCallbacks(): listener ").append(valueOf).append(" not found");
            } else if (this.f16290g) {
                this.f16284a.add(guk);
            }
        }
    }

    public void m18776b(gul gul) {
        gwb.m1419L((Object) gul);
        synchronized (this.f16292i) {
            if (!this.f16287d.remove(gul)) {
                String valueOf = String.valueOf(gul);
                new StringBuilder(String.valueOf(valueOf).length() + 57).append("unregisterConnectionFailedListener(): listener ").append(valueOf).append(" not found");
            }
        }
    }

    public boolean handleMessage(Message message) {
        if (message.what == 1) {
            guk guk = (guk) message.obj;
            synchronized (this.f16292i) {
                if (this.f16288e && this.f16285b.mo2526b() && this.f16286c.contains(guk)) {
                    guk.a_(null);
                }
            }
            return true;
        }
        Log.wtf("GmsClientEvents", "Don't know how to handle message: " + message.what, new Exception());
        return false;
    }
}
