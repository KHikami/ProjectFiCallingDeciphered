import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

public final class hep implements hfi {
    final hfj a;
    private boolean b;

    public hep(hfj hfj) {
        this.b = false;
        this.a = hfj;
    }

    public <A extends gud, R extends gup, T extends heb<R, A>> T a(T t) {
        return b(t);
    }

    public void a() {
    }

    public void a(int i) {
        this.a.a(null);
        this.a.j.a(i, this.b);
    }

    public void a(Bundle bundle) {
    }

    public void a(ConnectionResult connectionResult, gtz<?> gtz_, int i) {
    }

    public boolean b() {
        if (this.b) {
            return false;
        }
        if (this.a.i.h()) {
            this.b = true;
            for (hgm a : this.a.i.i) {
                a.a();
            }
            return false;
        }
        this.a.a(null);
        return true;
    }

    public void c() {
        if (this.b) {
            this.b = false;
            this.a.a(new her(this, this));
        }
    }

    void d() {
        if (this.b) {
            this.b = false;
            this.a.i.j.a();
            b();
        }
    }

    public <A extends gud, T extends heb<? extends gup, A>> T b(T t) {
        try {
            this.a.i.j.a((heb) t);
            gud b = this.a.i.b(t.e);
            if (b.b() || !this.a.c.containsKey(t.e)) {
                if (b instanceof gvl) {
                    b = ((gvl) b).i();
                }
                t.b(b);
                return t;
            }
            t.c(new Status(17));
            return t;
        } catch (DeadObjectException e) {
            this.a.a(new heq(this, this));
        }
    }
}
