package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window.Callback;

/* compiled from: PG */
/* renamed from: aao */
public final class aao implements wv {
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
    private ud n;
    private int o;
    private int p;
    private Drawable q;

    public aao(Toolbar toolbar, boolean z) {
        this(toolbar, true, buf.ca);
    }

    private aao(Toolbar toolbar, boolean z, int i) {
        CharSequence c;
        int g;
        this.o = 0;
        this.p = 0;
        this.a = toolbar;
        this.b = toolbar.o;
        this.l = toolbar.p;
        this.k = this.b != null;
        this.j = toolbar.e();
        aah a = aah.a(toolbar.getContext(), null, rk.a, buf.q, 0);
        this.q = a.a(rk.n);
        if (z) {
            Toolbar toolbar2;
            Context context;
            c = a.c(rk.t);
            if (!TextUtils.isEmpty(c)) {
                b(c);
            }
            c = a.c(rk.r);
            if (!TextUtils.isEmpty(c)) {
                this.l = c;
                if ((this.e & 8) != 0) {
                    this.a.b(c);
                }
            }
            Drawable a2 = a.a(rk.p);
            if (a2 != null) {
                this.i = a2;
                q();
            }
            a2 = a.a(rk.o);
            if (a2 != null) {
                this.h = a2;
                q();
            }
            if (this.j == null && this.q != null) {
                this.j = this.q;
                r();
            }
            a(a.a(rk.j, 0));
            g = a.g(rk.i, 0);
            if (g != 0) {
                a(LayoutInflater.from(this.a.getContext()).inflate(g, this.a, false));
                a(this.e | 16);
            }
            g = a.f(rk.l, 0);
            if (g > 0) {
                LayoutParams layoutParams = this.a.getLayoutParams();
                layoutParams.height = g;
                this.a.setLayoutParams(layoutParams);
            }
            g = a.d(rk.h, -1);
            int d = a.d(rk.g, -1);
            if (g >= 0 || d >= 0) {
                this.a.n.a(Math.max(g, 0), Math.max(d, 0));
            }
            g = a.g(rk.u, 0);
            if (g != 0) {
                toolbar2 = this.a;
                context = this.a.getContext();
                toolbar2.k = g;
                if (toolbar2.b != null) {
                    toolbar2.b.setTextAppearance(context, g);
                }
            }
            g = a.g(rk.s, 0);
            if (g != 0) {
                toolbar2 = this.a;
                context = this.a.getContext();
                toolbar2.l = g;
                if (toolbar2.c != null) {
                    toolbar2.c.setTextAppearance(context, g);
                }
            }
            g = a.g(rk.q, 0);
            if (g != 0) {
                this.a.a(g);
            }
        } else {
            g = 11;
            if (this.a.e() != null) {
                g = 15;
                this.q = this.a.e();
            }
            this.e = g;
        }
        a.a.recycle();
        vi.a();
        if (i != this.p) {
            this.p = i;
            if (TextUtils.isEmpty(this.a.d())) {
                g = this.p;
                if (g == 0) {
                    c = null;
                } else {
                    c = this.a.getContext().getString(g);
                }
                this.m = c;
                s();
            }
        }
        this.m = this.a.d();
        Toolbar toolbar3 = this.a;
        OnClickListener aap = new aap(this);
        toolbar3.g();
        toolbar3.d.setOnClickListener(aap);
    }

    public final ViewGroup a() {
        return this.a;
    }

    public final Context b() {
        return this.a.getContext();
    }

    public final boolean c() {
        Toolbar toolbar = this.a;
        return (toolbar.s == null || toolbar.s.a == null) ? false : true;
    }

    public final void d() {
        this.a.c();
    }

    public final void a(Callback callback) {
        this.c = callback;
    }

    public final void a(CharSequence charSequence) {
        if (!this.k) {
            c(charSequence);
        }
    }

    public final void b(CharSequence charSequence) {
        this.k = true;
        c(charSequence);
    }

    private final void c(CharSequence charSequence) {
        this.b = charSequence;
        if ((this.e & 8) != 0) {
            this.a.a(charSequence);
        }
    }

    private final void q() {
        Drawable drawable = null;
        if ((this.e & 2) != 0) {
            drawable = (this.e & 1) != 0 ? this.i != null ? this.i : this.h : this.h;
        }
        this.a.a(drawable);
    }

    public final boolean e() {
        Toolbar toolbar = this.a;
        return toolbar.getVisibility() == 0 && toolbar.a != null && toolbar.a.b;
    }

    public final boolean f() {
        return this.a.a();
    }

    public final boolean g() {
        Toolbar toolbar = this.a;
        if (toolbar.a != null) {
            boolean z;
            ActionMenuView actionMenuView = toolbar.a;
            if (actionMenuView.c != null) {
                ud udVar = actionMenuView.c;
                if (udVar.k != null || udVar.f()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    z = true;
                    if (z) {
                        return true;
                    }
                }
            }
            z = false;
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.a.b();
    }

    public final boolean i() {
        Toolbar toolbar = this.a;
        if (toolbar.a != null) {
            boolean z;
            ActionMenuView actionMenuView = toolbar.a;
            if (actionMenuView.c == null || !actionMenuView.c.c()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final void j() {
        this.d = true;
    }

    public final void a(Menu menu, tk tkVar) {
        if (this.n == null) {
            this.n = new ud(this.a.getContext());
        }
        this.n.d = tkVar;
        Toolbar toolbar = this.a;
        su suVar = (su) menu;
        ud udVar = this.n;
        if (suVar != null || toolbar.a != null) {
            toolbar.f();
            su suVar2 = toolbar.a.a;
            if (suVar2 != suVar) {
                if (suVar2 != null) {
                    suVar2.b(toolbar.r);
                    suVar2.b(toolbar.s);
                }
                if (toolbar.s == null) {
                    toolbar.s = new aak(toolbar);
                }
                udVar.h = true;
                if (suVar != null) {
                    suVar.a((tj) udVar, toolbar.i);
                    suVar.a(toolbar.s, toolbar.i);
                } else {
                    udVar.a(toolbar.i, null);
                    toolbar.s.a(toolbar.i, null);
                    udVar.b(true);
                    toolbar.s.b(true);
                }
                toolbar.a.a(toolbar.j);
                toolbar.a.a(udVar);
                toolbar.r = udVar;
            }
        }
    }

    public final void k() {
        Toolbar toolbar = this.a;
        if (toolbar.a != null) {
            toolbar.a.c();
        }
    }

    public final int l() {
        return this.e;
    }

    public final void a(int i) {
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
                    this.a.a(this.b);
                    this.a.b(this.l);
                } else {
                    this.a.a(null);
                    this.a.b(null);
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

    public final void a(zs zsVar) {
        if (this.f != null && this.f.getParent() == this.a) {
            this.a.removeView(this.f);
        }
        this.f = zsVar;
    }

    public final void a(boolean z) {
        Toolbar toolbar = this.a;
        toolbar.v = z;
        toolbar.requestLayout();
    }

    public final int m() {
        return 0;
    }

    public final void a(View view) {
        if (!(this.g == null || (this.e & 16) == 0)) {
            this.a.removeView(this.g);
        }
        this.g = view;
        if (view != null && (this.e & 16) != 0) {
            this.a.addView(this.g);
        }
    }

    public final View n() {
        return this.g;
    }

    public final lv a(int i, long j) {
        return kn.l(this.a).a(i == 0 ? 1.0f : 0.0f).a(j).a(new aaq(this, i));
    }

    private final void r() {
        if ((this.e & 4) != 0) {
            this.a.b(this.j != null ? this.j : this.q);
        } else {
            this.a.b(null);
        }
    }

    private final void s() {
        if ((this.e & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.m)) {
            CharSequence text;
            Toolbar toolbar = this.a;
            int i = this.p;
            if (i != 0) {
                text = toolbar.getContext().getText(i);
            } else {
                text = null;
            }
            toolbar.c(text);
            return;
        }
        this.a.c(this.m);
    }

    public final void a(Drawable drawable) {
        this.a.setBackgroundDrawable(drawable);
    }

    public final int o() {
        return this.a.getVisibility();
    }

    public final void a(tk tkVar, sv svVar) {
        Toolbar toolbar = this.a;
        toolbar.t = tkVar;
        toolbar.u = svVar;
        if (toolbar.a != null) {
            toolbar.a.a(tkVar, svVar);
        }
    }

    public final Menu p() {
        Toolbar toolbar = this.a;
        toolbar.f();
        if (toolbar.a.a == null) {
            su suVar = (su) toolbar.a.b();
            if (toolbar.s == null) {
                toolbar.s = new aak(toolbar);
            }
            toolbar.a.c.h = true;
            suVar.a(toolbar.s, toolbar.i);
        }
        return toolbar.a.b();
    }
}
