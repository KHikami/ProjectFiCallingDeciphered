import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window.Callback;

public final class afx implements abv {
    Toolbar a;
    CharSequence b;
    Callback c;
    boolean d;
    private int e;
    private View f;
    private View g;
    private Drawable h;
    private Drawable i;
    private Drawable j;
    private boolean k;
    private CharSequence l;
    private CharSequence m;
    private zh n;
    private int o;
    private int p;
    private Drawable q;

    public afx(Toolbar toolbar, boolean z) {
        this(toolbar, z, gwb.cd);
    }

    private afx(Toolbar toolbar, boolean z, int i) {
        this.o = 0;
        this.p = 0;
        this.a = toolbar;
        this.b = toolbar.i();
        this.l = toolbar.j();
        this.k = this.b != null;
        this.j = toolbar.l();
        afp a = afp.a(toolbar.getContext(), null, wi.a, gwb.s, 0);
        this.q = a.a(wi.l);
        int g;
        if (z) {
            CharSequence c = a.c(wi.r);
            if (!TextUtils.isEmpty(c)) {
                b(c);
            }
            c = a.c(wi.p);
            if (!TextUtils.isEmpty(c)) {
                c(c);
            }
            Drawable a2 = a.a(wi.n);
            if (a2 != null) {
                a(a2);
            }
            a2 = a.a(wi.m);
            if (a2 != null) {
                c(a2);
            }
            if (this.j == null && this.q != null) {
                b(this.q);
            }
            a(a.a(wi.h, 0));
            g = a.g(wi.g, 0);
            if (g != 0) {
                a(LayoutInflater.from(this.a.getContext()).inflate(g, this.a, false));
                a(this.e | 16);
            }
            g = a.f(wi.j, 0);
            if (g > 0) {
                LayoutParams layoutParams = this.a.getLayoutParams();
                layoutParams.height = g;
                this.a.setLayoutParams(layoutParams);
            }
            g = a.d(wi.f, -1);
            int d = a.d(wi.e, -1);
            if (g >= 0 || d >= 0) {
                this.a.a(Math.max(g, 0), Math.max(d, 0));
            }
            g = a.g(wi.s, 0);
            if (g != 0) {
                this.a.a(this.a.getContext(), g);
            }
            g = a.g(wi.q, 0);
            if (g != 0) {
                this.a.b(this.a.getContext(), g);
            }
            g = a.g(wi.o, 0);
            if (g != 0) {
                this.a.a(g);
            }
        } else {
            g = 11;
            if (this.a.l() != null) {
                g = 15;
                this.q = this.a.l();
            }
            this.e = g;
        }
        a.a();
        e(i);
        this.m = this.a.k();
        this.a.a(new afy(this));
    }

    private void e(int i) {
        if (i != this.p) {
            this.p = i;
            if (TextUtils.isEmpty(this.a.k())) {
                c(this.p);
            }
        }
    }

    public ViewGroup a() {
        return this.a;
    }

    public Context b() {
        return this.a.getContext();
    }

    public boolean c() {
        return this.a.g();
    }

    public void d() {
        this.a.h();
    }

    public void a(Callback callback) {
        this.c = callback;
    }

    public void a(CharSequence charSequence) {
        if (!this.k) {
            d(charSequence);
        }
    }

    public void b(CharSequence charSequence) {
        this.k = true;
        d(charSequence);
    }

    private void d(CharSequence charSequence) {
        this.b = charSequence;
        if ((this.e & 8) != 0) {
            this.a.b(charSequence);
        }
    }

    public void c(CharSequence charSequence) {
        this.l = charSequence;
        if ((this.e & 8) != 0) {
            this.a.c(charSequence);
        }
    }

    private void c(Drawable drawable) {
        this.h = drawable;
        q();
    }

    public void a(Drawable drawable) {
        this.i = drawable;
        q();
    }

    private void q() {
        Drawable drawable = null;
        if ((this.e & 2) != 0) {
            drawable = (this.e & 1) != 0 ? this.i != null ? this.i : this.h : this.h;
        }
        this.a.a(drawable);
    }

    public boolean e() {
        return this.a.a();
    }

    public boolean f() {
        return this.a.b();
    }

    public boolean g() {
        return this.a.c();
    }

    public boolean h() {
        return this.a.d();
    }

    public boolean i() {
        return this.a.e();
    }

    public void j() {
        this.d = true;
    }

    public void a(Menu menu, yo yoVar) {
        if (this.n == null) {
            this.n = new zh(this.a.getContext());
            this.n.a(gwb.bp);
        }
        this.n.a(yoVar);
        this.a.a((xy) menu, this.n);
    }

    public void k() {
        this.a.f();
    }

    public int l() {
        return this.e;
    }

    public void a(int i) {
        int i2 = this.e ^ i;
        this.e = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    s();
                }
                r();
            }
            if ((i2 & 3) != 0) {
                q();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.a.b(this.b);
                    this.a.c(this.l);
                } else {
                    this.a.b(null);
                    this.a.c(null);
                }
            }
            if ((i2 & 16) != 0 && this.g != null) {
                if ((i & 16) != 0) {
                    this.a.addView(this.g);
                } else {
                    this.a.removeView(this.g);
                }
            }
        }
    }

    public void a(aez aez) {
        if (this.f != null && this.f.getParent() == this.a) {
            this.a.removeView(this.f);
        }
        this.f = aez;
        if (aez != null && this.o == 2) {
            this.a.addView(this.f, 0);
            aft aft = (aft) this.f.getLayoutParams();
            aft.width = -2;
            aft.height = -2;
            aft.a = 8388691;
            aez.a(true);
        }
    }

    public void a(boolean z) {
        this.a.a(z);
    }

    public int m() {
        return this.o;
    }

    public void a(View view) {
        if (!(this.g == null || (this.e & 16) == 0)) {
            this.a.removeView(this.g);
        }
        this.g = view;
        if (view != null && (this.e & 16) != 0) {
            this.a.addView(this.g);
        }
    }

    public View n() {
        return this.g;
    }

    public pn a(int i, long j) {
        return oa.m(this.a).a(i == 0 ? 1.0f : 0.0f).a(j).a(new afz(this, i));
    }

    public void b(Drawable drawable) {
        this.j = drawable;
        r();
    }

    public void b(int i) {
        b(i != 0 ? wk.b(b(), i) : null);
    }

    private void r() {
        if ((this.e & 4) != 0) {
            this.a.b(this.j != null ? this.j : this.q);
        } else {
            this.a.b(null);
        }
    }

    private void e(CharSequence charSequence) {
        this.m = charSequence;
        s();
    }

    public void c(int i) {
        e(i == 0 ? null : b().getString(i));
    }

    private void s() {
        if ((this.e & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.m)) {
            this.a.d(this.p);
        } else {
            this.a.d(this.m);
        }
    }

    public void d(int i) {
        this.a.setVisibility(i);
    }

    public int o() {
        return this.a.getVisibility();
    }

    public void a(yo yoVar, xz xzVar) {
        this.a.a(yoVar, xzVar);
    }

    public Menu p() {
        return this.a.m();
    }
}
