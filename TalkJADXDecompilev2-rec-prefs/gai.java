package p000;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import android.widget.TextView;
import com.google.android.libraries.quantum.snackbar.Snackbar;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class gai implements kco, kcq {
    gag f5331a;
    public Activity f5332b;
    public Snackbar f5333c;
    private final Queue<gag> f5334d;
    private final List<gao> f5335e;
    private Runnable f5336f;
    private boolean f5337g;
    private final dr f5338h;

    public gai(dr drVar, kbu kbu) {
        this.f5334d = new ArrayDeque();
        this.f5335e = new ArrayList();
        this.f5338h = drVar;
        kbu.m25514a((kcq) this);
    }

    public gai(Activity activity, kbu kbu) {
        this.f5334d = new ArrayDeque();
        this.f5335e = new ArrayList();
        this.f5338h = null;
        this.f5332b = activity;
        kbu.m25514a((kcq) this);
    }

    public gai mo970b(jyn jyn) {
        jyn.m25444a(gai.class, (Object) this);
        return this;
    }

    public void z_() {
        if (this.f5332b == null) {
            this.f5332b = this.f5338h.getActivity();
        }
        m7660b();
    }

    public void m7654a(Snackbar snackbar) {
        this.f5333c = snackbar;
        snackbar.setOnClickListener(new gaj(this));
    }

    public void m7658a(gao gao) {
        if (!this.f5335e.contains(gao)) {
            if (this.f5337g) {
                gao.m16819a(this.f5333c);
            } else {
                gao.m16818a();
            }
            this.f5335e.add(gao);
        }
    }

    public void m7662b(gao gao) {
        this.f5335e.remove(gao);
    }

    public void m7655a(gag gag) {
        if (gag.equals(this.f5331a)) {
            gwb.m2042b(this.f5336f);
            if (!gag.m16810f()) {
                gwb.m1864a(this.f5336f, gag.m16809e());
                return;
            }
            return;
        }
        if (!this.f5334d.contains(gag)) {
            this.f5334d.add(gag);
        }
        m7660b();
    }

    public void m7656a(gag gag, gag gag2) {
        if (!gag.equals(gag2)) {
            if (this.f5334d.contains(gag)) {
                this.f5334d.remove(gag);
                this.f5334d.add(gag2);
            } else if (this.f5331a == null || !this.f5331a.equals(gag)) {
                m7655a(gag2);
            } else {
                gwb.m2042b(this.f5336f);
                mo969a(gag2, gag.m16805a().equals(gag2.m16806b()));
            }
        }
    }

    public void m7661b(gag gag) {
        if (this.f5331a == null || !this.f5331a.equals(gag)) {
            this.f5334d.remove(gag);
            return;
        }
        this.f5333c.mo1083b();
        if (gag.m16808d() != null) {
            gag.m16808d().mo1483a();
        }
        this.f5331a = null;
        gwb.m1864a(new gak(this), 350);
        if (this.f5334d.isEmpty()) {
            for (gao a : this.f5335e) {
                a.m16818a();
            }
            this.f5337g = false;
        }
    }

    void m7660b() {
        if (this.f5331a == null) {
            gag gag = (gag) this.f5334d.poll();
            if (gag != null) {
                if (this.f5333c == null) {
                    ViewStub viewStub = (ViewStub) this.f5332b.findViewById(ba.fp);
                    if (viewStub != null) {
                        viewStub.inflate();
                    }
                    m7654a((Snackbar) this.f5332b.findViewById(ba.fo));
                }
                mo969a(gag, false);
                this.f5337g = true;
                this.f5333c.mo1082a();
            }
        }
    }

    public void mo969a(gag gag, boolean z) {
        OnClickListener gal;
        gan d = gag.m16808d();
        if (d != null) {
            gal = new gal(this, gag, d);
        } else {
            gal = null;
        }
        if (z) {
            gwb.m1863a(new gap(this.f5333c, this.f5331a, gag));
        } else if (TextUtils.isEmpty(gag.m16806b())) {
            this.f5333c.m8335a(gag.m16805a(), gag.m16807c(), gal);
        } else {
            this.f5333c.m8335a(gwb.m1618a(gag.m16805a(), gag.m16806b(), (TextView) this.f5333c.findViewById(ba.f2692do)), gag.m16807c(), gal);
        }
        this.f5331a = gag;
        this.f5336f = new gam(this, gag);
        if (!gag.m16810f()) {
            gwb.m1864a(this.f5336f, gag.m16809e());
        }
        this.f5333c.measure(-2, -2);
        for (gao a : this.f5335e) {
            a.m16819a(this.f5333c);
        }
    }
}
