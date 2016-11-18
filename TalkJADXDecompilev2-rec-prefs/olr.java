package p000;

import java.util.ArrayList;
import java.util.List;

final class olr<T> extends okr<T> {
    private static final olv f33174b = olv.q.b("PickFirstBalancer has shut down");
    final omb<T> f33175a;
    private final Object f33176c = new Object();
    private okm f33177d;
    private omc<T> f33178e;
    private olv f33179f;
    private boolean f33180g;

    olr(omb<T> omb_T) {
        this.f33175a = omb_T;
    }

    public T mo4172a() {
        synchronized (this.f33176c) {
            if (this.f33180g) {
                T a = this.f33175a.m38705a(f33174b);
                return a;
            }
            okm okm = this.f33177d;
            if (okm != null) {
                return this.f33175a.m38704a(okm);
            } else if (this.f33179f != null) {
                a = this.f33175a.m38705a(this.f33179f);
                return a;
            } else {
                if (this.f33178e == null) {
                    this.f33178e = this.f33175a.m38706a();
                }
                a = this.f33178e.m38707a();
                return a;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4173a(List list) {
        synchronized (this.f33176c) {
            if (this.f33180g) {
                return;
            }
            List arrayList = new ArrayList();
            for (List<olt> it : list) {
                for (olt a : it) {
                    arrayList.add(a.m38697a());
                }
            }
            okm okm = new okm(arrayList);
            if (okm.equals(this.f33177d)) {
                return;
            }
            this.f33177d = okm;
            this.f33179f = null;
            omc omc = this.f33178e;
            this.f33178e = null;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4174a(olv olv) {
        synchronized (this.f33176c) {
            if (this.f33180g) {
                return;
            }
            olv b = olv.b("Name resolution failed");
            omc omc = this.f33178e;
            this.f33178e = null;
            this.f33179f = b;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4175b() {
        synchronized (this.f33176c) {
            if (this.f33180g) {
                return;
            }
            this.f33180g = true;
            omc omc = this.f33178e;
            this.f33178e = null;
        }
    }
}
