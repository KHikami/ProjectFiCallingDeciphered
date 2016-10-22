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
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: rg */
public class rg extends pl implements ub {
    private static final Interpolator n;
    private static final Interpolator o;
    private static final boolean p;
    private mg A;
    private mi B;
    Context a;
    ActionBarOverlayLayout b;
    public ActionBarContainer c;
    wv d;
    ActionBarContextView e;
    View f;
    rj g;
    rt h;
    ru i;
    boolean j;
    boolean k;
    sd l;
    boolean m;
    private Context q;
    private boolean r;
    private boolean s;
    private ArrayList t;
    private boolean u;
    private int v;
    private boolean w;
    private boolean x;
    private boolean y;
    private mg z;

    static {
        n = new AccelerateInterpolator();
        o = new DecelerateInterpolator();
        p = VERSION.SDK_INT >= 14;
    }

    public rg(Activity activity, boolean z) {
        ArrayList arrayList = new ArrayList();
        this.t = new ArrayList();
        this.v = 0;
        this.j = true;
        this.x = true;
        this.z = new rh(this);
        this.A = new ri(this);
        this.B = new mi(this);
        View decorView = activity.getWindow().getDecorView();
        a(decorView);
        if (!z) {
            this.f = decorView.findViewById(16908290);
        }
    }

    public rg(Dialog dialog) {
        ArrayList arrayList = new ArrayList();
        this.t = new ArrayList();
        this.v = 0;
        this.j = true;
        this.x = true;
        this.z = new rh(this);
        this.A = new ri(this);
        this.B = new mi(this);
        a(dialog.getWindow().getDecorView());
    }

    private final void a(View view) {
        View view2;
        wv wvVar;
        this.b = (ActionBarOverlayLayout) view.findViewById(buf.bq);
        if (this.b != null) {
            view2 = this.b;
            view2.g = this;
            if (view2.getWindowToken() != null) {
                view2.g.d(view2.a);
                if (view2.f != 0) {
                    view2.onWindowSystemUiVisibilityChanged(view2.f);
                    kn.n(view2);
                }
            }
        }
        view2 = view.findViewById(buf.bc);
        if (view2 instanceof wv) {
            wvVar = (wv) view2;
        } else if (view2 instanceof Toolbar) {
            wvVar = ((Toolbar) view2).i();
        } else {
            throw new IllegalStateException(new StringBuilder("Can't make a decor toolbar out of ").append(view2).toString() != null ? view2.getClass().getSimpleName() : "null");
        }
        this.d = wvVar;
        this.e = (ActionBarContextView) view.findViewById(buf.bh);
        this.c = (ActionBarContainer) view.findViewById(buf.be);
        if (this.d == null || this.e == null || this.c == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        TypedArray obtainStyledAttributes;
        this.a = this.d.b();
        if ((this.d.l() & 4) != 0) {
            this.r = true;
        }
        rs a = rs.a(this.a);
        if (a.a.getApplicationInfo().targetSdkVersion < 14) {
            j(a.b());
            obtainStyledAttributes = this.a.obtainStyledAttributes(null, rk.a, buf.q, 0);
        } else {
            j(a.b());
            obtainStyledAttributes = this.a.obtainStyledAttributes(null, rk.a, buf.q, 0);
        }
        if (obtainStyledAttributes.getBoolean(rk.m, false)) {
            if (this.b.c) {
                this.m = true;
                this.b.a(true);
            } else {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(rk.k, 0);
        if (dimensionPixelSize != 0) {
            a((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void a(float f) {
        kn.d(this.c, f);
    }

    public final void a(Configuration configuration) {
        j(rs.a(this.a).b());
    }

    private final void j(boolean z) {
        boolean z2;
        boolean z3 = true;
        this.u = z;
        if (this.u) {
            this.c.a(null);
            this.d.a(null);
        } else {
            this.d.a(null);
            this.c.a(null);
        }
        if (this.d.m() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        wv wvVar = this.d;
        boolean z4 = !this.u && z2;
        wvVar.a(z4);
        ActionBarOverlayLayout actionBarOverlayLayout = this.b;
        if (this.u || !z2) {
            z3 = false;
        }
        actionBarOverlayLayout.d = z3;
    }

    public final void d(int i) {
        this.v = i;
    }

    public final void f(boolean z) {
        this.y = z;
        if (!z && this.l != null) {
            this.l.b();
        }
    }

    public final void g(boolean z) {
        if (z != this.s) {
            this.s = z;
            int size = this.t.size();
            for (int i = 0; i < size; i++) {
                this.t.get(i);
            }
        }
    }

    public final void a(int i) {
        this.d.a(LayoutInflater.from(d()).inflate(i, this.d.a(), false));
    }

    public final void a(boolean z) {
        a(z ? 2 : 0, 2);
    }

    public final void b(boolean z) {
        a(z ? 4 : 0, 4);
    }

    public final void c(boolean z) {
        a(8, 8);
    }

    public final void d(boolean z) {
        a(z ? 16 : 0, 16);
    }

    public final void b(int i) {
        this.d.b(this.a.getString(i));
    }

    public final void a(CharSequence charSequence) {
        this.d.a(charSequence);
    }

    public final boolean g() {
        ViewGroup a = this.d.a();
        if (a == null || a.hasFocus()) {
            return false;
        }
        a.requestFocus();
        return true;
    }

    private void a(int i, int i2) {
        int l = this.d.l();
        if ((i2 & 4) != 0) {
            this.r = true;
        }
        this.d.a((l & (i2 ^ -1)) | (i & i2));
    }

    public final void a(Drawable drawable) {
        boolean z = true;
        ActionBarContainer actionBarContainer = this.c;
        if (actionBarContainer.c != null) {
            actionBarContainer.c.setCallback(null);
            actionBarContainer.unscheduleDrawable(actionBarContainer.c);
        }
        actionBarContainer.c = drawable;
        if (drawable != null) {
            drawable.setCallback(actionBarContainer);
            if (actionBarContainer.b != null) {
                actionBarContainer.c.setBounds(actionBarContainer.b.getLeft(), actionBarContainer.b.getTop(), actionBarContainer.b.getRight(), actionBarContainer.b.getBottom());
            }
        }
        if (actionBarContainer.f) {
            if (actionBarContainer.e != null) {
                z = false;
            }
        } else if (!(actionBarContainer.c == null && actionBarContainer.d == null)) {
            z = false;
        }
        actionBarContainer.setWillNotDraw(z);
        actionBarContainer.invalidate();
    }

    public final View a() {
        return this.d.n();
    }

    public final int b() {
        return this.d.l();
    }

    public final rt a(ru ruVar) {
        if (this.g != null) {
            this.g.c();
        }
        this.b.a(false);
        this.e.b();
        rt rjVar = new rj(this, this.e.getContext(), ruVar);
        if (!rjVar.e()) {
            return null;
        }
        this.g = rjVar;
        rjVar.d();
        this.e.a(rjVar);
        i(true);
        this.e.sendAccessibilityEvent(32);
        return rjVar;
    }

    public final void h(boolean z) {
        this.j = z;
    }

    public final void i() {
        if (this.k) {
            this.k = false;
            k(true);
        }
    }

    public final void j() {
        if (!this.k) {
            this.k = true;
            k(true);
        }
    }

    public final void c(int i) {
        if (i == 0 || this.b.c) {
            this.b.a(i);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to set a non-zero hide offset");
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

    private final void k(boolean z) {
        float f;
        sd sdVar;
        lv c;
        if (rg.a(false, this.k, this.w)) {
            if (!this.x) {
                this.x = true;
                if (this.l != null) {
                    this.l.b();
                }
                this.c.setVisibility(0);
                if (this.v == 0 && p && (this.y || z)) {
                    kn.b(this.c, 0.0f);
                    f = (float) (-this.c.getHeight());
                    if (z) {
                        int[] iArr = new int[]{0, 0};
                        this.c.getLocationInWindow(iArr);
                        f -= (float) iArr[1];
                    }
                    kn.b(this.c, f);
                    sdVar = new sd();
                    c = kn.l(this.c).c(0.0f);
                    c.a(this.B);
                    sdVar.a(c);
                    if (this.j && this.f != null) {
                        kn.b(this.f, f);
                        sdVar.a(kn.l(this.f).c(0.0f));
                    }
                    sdVar.a(o);
                    sdVar.a(250);
                    sdVar.a(this.A);
                    this.l = sdVar;
                    sdVar.a();
                } else {
                    kn.c(this.c, 1.0f);
                    kn.b(this.c, 0.0f);
                    if (this.j && this.f != null) {
                        kn.b(this.f, 0.0f);
                    }
                    this.A.b(null);
                }
                if (this.b != null) {
                    kn.n(this.b);
                }
            }
        } else if (this.x) {
            this.x = false;
            if (this.l != null) {
                this.l.b();
            }
            if (this.v == 0 && p && (this.y || z)) {
                kn.c(this.c, 1.0f);
                this.c.a(true);
                sdVar = new sd();
                f = (float) (-this.c.getHeight());
                if (z) {
                    int[] iArr2 = new int[]{0, 0};
                    this.c.getLocationInWindow(iArr2);
                    f -= (float) iArr2[1];
                }
                c = kn.l(this.c).c(f);
                c.a(this.B);
                sdVar.a(c);
                if (this.j && this.f != null) {
                    sdVar.a(kn.l(this.f).c(f));
                }
                sdVar.a(n);
                sdVar.a(250);
                sdVar.a(this.z);
                this.l = sdVar;
                sdVar.a();
                return;
            }
            this.z.b(null);
        }
    }

    public final void i(boolean z) {
        lv a;
        lv a2;
        long a3;
        if (z) {
            if (!this.w) {
                this.w = true;
                if (this.b != null) {
                    ActionBarOverlayLayout.a();
                }
                k(false);
            }
        } else if (this.w) {
            this.w = false;
            if (this.b != null) {
                ActionBarOverlayLayout.a();
            }
            k(false);
        }
        if (z) {
            a = this.d.a(4, 100);
            a2 = this.e.a(0, 200);
        } else {
            a2 = this.d.a(0, 200);
            a = this.e.a(8, 100);
        }
        sd sdVar = new sd();
        sdVar.a.add(a);
        View view = (View) a.a.get();
        if (view != null) {
            a3 = lv.e.a(view);
        } else {
            a3 = 0;
        }
        a2.b(a3);
        sdVar.a.add(a2);
        sdVar.a();
    }

    public final Context d() {
        if (this.q == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(buf.u, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.q = new ContextThemeWrapper(this.a, i);
            } else {
                this.q = this.a;
            }
        }
        return this.q;
    }

    public final void k() {
        if (this.l != null) {
            this.l.b();
            this.l = null;
        }
    }

    public final boolean f() {
        if (this.d == null || !this.d.c()) {
            return false;
        }
        this.d.d();
        return true;
    }

    public final void e(boolean z) {
        if (!this.r) {
            b(z);
        }
    }

    public final boolean c() {
        int height = this.c.getHeight();
        return this.x && (height == 0 || this.b.b() < height);
    }
}
