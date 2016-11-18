package p000;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Message;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

final class hfq<O extends gua> implements guk, gul {
    final gug f16865a;
    boolean f16866b;
    final /* synthetic */ hfn f16867c;
    private final Queue<hdv> f16868d = new LinkedList();
    private final gud f16869e;
    private final hdx<O> f16870f;
    private final SparseArray<hgp> f16871g = new SparseArray();
    private final Set<hea> f16872h = new HashSet();
    private final SparseArray<Map<Object, heb>> f16873i = new SparseArray();
    private ConnectionResult f16874j = null;

    public hfq(hfn hfn, guu<O> guu_O) {
        this.f16867c = hfn;
        this.f16865a = guu_O.m18657b().m18605b().mo2333a(guu_O.m18660e(), this.f16867c.f16856m.getLooper(), gwa.m18753a(guu_O.m18660e()), guu_O.m18658c(), this, this);
        if (this.f16865a instanceof gvl) {
            this.f16869e = ((gvl) this.f16865a).mo2348i();
        } else {
            this.f16869e = this.f16865a;
        }
        this.f16870f = guu_O.m18659d();
    }

    private void m19671b(ConnectionResult connectionResult) {
        for (hea a : this.f16872h) {
            a.m19474a(this.f16870f, connectionResult);
        }
        this.f16872h.clear();
    }

    private void m19672b(hdv hdv) {
        hdv.mo2466a(this.f16871g);
        Map map;
        if (hdv.f16707b == 3) {
            try {
                Map map2;
                map = (Map) this.f16873i.get(hdv.f16706a);
                if (map == null) {
                    ky kyVar = new ky(1);
                    this.f16873i.put(hdv.f16706a, kyVar);
                    map2 = kyVar;
                } else {
                    map2 = map;
                }
                heb heb = ((hdw) hdv).f16708c;
                map2.put(((C0000a) heb).m12i(), heb);
            } catch (ClassCastException e) {
                throw new IllegalStateException("Listener registration methods must implement ListenerApiMethod");
            }
        } else if (hdv.f16707b == 4) {
            try {
                map = (Map) this.f16873i.get(hdv.f16706a);
                C0000a c0000a = (C0000a) ((hdw) hdv).f16708c;
                if (map != null) {
                    map.remove(c0000a.m12i());
                }
            } catch (ClassCastException e2) {
                throw new IllegalStateException("Listener unregistration methods must implement ListenerApiMethod");
            }
        }
        try {
            hdv.mo2468a(this.f16869e);
        } catch (DeadObjectException e3) {
            this.f16865a.mo2600a();
            mo1150a(1);
        }
    }

    private void m19673g() {
        while (this.f16865a.m18615b() && !this.f16868d.isEmpty()) {
            m19672b((hdv) this.f16868d.remove());
        }
    }

    private void m19674h() {
        this.f16867c.f16856m.removeMessages(10, this.f16870f);
        this.f16867c.f16856m.sendMessageDelayed(this.f16867c.f16856m.obtainMessage(10, this.f16870f), this.f16867c.f16848d);
    }

    public void m19675a() {
        this.f16874j = null;
    }

    public void mo1150a(int i) {
        m19675a();
        this.f16866b = true;
        this.f16867c.f16856m.sendMessageDelayed(Message.obtain(this.f16867c.f16856m, 8, this.f16870f), this.f16867c.f16846b);
        this.f16867c.f16856m.sendMessageDelayed(Message.obtain(this.f16867c.f16856m, 9, this.f16870f), this.f16867c.f16847c);
        this.f16867c.f16851h = -1;
    }

    public void m19677a(int i, boolean z) {
        Iterator it = this.f16868d.iterator();
        while (it.hasNext()) {
            hdv hdv = (hdv) it.next();
            if (hdv.f16706a == i && hdv.f16707b != 1 && hdv.mo2469a()) {
                it.remove();
            }
        }
        ((hgp) this.f16871g.get(i)).m19753a();
        this.f16873i.delete(i);
        if (!z) {
            this.f16871g.remove(i);
            this.f16867c.f16858o.remove(i);
            if (this.f16871g.size() == 0 && this.f16868d.isEmpty()) {
                m19684c();
                this.f16865a.mo2600a();
                this.f16867c.f16853j.remove(this.f16870f);
                synchronized (hfn.f16844a) {
                    this.f16867c.f16855l.remove(this.f16870f);
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1151a(ConnectionResult connectionResult) {
        m19675a();
        this.f16867c.f16851h = -1;
        m19671b(connectionResult);
        int keyAt = this.f16871g.keyAt(0);
        if (this.f16868d.isEmpty()) {
            this.f16874j = connectionResult;
            return;
        }
        synchronized (hfn.f16844a) {
            if (this.f16867c.f16854k != null && this.f16867c.f16855l.contains(this.f16870f)) {
                this.f16867c.f16854k.m19460b(connectionResult, keyAt);
            }
        }
    }

    void m19679a(Status status) {
        for (hdv a : this.f16868d) {
            a.mo2467a(status);
        }
        this.f16868d.clear();
    }

    public void m19680a(hdv hdv) {
        if (this.f16865a.m18615b()) {
            m19672b(hdv);
            m19674h();
            return;
        }
        this.f16868d.add(hdv);
        if (this.f16874j == null || !this.f16874j.m9652a()) {
            m19686e();
        } else {
            mo1151a(this.f16874j);
        }
    }

    public void m19681a(hea hea) {
        this.f16872h.add(hea);
    }

    public void a_(Bundle bundle) {
        m19675a();
        m19671b(ConnectionResult.f7256a);
        m19684c();
        for (int i = 0; i < this.f16873i.size(); i++) {
            for (heb b : ((Map) this.f16873i.get(this.f16873i.keyAt(i))).values()) {
                try {
                    b.m18991b(this.f16869e);
                } catch (DeadObjectException e) {
                    this.f16865a.mo2600a();
                    mo1150a(1);
                }
            }
        }
        m19673g();
        m19674h();
    }

    ConnectionResult m19682b() {
        return this.f16874j;
    }

    public void m19683b(int i) {
        this.f16871g.put(i, new hgp(this.f16870f.m19445a(), this.f16865a));
    }

    void m19684c() {
        if (this.f16866b) {
            this.f16867c.f16856m.removeMessages(9, this.f16870f);
            this.f16867c.f16856m.removeMessages(8, this.f16870f);
            this.f16866b = false;
        }
    }

    void m19685d() {
        if (this.f16865a.m18615b() && this.f16873i.size() == 0) {
            for (int i = 0; i < this.f16871g.size(); i++) {
                if (((hgp) this.f16871g.get(this.f16871g.keyAt(i))).m19757c()) {
                    m19674h();
                    return;
                }
            }
            this.f16865a.mo2600a();
        }
    }

    void m19686e() {
        if (!this.f16865a.m18615b() && !this.f16865a.m18616c()) {
            if (this.f16867c.f16851h != 0) {
                this.f16867c.f16851h = this.f16867c.f16850g.mo2334a(this.f16867c.f16849f);
                if (this.f16867c.f16851h != 0) {
                    mo1151a(new ConnectionResult(this.f16867c.f16851h, null));
                    return;
                }
            }
            this.f16865a.m18612a(new hfr(this.f16867c, this.f16865a, this.f16870f));
        }
    }

    boolean m19687f() {
        return this.f16865a.m18615b();
    }
}
