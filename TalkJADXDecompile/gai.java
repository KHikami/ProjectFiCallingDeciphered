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
    gag a;
    public Activity b;
    public Snackbar c;
    private final Queue<gag> d;
    private final List<gao> e;
    private Runnable f;
    private boolean g;
    private final dr h;

    public gai(dr drVar, kbu kbu) {
        this.d = new ArrayDeque();
        this.e = new ArrayList();
        this.h = drVar;
        kbu.a((kcq) this);
    }

    public gai(Activity activity, kbu kbu) {
        this.d = new ArrayDeque();
        this.e = new ArrayList();
        this.h = null;
        this.b = activity;
        kbu.a((kcq) this);
    }

    public gai b(jyn jyn) {
        jyn.a(gai.class, (Object) this);
        return this;
    }

    public void z_() {
        if (this.b == null) {
            this.b = this.h.getActivity();
        }
        b();
    }

    public void a(Snackbar snackbar) {
        this.c = snackbar;
        snackbar.setOnClickListener(new gaj(this));
    }

    public void a(gao gao) {
        if (!this.e.contains(gao)) {
            if (this.g) {
                gao.a(this.c);
            } else {
                gao.a();
            }
            this.e.add(gao);
        }
    }

    public void b(gao gao) {
        this.e.remove(gao);
    }

    public void a(gag gag) {
        if (gag.equals(this.a)) {
            gwb.b(this.f);
            if (!gag.f()) {
                gwb.a(this.f, gag.e());
                return;
            }
            return;
        }
        if (!this.d.contains(gag)) {
            this.d.add(gag);
        }
        b();
    }

    public void a(gag gag, gag gag2) {
        if (!gag.equals(gag2)) {
            if (this.d.contains(gag)) {
                this.d.remove(gag);
                this.d.add(gag2);
            } else if (this.a == null || !this.a.equals(gag)) {
                a(gag2);
            } else {
                gwb.b(this.f);
                a(gag2, gag.a().equals(gag2.b()));
            }
        }
    }

    public void b(gag gag) {
        if (this.a == null || !this.a.equals(gag)) {
            this.d.remove(gag);
            return;
        }
        this.c.b();
        if (gag.d() != null) {
            gag.d().a();
        }
        this.a = null;
        gwb.a(new gak(this), 350);
        if (this.d.isEmpty()) {
            for (gao a : this.e) {
                a.a();
            }
            this.g = false;
        }
    }

    void b() {
        if (this.a == null) {
            gag gag = (gag) this.d.poll();
            if (gag != null) {
                if (this.c == null) {
                    ViewStub viewStub = (ViewStub) this.b.findViewById(ba.fp);
                    if (viewStub != null) {
                        viewStub.inflate();
                    }
                    a((Snackbar) this.b.findViewById(ba.fo));
                }
                a(gag, false);
                this.g = true;
                this.c.a();
            }
        }
    }

    public void a(gag gag, boolean z) {
        OnClickListener gal;
        gan d = gag.d();
        if (d != null) {
            gal = new gal(this, gag, d);
        } else {
            gal = null;
        }
        if (z) {
            gwb.a(new gap(this.c, this.a, gag));
        } else if (TextUtils.isEmpty(gag.b())) {
            this.c.a(gag.a(), gag.c(), gal);
        } else {
            this.c.a(gwb.a(gag.a(), gag.b(), (TextView) this.c.findViewById(ba.do)), gag.c(), gal);
        }
        this.a = gag;
        this.f = new gam(this, gag);
        if (!gag.f()) {
            gwb.a(this.f, gag.e());
        }
        this.c.measure(-2, -2);
        for (gao a : this.e) {
            a.a(this.c);
        }
    }
}
