package p000;

import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import java.lang.ref.ReferenceQueue;
import java.util.Map;
import java.util.Set;

public final class hfn implements Callback {
    static final Object f16844a = new Object();
    private static hfn f16845e;
    private long f16846b;
    private long f16847c;
    private long f16848d;
    private final Context f16849f;
    private final gtp f16850g;
    private int f16851h;
    private final SparseArray<hfq<?>> f16852i;
    private final Map<hdx<?>, hfq<?>> f16853j;
    private heo f16854k;
    private final Set<hdx<?>> f16855l;
    private final Handler f16856m;
    private final ReferenceQueue<guu<?>> f16857n;
    private final SparseArray<hfo> f16858o;
    private hfp f16859p;

    public static hfn m19653a() {
        hfn hfn;
        synchronized (f16844a) {
            hfn = f16845e;
        }
        return hfn;
    }

    private void m19654a(hea hea) {
        for (hdx hdx : hea.mo2422c()) {
            hfq hfq = (hfq) this.f16853j.get(hdx);
            if (hfq == null) {
                hea.m18982f();
                return;
            } else if (hfq.m19687f()) {
                hea.m19474a(hdx, ConnectionResult.f7256a);
            } else if (hfq.m19682b() != null) {
                hea.m19474a(hdx, hfq.m19682b());
            } else {
                hfq.m19681a(hea);
            }
        }
    }

    public void m19665a(int i, boolean z) {
        this.f16856m.sendMessage(this.f16856m.obtainMessage(7, i, z ? 1 : 2));
    }

    public void m19666a(heo heo) {
        synchronized (f16844a) {
            if (heo == this.f16854k) {
                this.f16854k = null;
                this.f16855l.clear();
            }
        }
    }

    boolean m19667a(ConnectionResult connectionResult, int i) {
        if (!connectionResult.m9652a() && !this.f16850g.mo2338a(connectionResult.m9654c())) {
            return false;
        }
        this.f16850g.m18561a(this.f16849f, connectionResult, i);
        return true;
    }

    public void m19668b() {
        this.f16856m.sendMessage(this.f16856m.obtainMessage(3));
    }

    public void m19669b(ConnectionResult connectionResult, int i) {
        if (!m19667a(connectionResult, i)) {
            this.f16856m.sendMessage(this.f16856m.obtainMessage(5, i, 0));
        }
    }

    public boolean handleMessage(Message message) {
        int i;
        hfq hfq;
        switch (message.what) {
            case 1:
                m19654a((hea) message.obj);
                break;
            case 2:
            case 7:
                i = message.arg1;
                boolean z = message.arg2 == 1;
                hfq = (hfq) this.f16852i.get(i);
                if (hfq == null) {
                    Log.wtf("GoogleApiManager", "onRelease received for unknown instance: " + i, new Exception());
                    break;
                }
                if (!z) {
                    this.f16852i.delete(i);
                }
                hfq.m19677a(i, z);
                break;
            case 3:
                for (hfq hfq2 : this.f16853j.values()) {
                    hfq2.m19675a();
                    hfq2.m19686e();
                }
                break;
            case 4:
                hdv hdv = (hdv) message.obj;
                ((hfq) this.f16852i.get(hdv.f16706a)).m19680a(hdv);
                break;
            case 5:
                if (this.f16852i.get(message.arg1) != null) {
                    ((hfq) this.f16852i.get(message.arg1)).m19679a(new Status(17, "Error resolution was canceled by the user."));
                    break;
                }
                break;
            case 6:
                guu guu = (guu) message.obj;
                i = message.arg1;
                hdx d = guu.m18659d();
                if (!this.f16853j.containsKey(d)) {
                    this.f16853j.put(d, new hfq(this, guu));
                }
                hfq hfq3 = (hfq) this.f16853j.get(d);
                hfq3.m19683b(i);
                this.f16852i.put(i, hfq3);
                hfq3.m19686e();
                this.f16858o.put(i, new hfo(this, guu, i, this.f16857n));
                if (this.f16859p == null || !this.f16859p.f16862a.get()) {
                    this.f16859p = new hfp(this.f16857n, this.f16858o);
                    this.f16859p.start();
                    break;
                }
            case 8:
                if (this.f16853j.containsKey(message.obj)) {
                    hfq2 = (hfq) this.f16853j.get(message.obj);
                    if (hfq2.f16866b) {
                        hfq2.m19686e();
                        break;
                    }
                }
                break;
            case 9:
                if (this.f16853j.containsKey(message.obj)) {
                    hfq2 = (hfq) this.f16853j.get(message.obj);
                    if (hfq2.f16866b) {
                        hfq2.m19684c();
                        hfq2.m19679a(hfq2.f16867c.f16850g.mo2334a(hfq2.f16867c.f16849f) == 18 ? new Status(8, "Connection timed out while waiting for Google Play services update to complete.") : new Status(8, "API failed to connect while resuming due to an unknown error."));
                        hfq2.f16865a.mo2600a();
                        break;
                    }
                }
                break;
            case 10:
                if (this.f16853j.containsKey(message.obj)) {
                    ((hfq) this.f16853j.get(message.obj)).m19685d();
                    break;
                }
                break;
            default:
                new StringBuilder(31).append("Unknown message id: ").append(message.what);
                return false;
        }
        return true;
    }
}
