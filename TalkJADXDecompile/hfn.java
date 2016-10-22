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
    static final Object a;
    private static hfn e;
    private long b;
    private long c;
    private long d;
    private final Context f;
    private final gtp g;
    private int h;
    private final SparseArray<hfq<?>> i;
    private final Map<hdx<?>, hfq<?>> j;
    private heo k;
    private final Set<hdx<?>> l;
    private final Handler m;
    private final ReferenceQueue<guu<?>> n;
    private final SparseArray<hfo> o;
    private hfp p;

    static {
        a = new Object();
    }

    public static hfn a() {
        hfn hfn;
        synchronized (a) {
            hfn = e;
        }
        return hfn;
    }

    private void a(hea hea) {
        for (hdx hdx : hea.c()) {
            hfq hfq = (hfq) this.j.get(hdx);
            if (hfq == null) {
                hea.f();
                return;
            } else if (hfq.f()) {
                hea.a(hdx, ConnectionResult.a);
            } else if (hfq.b() != null) {
                hea.a(hdx, hfq.b());
            } else {
                hfq.a(hea);
            }
        }
    }

    public void a(int i, boolean z) {
        this.m.sendMessage(this.m.obtainMessage(7, i, z ? 1 : 2));
    }

    public void a(heo heo) {
        synchronized (a) {
            if (heo == this.k) {
                this.k = null;
                this.l.clear();
            }
        }
    }

    boolean a(ConnectionResult connectionResult, int i) {
        if (!connectionResult.a() && !this.g.a(connectionResult.c())) {
            return false;
        }
        this.g.a(this.f, connectionResult, i);
        return true;
    }

    public void b() {
        this.m.sendMessage(this.m.obtainMessage(3));
    }

    public void b(ConnectionResult connectionResult, int i) {
        if (!a(connectionResult, i)) {
            this.m.sendMessage(this.m.obtainMessage(5, i, 0));
        }
    }

    public boolean handleMessage(Message message) {
        int i;
        hfq hfq;
        switch (message.what) {
            case wi.j /*1*/:
                a((hea) message.obj);
                break;
            case wi.l /*2*/:
            case wi.q /*7*/:
                i = message.arg1;
                boolean z = message.arg2 == 1;
                hfq = (hfq) this.i.get(i);
                if (hfq == null) {
                    Log.wtf("GoogleApiManager", "onRelease received for unknown instance: " + i, new Exception());
                    break;
                }
                if (!z) {
                    this.i.delete(i);
                }
                hfq.a(i, z);
                break;
            case wi.z /*3*/:
                for (hfq hfq2 : this.j.values()) {
                    hfq2.a();
                    hfq2.e();
                }
                break;
            case wi.h /*4*/:
                hdv hdv = (hdv) message.obj;
                ((hfq) this.i.get(hdv.a)).a(hdv);
                break;
            case wi.p /*5*/:
                if (this.i.get(message.arg1) != null) {
                    ((hfq) this.i.get(message.arg1)).a(new Status(17, "Error resolution was canceled by the user."));
                    break;
                }
                break;
            case wi.s /*6*/:
                guu guu = (guu) message.obj;
                i = message.arg1;
                hdx d = guu.d();
                if (!this.j.containsKey(d)) {
                    this.j.put(d, new hfq(this, guu));
                }
                hfq hfq3 = (hfq) this.j.get(d);
                hfq3.b(i);
                this.i.put(i, hfq3);
                hfq3.e();
                this.o.put(i, new hfo(this, guu, i, this.n));
                if (this.p == null || !this.p.a.get()) {
                    this.p = new hfp(this.n, this.o);
                    this.p.start();
                    break;
                }
            case wi.m /*8*/:
                if (this.j.containsKey(message.obj)) {
                    hfq2 = (hfq) this.j.get(message.obj);
                    if (hfq2.b) {
                        hfq2.e();
                        break;
                    }
                }
                break;
            case wi.n /*9*/:
                if (this.j.containsKey(message.obj)) {
                    hfq2 = (hfq) this.j.get(message.obj);
                    if (hfq2.b) {
                        hfq2.c();
                        hfq2.a(hfq2.c.g.a(hfq2.c.f) == 18 ? new Status(8, "Connection timed out while waiting for Google Play services update to complete.") : new Status(8, "API failed to connect while resuming due to an unknown error."));
                        hfq2.a.a();
                        break;
                    }
                }
                break;
            case wi.dr /*10*/:
                if (this.j.containsKey(message.obj)) {
                    ((hfq) this.j.get(message.obj)).d();
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
