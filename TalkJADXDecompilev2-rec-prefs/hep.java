package p000;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

public final class hep implements hfi {
    final hfj f16755a;
    private boolean f16756b = false;

    public hep(hfj hfj) {
        this.f16755a = hfj;
    }

    public <A extends gud, R extends gup, T extends heb<R, A>> T mo2492a(T t) {
        return mo2497b(t);
    }

    public void mo2493a() {
    }

    public void mo2494a(int i) {
        this.f16755a.m19637a(null);
        this.f16755a.f16836j.mo2489a(i, this.f16756b);
    }

    public void mo2495a(Bundle bundle) {
    }

    public void mo2496a(ConnectionResult connectionResult, gtz<?> gtz_, int i) {
    }

    public boolean mo2498b() {
        if (this.f16756b) {
            return false;
        }
        if (this.f16755a.f16835i.m19627h()) {
            this.f16756b = true;
            for (hgm a : this.f16755a.f16835i.f16807i) {
                a.m19749a();
            }
            return false;
        }
        this.f16755a.m19637a(null);
        return true;
    }

    public void mo2499c() {
        if (this.f16756b) {
            this.f16756b = false;
            this.f16755a.m19639a(new her(this, this));
        }
    }

    void m19543d() {
        if (this.f16756b) {
            this.f16756b = false;
            this.f16755a.f16835i.f16808j.m19753a();
            mo2498b();
        }
    }

    public <A extends gud, T extends heb<? extends gup, A>> T mo2497b(T t) {
        try {
            this.f16755a.f16835i.f16808j.m19754a((heb) t);
            gud b = this.f16755a.f16835i.m19616b(t.f16402e);
            if (b.m18615b() || !this.f16755a.f16829c.containsKey(t.f16402e)) {
                if (b instanceof gvl) {
                    b = ((gvl) b).mo2348i();
                }
                t.m18991b(b);
                return t;
            }
            t.m18993c(new Status(17));
            return t;
        } catch (DeadObjectException e) {
            this.f16755a.m19639a(new heq(this, this));
        }
    }
}
