package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.util.ArrayList;

public class we extends tp implements zf {
    private static final Interpolator r = new AccelerateInterpolator();
    private static final Interpolator s = new DecelerateInterpolator();
    private static final boolean t = (VERSION.SDK_INT >= 14);
    private boolean A;
    private boolean B;
    private ArrayList<tr> C = new ArrayList();
    private boolean D;
    private int E = 0;
    private boolean F;
    private boolean G = true;
    private boolean H;
    Context a;
    ActionBarOverlayLayout b;
    public ActionBarContainer c;
    abv d;
    ActionBarContextView e;
    View f;
    wh g;
    wx h;
    wy i;
    boolean j = true;
    boolean k;
    boolean l;
    xh m;
    boolean n;
    final py o = new wf(this);
    final py p = new wg(this);
    final qa q = new qa(this);
    private Context u;
    private Activity v;
    private Dialog w;
    private aez x;
    private ArrayList<Object> y = new ArrayList();
    private int z = -1;

    public we(Activity activity, boolean z) {
        this.v = activity;
        View decorView = activity.getWindow().getDecorView();
        b(decorView);
        if (!z) {
            this.f = decorView.findViewById(16908290);
        }
    }

    public we(Dialog dialog) {
        this.w = dialog;
        b(dialog.getWindow().getDecorView());
    }

    private void b(View view) {
        abv abv;
        this.b = (ActionBarOverlayLayout) view.findViewById(gwb.bx);
        if (this.b != null) {
            this.b.a(this);
        }
        View findViewById = view.findViewById(gwb.bj);
        if (findViewById instanceof abv) {
            abv = (abv) findViewById;
        } else if (findViewById instanceof Toolbar) {
            abv = ((Toolbar) findViewById).u();
        } else {
            throw new IllegalStateException(new StringBuilder("Can't make a decor toolbar out of ").append(findViewById).toString() != null ? findViewById.getClass().getSimpleName() : "null");
        }
        this.d = abv;
        this.e = (ActionBarContextView) view.findViewById(gwb.bo);
        this.c = (ActionBarContainer) view.findViewById(gwb.bl);
        if (this.d == null || this.e == null || this.c == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.a = this.d.b();
        if ((this.d.l() & 4) != 0) {
            this.A = true;
        }
        ww a = ww.a(this.a);
        a.f();
        m(a.d());
        TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(null, wi.a, gwb.s, 0);
        if (obtainStyledAttributes.getBoolean(wi.k, false)) {
            e(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(wi.i, 0);
        if (dimensionPixelSize != 0) {
            a((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public void a(float f) {
        oa.f(this.c, f);
    }

    public void a(Configuration configuration) {
        m(ww.a(this.a).d());
    }

    private void m(boolean z) {
        boolean z2;
        boolean z3;
        boolean z4 = true;
        this.D = z;
        if (this.D) {
            this.c.a(null);
            this.d.a(this.x);
        } else {
            this.d.a(null);
            this.c.a(this.x);
        }
        if (m() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.x != null) {
            if (z2) {
                this.x.setVisibility(0);
                if (this.b != null) {
                    oa.o(this.b);
                }
            } else {
                this.x.setVisibility(8);
            }
        }
        abv abv = this.d;
        if (this.D || !z2) {
            z3 = false;
        } else {
            z3 = true;
        }
        abv.a(z3);
        ActionBarOverlayLayout actionBarOverlayLayout = this.b;
        if (this.D || !z2) {
            z4 = false;
        }
        actionBarOverlayLayout.b(z4);
    }

    void l() {
        if (this.i != null) {
            this.i.a(this.h);
            this.h = null;
            this.i = null;
        }
    }

    public void d(int i) {
        this.E = i;
    }

    public void g(boolean z) {
        this.H = z;
        if (!z && this.m != null) {
            this.m.b();
        }
    }

    public void a(tr trVar) {
        this.C.add(trVar);
    }

    public void b(tr trVar) {
        this.C.remove(trVar);
    }

    public void h(boolean z) {
        if (z != this.B) {
            this.B = z;
            int size = this.C.size();
            for (int i = 0; i < size; i++) {
                ((tr) this.C.get(i)).a(z);
            }
        }
    }

    public void a(boolean z) {
        a(2, 2);
    }

    public void b(boolean z) {
        a(z ? 4 : 0, 4);
    }

    public void c(boolean z) {
        a(0, 8);
    }

    public void d(boolean z) {
        a(16, 16);
    }

    public void a(int i) {
        a(this.a.getString(i));
    }

    public void a(CharSequence charSequence) {
        this.d.b(charSequence);
    }

    public void c(CharSequence charSequence) {
        this.d.a(charSequence);
    }

    public boolean j() {
        ViewGroup a = this.d.a();
        if (a == null || a.hasFocus()) {
            return false;
        }
        a.requestFocus();
        return true;
    }

    public void b(CharSequence charSequence) {
        this.d.c(charSequence);
    }

    public void a(int i, int i2) {
        int l = this.d.l();
        if ((i2 & 4) != 0) {
            this.A = true;
        }
        this.d.a((l & (i2 ^ -1)) | (i & i2));
    }

    public View a() {
        return this.d.n();
    }

    public int m() {
        return this.d.m();
    }

    public int b() {
        return this.d.l();
    }

    public wx a(wy wyVar) {
        if (this.g != null) {
            this.g.c();
        }
        this.b.c(false);
        this.e.e();
        wx whVar = new wh(this, this.e.getContext(), wyVar);
        if (!whVar.e()) {
            return null;
        }
        this.g = whVar;
        whVar.d();
        this.e.a(whVar);
        l(true);
        this.e.sendAccessibilityEvent(32);
        return whVar;
    }

    public int n() {
        return this.c.getHeight();
    }

    public void i(boolean z) {
        this.j = z;
    }

    public void c() {
        if (this.k) {
            this.k = false;
            n(false);
        }
    }

    public void o() {
        if (this.l) {
            this.l = false;
            n(true);
        }
    }

    public void d() {
        if (!this.k) {
            this.k = true;
            n(false);
        }
    }

    public void p() {
        if (!this.l) {
            this.l = true;
            n(true);
        }
    }

    public void e(boolean z) {
        if (this.b.a()) {
            this.n = true;
            this.b.c(true);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    public int g() {
        return this.b.e();
    }

    static boolean a(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        if (z || z2) {
            return false;
        }
        return true;
    }

    private void n(boolean z) {
        if (we.a(this.k, this.l, this.F)) {
            if (!this.G) {
                this.G = true;
                j(z);
            }
        } else if (this.G) {
            this.G = false;
            k(z);
        }
    }

    public void j(boolean z) {
        if (this.m != null) {
            this.m.b();
        }
        this.c.setVisibility(0);
        if (this.E == 0 && t && (this.H || z)) {
            oa.b(this.c, 0.0f);
            float f = (float) (-this.c.getHeight());
            if (z) {
                int[] iArr = new int[]{0, 0};
                this.c.getLocationInWindow(iArr);
                f -= (float) iArr[1];
            }
            oa.b(this.c, f);
            xh xhVar = new xh();
            pn c = oa.m(this.c).c(0.0f);
            c.a(this.q);
            xhVar.a(c);
            if (this.j && this.f != null) {
                oa.b(this.f, f);
                xhVar.a(oa.m(this.f).c(0.0f));
            }
            xhVar.a(s);
            xhVar.a(250);
            xhVar.a(this.p);
            this.m = xhVar;
            xhVar.a();
        } else {
            oa.c(this.c, 1.0f);
            oa.b(this.c, 0.0f);
            if (this.j && this.f != null) {
                oa.b(this.f, 0.0f);
            }
            this.p.b(null);
        }
        if (this.b != null) {
            oa.o(this.b);
        }
    }

    public void k(boolean z) {
        if (this.m != null) {
            this.m.b();
        }
        if (this.E == 0 && t && (this.H || z)) {
            oa.c(this.c, 1.0f);
            this.c.a(true);
            xh xhVar = new xh();
            float f = (float) (-this.c.getHeight());
            if (z) {
                int[] iArr = new int[]{0, 0};
                this.c.getLocationInWindow(iArr);
                f -= (float) iArr[1];
            }
            pn c = oa.m(this.c).c(f);
            c.a(this.q);
            xhVar.a(c);
            if (this.j && this.f != null) {
                xhVar.a(oa.m(this.f).c(f));
            }
            xhVar.a(r);
            xhVar.a(250);
            xhVar.a(this.o);
            this.m = xhVar;
            xhVar.a();
            return;
        }
        this.o.b(null);
    }

    public boolean e() {
        int n = n();
        return this.G && (n == 0 || g() < n);
    }

    public void l(boolean z) {
        if (z) {
            if (!this.F) {
                this.F = true;
                if (this.b != null) {
                    this.b.b();
                }
                n(false);
            }
        } else if (this.F) {
            this.F = false;
            if (this.b != null) {
                this.b.b();
            }
            n(false);
        }
        if (oa.q(this.c)) {
            pn a;
            pn a2;
            if (z) {
                a = this.d.a(4, 100);
                a2 = this.e.a(0, 200);
            } else {
                a2 = this.d.a(0, 200);
                a = this.e.a(8, 100);
            }
            xh xhVar = new xh();
            xhVar.a(a, a2);
            xhVar.a();
        } else if (z) {
            this.d.d(4);
            this.e.setVisibility(0);
        } else {
            this.d.d(0);
            this.e.setVisibility(8);
        }
    }

    public Context f() {
        if (this.u == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(gwb.w, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.u = new ContextThemeWrapper(this.a, i);
            } else {
                this.u = this.a;
            }
        }
        return this.u;
    }

    public void b(Drawable drawable) {
        this.d.b(drawable);
    }

    public void b(int i) {
        this.d.b(i);
    }

    public void c(int i) {
        this.d.c(i);
    }

    public void q() {
        if (this.m != null) {
            this.m.b();
            this.m = null;
        }
    }

    public boolean i() {
        if (this.d == null || !this.d.c()) {
            return false;
        }
        this.d.d();
        return true;
    }

    public void a(View view) {
        this.d.a(view);
    }

    public void a(Drawable drawable) {
        this.d.a(null);
    }

    public void f(boolean z) {
        if (!this.A) {
            b(z);
        }
    }
}
