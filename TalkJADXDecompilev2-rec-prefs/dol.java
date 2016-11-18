package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Handler;
import android.os.Looper;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.google.android.libraries.quantum.snackbar.Snackbar;
import java.util.PriorityQueue;

final class dol implements doh, kco, kcp, kcq {
    private final Context f10236a;
    private final PriorityQueue<dop> f10237b;
    private final Handler f10238c;
    private final Runnable f10239d;
    private final Runnable f10240e;
    private doq f10241f = new doq(this);
    private dop f10242g;
    private Snackbar f10243h;
    private Toast f10244i;
    private boolean f10245j;
    private long f10246k = -1;

    dol(Context context, kbu kbu) {
        this.f10236a = context;
        this.f10237b = new PriorityQueue();
        this.f10238c = new Handler(Looper.getMainLooper());
        this.f10242g = null;
        this.f10243h = null;
        this.f10244i = null;
        this.f10245j = true;
        this.f10239d = new dom(this);
        this.f10240e = new don(this);
        kbu.m25514a((kcq) this);
    }

    public doh mo1628a(jyn jyn) {
        jyn.m25444a(doh.class, (Object) this);
        return this;
    }

    public void z_() {
        this.f10245j = false;
        m12373a(false);
    }

    public void A_() {
        this.f10245j = true;
        m12374b();
    }

    public void mo1629a(Snackbar snackbar) {
        this.f10243h = snackbar;
        this.f10243h.mo1083b();
        m12373a(false);
    }

    public void mo1630a(dof dof) {
        dop dop = new dop(dof);
        this.f10237b.add(dop);
        if (this.f10242g == null || dop.m12376a(this.f10242g) < 0) {
            m12373a(m12374b());
        }
    }

    boolean m12374b() {
        if (this.f10242g == null) {
            return false;
        }
        this.f10242g = null;
        this.f10238c.removeCallbacks(this.f10239d);
        this.f10238c.removeCallbacks(this.f10240e);
        if (this.f10244i != null) {
            this.f10244i.cancel();
            this.f10244i = null;
            return true;
        } else if (this.f10243h.getVisibility() != 0) {
            return false;
        } else {
            this.f10243h.mo1083b();
            return true;
        }
    }

    void m12373a(boolean z) {
        if (!this.f10245j && this.f10243h != null) {
            this.f10242g = (dop) this.f10237b.poll();
            if (this.f10242g == null) {
                return;
            }
            if (z) {
                this.f10238c.postDelayed(this.f10239d, 500);
            } else {
                m12375d();
            }
        }
    }

    void m12375d() {
        dof dof = this.f10242g.f10253b;
        if (dof.f10220b) {
            int i = dof.f10219a == 0 ? 1 : 0;
            iil.m21872a("Expected null", this.f10244i);
            this.f10244i = Toast.makeText(this.f10236a, dof.f10221c, i);
            this.f10244i.show();
        } else {
            ColorStateList colorStateList;
            Snackbar snackbar = this.f10243h;
            if (dof.f10224f == null) {
                colorStateList = this.f10236a.getResources().getColorStateList(gwb.ec);
            } else {
                colorStateList = dof.f10224f;
            }
            snackbar.m8333a(colorStateList);
            snackbar = this.f10243h;
            if (dof.f10225g == null) {
                colorStateList = this.f10236a.getResources().getColorStateList(gwb.ec);
            } else {
                colorStateList = dof.f10225g;
            }
            snackbar.m8337b(colorStateList);
            OnClickListener onClickListener = null;
            if (dof.f10226h != null) {
                onClickListener = new doo(this, dof);
            }
            this.f10243h.m8335a(dof.f10221c, dof.f10223e, onClickListener);
            this.f10243h.mo1082a();
        }
        if (dof.f10222d != -1) {
            long b = glj.m17963b();
            if (this.f10246k == -1 || this.f10246k + 2000 < b) {
                gld.m17931a(dof.f10222d);
                this.f10246k = b;
            }
        }
        long j = 4000;
        if (this.f10236a != null && gld.m17937a(this.f10236a)) {
            j = 40000;
        }
        this.f10238c.postDelayed(this.f10240e, j);
    }
}
