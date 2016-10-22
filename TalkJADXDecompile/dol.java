import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Handler;
import android.os.Looper;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.google.android.libraries.quantum.snackbar.Snackbar;
import java.util.PriorityQueue;

final class dol implements doh, kco, kcp, kcq {
    private final Context a;
    private final PriorityQueue<dop> b;
    private final Handler c;
    private final Runnable d;
    private final Runnable e;
    private doq f;
    private dop g;
    private Snackbar h;
    private Toast i;
    private boolean j;
    private long k;

    dol(Context context, kbu kbu) {
        this.f = new doq(this);
        this.k = -1;
        this.a = context;
        this.b = new PriorityQueue();
        this.c = new Handler(Looper.getMainLooper());
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = true;
        this.d = new dom(this);
        this.e = new don(this);
        kbu.a((kcq) this);
    }

    public doh a(jyn jyn) {
        jyn.a(doh.class, (Object) this);
        return this;
    }

    public void z_() {
        this.j = false;
        a(false);
    }

    public void A_() {
        this.j = true;
        b();
    }

    public void a(Snackbar snackbar) {
        this.h = snackbar;
        this.h.b();
        a(false);
    }

    public void a(dof dof) {
        dop dop = new dop(dof);
        this.b.add(dop);
        if (this.g == null || dop.a(this.g) < 0) {
            a(b());
        }
    }

    boolean b() {
        if (this.g == null) {
            return false;
        }
        this.g = null;
        this.c.removeCallbacks(this.d);
        this.c.removeCallbacks(this.e);
        if (this.i != null) {
            this.i.cancel();
            this.i = null;
            return true;
        } else if (this.h.getVisibility() != 0) {
            return false;
        } else {
            this.h.b();
            return true;
        }
    }

    void a(boolean z) {
        if (!this.j && this.h != null) {
            this.g = (dop) this.b.poll();
            if (this.g == null) {
                return;
            }
            if (z) {
                this.c.postDelayed(this.d, 500);
            } else {
                d();
            }
        }
    }

    void d() {
        dof dof = this.g.b;
        if (dof.b) {
            int i = dof.a == 0 ? 1 : 0;
            iil.a("Expected null", this.i);
            this.i = Toast.makeText(this.a, dof.c, i);
            this.i.show();
        } else {
            ColorStateList colorStateList;
            Snackbar snackbar = this.h;
            if (dof.f == null) {
                colorStateList = this.a.getResources().getColorStateList(gwb.ec);
            } else {
                colorStateList = dof.f;
            }
            snackbar.a(colorStateList);
            snackbar = this.h;
            if (dof.g == null) {
                colorStateList = this.a.getResources().getColorStateList(gwb.ec);
            } else {
                colorStateList = dof.g;
            }
            snackbar.b(colorStateList);
            OnClickListener onClickListener = null;
            if (dof.h != null) {
                onClickListener = new doo(this, dof);
            }
            this.h.a(dof.c, dof.e, onClickListener);
            this.h.a();
        }
        if (dof.d != -1) {
            long b = glj.b();
            if (this.k == -1 || this.k + 2000 < b) {
                gld.a(dof.d);
                this.k = b;
            }
        }
        long j = 4000;
        if (this.a != null && gld.a(this.a)) {
            j = 40000;
        }
        this.c.postDelayed(this.e, j);
    }
}
