package p000;

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
    Toolbar f559a;
    CharSequence f560b;
    Callback f561c;
    boolean f562d;
    private int f563e;
    private View f564f;
    private View f565g;
    private Drawable f566h;
    private Drawable f567i;
    private Drawable f568j;
    private boolean f569k;
    private CharSequence f570l;
    private CharSequence f571m;
    private zh f572n;
    private int f573o;
    private int f574p;
    private Drawable f575q;

    public afx(Toolbar toolbar, boolean z) {
        this(toolbar, z, gwb.cd);
    }

    private afx(Toolbar toolbar, boolean z, int i) {
        this.f573o = 0;
        this.f574p = 0;
        this.f559a = toolbar;
        this.f560b = toolbar.m3448i();
        this.f570l = toolbar.m3449j();
        this.f569k = this.f560b != null;
        this.f568j = toolbar.m3451l();
        afp a = afp.m927a(toolbar.getContext(), null, wi.f29034a, gwb.f889s, 0);
        this.f575q = a.m930a(wi.f29046l);
        int g;
        if (z) {
            CharSequence c = a.m936c(wi.f29052r);
            if (!TextUtils.isEmpty(c)) {
                mo128b(c);
            }
            c = a.m936c(wi.f29050p);
            if (!TextUtils.isEmpty(c)) {
                mo130c(c);
            }
            Drawable a2 = a.m930a(wi.f29048n);
            if (a2 != null) {
                mo118a(a2);
            }
            a2 = a.m930a(wi.f29047m);
            if (a2 != null) {
                m957c(a2);
            }
            if (this.f568j == null && this.f575q != null) {
                mo127b(this.f575q);
            }
            mo116a(a.m929a(wi.f29042h, 0));
            g = a.m943g(wi.f29041g, 0);
            if (g != 0) {
                mo120a(LayoutInflater.from(this.f559a.getContext()).inflate(g, this.f559a, false));
                mo116a(this.f563e | 16);
            }
            g = a.m941f(wi.f29044j, 0);
            if (g > 0) {
                LayoutParams layoutParams = this.f559a.getLayoutParams();
                layoutParams.height = g;
                this.f559a.setLayoutParams(layoutParams);
            }
            g = a.m937d(wi.f29040f, -1);
            int d = a.m937d(wi.f29039e, -1);
            if (g >= 0 || d >= 0) {
                this.f559a.m3422a(Math.max(g, 0), Math.max(d, 0));
            }
            g = a.m943g(wi.f29053s, 0);
            if (g != 0) {
                this.f559a.m3424a(this.f559a.getContext(), g);
            }
            g = a.m943g(wi.f29051q, 0);
            if (g != 0) {
                this.f559a.m3433b(this.f559a.getContext(), g);
            }
            g = a.m943g(wi.f29049o, 0);
            if (g != 0) {
                this.f559a.m3421a(g);
            }
        } else {
            g = 11;
            if (this.f559a.m3451l() != null) {
                g = 15;
                this.f575q = this.f559a.m3451l();
            }
            this.f563e = g;
        }
        a.m931a();
        m959e(i);
        this.f571m = this.f559a.m3450k();
        this.f559a.m3426a(new afy(this));
    }

    private void m959e(int i) {
        if (i != this.f574p) {
            this.f574p = i;
            if (TextUtils.isEmpty(this.f559a.m3450k())) {
                mo129c(this.f574p);
            }
        }
    }

    public ViewGroup mo114a() {
        return this.f559a;
    }

    public Context mo125b() {
        return this.f559a.getContext();
    }

    public boolean mo131c() {
        return this.f559a.m3446g();
    }

    public void mo132d() {
        this.f559a.m3447h();
    }

    public void mo121a(Callback callback) {
        this.f561c = callback;
    }

    public void mo122a(CharSequence charSequence) {
        if (!this.f569k) {
            m958d(charSequence);
        }
    }

    public void mo128b(CharSequence charSequence) {
        this.f569k = true;
        m958d(charSequence);
    }

    private void m958d(CharSequence charSequence) {
        this.f560b = charSequence;
        if ((this.f563e & 8) != 0) {
            this.f559a.mo1259b(charSequence);
        }
    }

    public void mo130c(CharSequence charSequence) {
        this.f570l = charSequence;
        if ((this.f563e & 8) != 0) {
            this.f559a.mo1260c(charSequence);
        }
    }

    private void m957c(Drawable drawable) {
        this.f566h = drawable;
        m961q();
    }

    public void mo118a(Drawable drawable) {
        this.f567i = drawable;
        m961q();
    }

    private void m961q() {
        Drawable drawable = null;
        if ((this.f563e & 2) != 0) {
            drawable = (this.f563e & 1) != 0 ? this.f567i != null ? this.f567i : this.f566h : this.f566h;
        }
        this.f559a.m3425a(drawable);
    }

    public boolean mo134e() {
        return this.f559a.m3431a();
    }

    public boolean mo135f() {
        return this.f559a.m3436b();
    }

    public boolean mo136g() {
        return this.f559a.m3439c();
    }

    public boolean mo137h() {
        return this.f559a.m3442d();
    }

    public boolean mo138i() {
        return this.f559a.m3444e();
    }

    public void mo139j() {
        this.f562d = true;
    }

    public void mo119a(Menu menu, yo yoVar) {
        if (this.f572n == null) {
            this.f572n = new zh(this.f559a.getContext());
            this.f572n.a(gwb.bp);
        }
        this.f572n.a(yoVar);
        this.f559a.m3428a((xy) menu, this.f572n);
    }

    public void mo140k() {
        this.f559a.m3445f();
    }

    public int mo141l() {
        return this.f563e;
    }

    public void mo116a(int i) {
        int i2 = this.f563e ^ i;
        this.f563e = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m963s();
                }
                m962r();
            }
            if ((i2 & 3) != 0) {
                m961q();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f559a.mo1259b(this.f560b);
                    this.f559a.mo1260c(this.f570l);
                } else {
                    this.f559a.mo1259b(null);
                    this.f559a.mo1260c(null);
                }
            }
            if ((i2 & 16) != 0 && this.f565g != null) {
                if ((i & 16) != 0) {
                    this.f559a.addView(this.f565g);
                } else {
                    this.f559a.removeView(this.f565g);
                }
            }
        }
    }

    public void mo117a(aez aez) {
        if (this.f564f != null && this.f564f.getParent() == this.f559a) {
            this.f559a.removeView(this.f564f);
        }
        this.f564f = aez;
        if (aez != null && this.f573o == 2) {
            this.f559a.addView(this.f564f, 0);
            aft aft = (aft) this.f564f.getLayoutParams();
            aft.width = -2;
            aft.height = -2;
            aft.a = 8388691;
            aez.m911a(true);
        }
    }

    public void mo124a(boolean z) {
        this.f559a.m3430a(z);
    }

    public int mo142m() {
        return this.f573o;
    }

    public void mo120a(View view) {
        if (!(this.f565g == null || (this.f563e & 16) == 0)) {
            this.f559a.removeView(this.f565g);
        }
        this.f565g = view;
        if (view != null && (this.f563e & 16) != 0) {
            this.f559a.addView(this.f565g);
        }
    }

    public View mo143n() {
        return this.f565g;
    }

    public pn mo115a(int i, long j) {
        return oa.m(this.f559a).a(i == 0 ? 1.0f : 0.0f).a(j).a(new afz(this, i));
    }

    public void mo127b(Drawable drawable) {
        this.f568j = drawable;
        m962r();
    }

    public void mo126b(int i) {
        mo127b(i != 0 ? wk.b(mo125b(), i) : null);
    }

    private void m962r() {
        if ((this.f563e & 4) != 0) {
            this.f559a.m3434b(this.f568j != null ? this.f568j : this.f575q);
        } else {
            this.f559a.m3434b(null);
        }
    }

    private void m960e(CharSequence charSequence) {
        this.f571m = charSequence;
        m963s();
    }

    public void mo129c(int i) {
        m960e(i == 0 ? null : mo125b().getString(i));
    }

    private void m963s() {
        if ((this.f563e & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f571m)) {
            this.f559a.m3440d(this.f574p);
        } else {
            this.f559a.m3441d(this.f571m);
        }
    }

    public void mo133d(int i) {
        this.f559a.setVisibility(i);
    }

    public int mo144o() {
        return this.f559a.getVisibility();
    }

    public void mo123a(yo yoVar, xz xzVar) {
        this.f559a.m3429a(yoVar, xzVar);
    }

    public Menu mo145p() {
        return this.f559a.m3452m();
    }
}
