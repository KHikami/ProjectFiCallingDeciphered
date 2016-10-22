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
    final ArrayList<guk> a;
    private final gwi b;
    private final ArrayList<guk> c;
    private final ArrayList<gul> d;
    private volatile boolean e;
    private final AtomicInteger f;
    private boolean g;
    private final Handler h;
    private final Object i;

    public gwh(Looper looper, gwi gwi) {
        this.c = new ArrayList();
        this.a = new ArrayList();
        this.d = new ArrayList();
        this.e = false;
        this.f = new AtomicInteger(0);
        this.g = false;
        this.i = new Object();
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

    public void a(ConnectionResult connectionResult) {
        int i = 0;
        gwb.a(Looper.myLooper() == this.h.getLooper(), (Object) "onConnectionFailure must only be called on the Handler thread");
        this.h.removeMessages(1);
        synchronized (this.i) {
            ArrayList arrayList = new ArrayList(this.d);
            int i2 = this.f.get();
            arrayList = arrayList;
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                gul gul = (gul) obj;
                if (!this.e || this.f.get() != i2) {
                    return;
                } else if (this.d.contains(gul)) {
                    gul.a(connectionResult);
                }
            }
        }
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
