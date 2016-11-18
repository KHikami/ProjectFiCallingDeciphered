package p000;

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
    private static final Interpolator f35437r = new AccelerateInterpolator();
    private static final Interpolator f35438s = new DecelerateInterpolator();
    private static final boolean f35439t = (VERSION.SDK_INT >= 14);
    private boolean f35440A;
    private boolean f35441B;
    private ArrayList<tr> f35442C = new ArrayList();
    private boolean f35443D;
    private int f35444E = 0;
    private boolean f35445F;
    private boolean f35446G = true;
    private boolean f35447H;
    Context f35448a;
    ActionBarOverlayLayout f35449b;
    public ActionBarContainer f35450c;
    abv f35451d;
    ActionBarContextView f35452e;
    View f35453f;
    wh f35454g;
    wx f35455h;
    wy f35456i;
    boolean f35457j = true;
    boolean f35458k;
    boolean f35459l;
    xh f35460m;
    boolean f35461n;
    final py f35462o = new wf(this);
    final py f35463p = new wg(this);
    final qa f35464q = new qa(this);
    private Context f35465u;
    private Activity f35466v;
    private Dialog f35467w;
    private aez f35468x;
    private ArrayList<Object> f35469y = new ArrayList();
    private int f35470z = -1;

    public we(Activity activity, boolean z) {
        this.f35466v = activity;
        View decorView = activity.getWindow().getDecorView();
        m41113b(decorView);
        if (!z) {
            this.f35453f = decorView.findViewById(16908290);
        }
    }

    public we(Dialog dialog) {
        this.f35467w = dialog;
        m41113b(dialog.getWindow().getDecorView());
    }

    private void m41113b(View view) {
        abv abv;
        this.f35449b = (ActionBarOverlayLayout) view.findViewById(gwb.bx);
        if (this.f35449b != null) {
            this.f35449b.a(this);
        }
        View findViewById = view.findViewById(gwb.bj);
        if (findViewById instanceof abv) {
            abv = (abv) findViewById;
        } else if (findViewById instanceof Toolbar) {
            abv = ((Toolbar) findViewById).u();
        } else {
            throw new IllegalStateException(new StringBuilder("Can't make a decor toolbar out of ").append(findViewById).toString() != null ? findViewById.getClass().getSimpleName() : "null");
        }
        this.f35451d = abv;
        this.f35452e = (ActionBarContextView) view.findViewById(gwb.bo);
        this.f35450c = (ActionBarContainer) view.findViewById(gwb.bl);
        if (this.f35451d == null || this.f35452e == null || this.f35450c == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f35448a = this.f35451d.b();
        if ((this.f35451d.l() & 4) != 0) {
            this.f35440A = true;
        }
        ww a = ww.m41243a(this.f35448a);
        a.m41249f();
        m41114m(a.m41247d());
        TypedArray obtainStyledAttributes = this.f35448a.obtainStyledAttributes(null, wi.a, gwb.s, 0);
        if (obtainStyledAttributes.getBoolean(wi.k, false)) {
            mo4481e(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(wi.i, 0);
        if (dimensionPixelSize != 0) {
            mo4448a((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public void mo4448a(float f) {
        oa.m37358f(this.f35450c, f);
    }

    public void mo4450a(Configuration configuration) {
        m41114m(ww.m41243a(this.f35448a).m41247d());
    }

    private void m41114m(boolean z) {
        boolean z2;
        boolean z3;
        boolean z4 = true;
        this.f35443D = z;
        if (this.f35443D) {
            this.f35450c.a(null);
            this.f35451d.a(this.f35468x);
        } else {
            this.f35451d.a(null);
            this.f35450c.a(this.f35468x);
        }
        if (m41154m() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f35468x != null) {
            if (z2) {
                this.f35468x.setVisibility(0);
                if (this.f35449b != null) {
                    oa.m37368o(this.f35449b);
                }
            } else {
                this.f35468x.setVisibility(8);
            }
        }
        abv abv = this.f35451d;
        if (this.f35443D || !z2) {
            z3 = false;
        } else {
            z3 = true;
        }
        abv.a(z3);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f35449b;
        if (this.f35443D || !z2) {
            z4 = false;
        }
        actionBarOverlayLayout.b(z4);
    }

    void m41152l() {
        if (this.f35456i != null) {
            this.f35456i.mo4443a(this.f35455h);
            this.f35455h = null;
            this.f35456i = null;
        }
    }

    public void mo4480d(int i) {
        this.f35444E = i;
    }

    public void mo4472g(boolean z) {
        this.f35447H = z;
        if (!z && this.f35460m != null) {
            this.f35460m.m41304b();
        }
    }

    public void mo4454a(tr trVar) {
        this.f35442C.add(trVar);
    }

    public void mo4461b(tr trVar) {
        this.f35442C.remove(trVar);
    }

    public void mo4473h(boolean z) {
        if (z != this.f35441B) {
            this.f35441B = z;
            int size = this.f35442C.size();
            for (int i = 0; i < size; i++) {
                ((tr) this.f35442C.get(i)).m40813a(z);
            }
        }
    }

    public void mo4455a(boolean z) {
        m41120a(2, 2);
    }

    public void mo4462b(boolean z) {
        m41120a(z ? 4 : 0, 4);
    }

    public void mo4466c(boolean z) {
        m41120a(0, 8);
    }

    public void mo4468d(boolean z) {
        m41120a(16, 16);
    }

    public void mo4449a(int i) {
        mo4453a(this.f35448a.getString(i));
    }

    public void mo4453a(CharSequence charSequence) {
        this.f35451d.b(charSequence);
    }

    public void mo4465c(CharSequence charSequence) {
        this.f35451d.a(charSequence);
    }

    public boolean mo4476j() {
        ViewGroup a = this.f35451d.a();
        if (a == null || a.hasFocus()) {
            return false;
        }
        a.requestFocus();
        return true;
    }

    public void mo4460b(CharSequence charSequence) {
        this.f35451d.c(charSequence);
    }

    public void m41120a(int i, int i2) {
        int l = this.f35451d.l();
        if ((i2 & 4) != 0) {
            this.f35440A = true;
        }
        this.f35451d.a((l & (i2 ^ -1)) | (i & i2));
    }

    public View mo4447a() {
        return this.f35451d.n();
    }

    public int m41154m() {
        return this.f35451d.m();
    }

    public int mo4457b() {
        return this.f35451d.l();
    }

    public wx mo4479a(wy wyVar) {
        if (this.f35454g != null) {
            this.f35454g.mo4495c();
        }
        this.f35449b.c(false);
        this.f35452e.e();
        wx whVar = new wh(this, this.f35452e.getContext(), wyVar);
        if (!whVar.m41190e()) {
            return null;
        }
        this.f35454g = whVar;
        whVar.mo4496d();
        this.f35452e.a(whVar);
        m41153l(true);
        this.f35452e.sendAccessibilityEvent(32);
        return whVar;
    }

    public int m41155n() {
        return this.f35450c.getHeight();
    }

    public void mo4483i(boolean z) {
        this.f35457j = z;
    }

    public void mo4463c() {
        if (this.f35458k) {
            this.f35458k = false;
            m41115n(false);
        }
    }

    public void mo4484o() {
        if (this.f35459l) {
            this.f35459l = false;
            m41115n(true);
        }
    }

    public void mo4467d() {
        if (!this.f35458k) {
            this.f35458k = true;
            m41115n(false);
        }
    }

    public void mo4485p() {
        if (!this.f35459l) {
            this.f35459l = true;
            m41115n(true);
        }
    }

    public void mo4481e(boolean z) {
        if (this.f35449b.a()) {
            this.f35461n = true;
            this.f35449b.c(true);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    public int mo4482g() {
        return this.f35449b.e();
    }

    static boolean m41112a(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        if (z || z2) {
            return false;
        }
        return true;
    }

    private void m41115n(boolean z) {
        if (we.m41112a(this.f35458k, this.f35459l, this.f35445F)) {
            if (!this.f35446G) {
                this.f35446G = true;
                m41149j(z);
            }
        } else if (this.f35446G) {
            this.f35446G = false;
            m41151k(z);
        }
    }

    public void m41149j(boolean z) {
        if (this.f35460m != null) {
            this.f35460m.m41304b();
        }
        this.f35450c.setVisibility(0);
        if (this.f35444E == 0 && f35439t && (this.f35447H || z)) {
            oa.m37344b(this.f35450c, 0.0f);
            float f = (float) (-this.f35450c.getHeight());
            if (z) {
                int[] iArr = new int[]{0, 0};
                this.f35450c.getLocationInWindow(iArr);
                f -= (float) iArr[1];
            }
            oa.m37344b(this.f35450c, f);
            xh xhVar = new xh();
            pn c = oa.m37366m(this.f35450c).m40280c(0.0f);
            c.m40276a(this.f35464q);
            xhVar.m41300a(c);
            if (this.f35457j && this.f35453f != null) {
                oa.m37344b(this.f35453f, f);
                xhVar.m41300a(oa.m37366m(this.f35453f).m40280c(0.0f));
            }
            xhVar.m41299a(f35438s);
            xhVar.m41298a(250);
            xhVar.m41302a(this.f35463p);
            this.f35460m = xhVar;
            xhVar.m41303a();
        } else {
            oa.m37348c(this.f35450c, 1.0f);
            oa.m37344b(this.f35450c, 0.0f);
            if (this.f35457j && this.f35453f != null) {
                oa.m37344b(this.f35453f, 0.0f);
            }
            this.f35463p.b(null);
        }
        if (this.f35449b != null) {
            oa.m37368o(this.f35449b);
        }
    }

    public void m41151k(boolean z) {
        if (this.f35460m != null) {
            this.f35460m.m41304b();
        }
        if (this.f35444E == 0 && f35439t && (this.f35447H || z)) {
            oa.m37348c(this.f35450c, 1.0f);
            this.f35450c.a(true);
            xh xhVar = new xh();
            float f = (float) (-this.f35450c.getHeight());
            if (z) {
                int[] iArr = new int[]{0, 0};
                this.f35450c.getLocationInWindow(iArr);
                f -= (float) iArr[1];
            }
            pn c = oa.m37366m(this.f35450c).m40280c(f);
            c.m40276a(this.f35464q);
            xhVar.m41300a(c);
            if (this.f35457j && this.f35453f != null) {
                xhVar.m41300a(oa.m37366m(this.f35453f).m40280c(f));
            }
            xhVar.m41299a(f35437r);
            xhVar.m41298a(250);
            xhVar.m41302a(this.f35462o);
            this.f35460m = xhVar;
            xhVar.m41303a();
            return;
        }
        this.f35462o.b(null);
    }

    public boolean mo4469e() {
        int n = m41155n();
        return this.f35446G && (n == 0 || mo4482g() < n);
    }

    public void m41153l(boolean z) {
        if (z) {
            if (!this.f35445F) {
                this.f35445F = true;
                if (this.f35449b != null) {
                    this.f35449b.b();
                }
                m41115n(false);
            }
        } else if (this.f35445F) {
            this.f35445F = false;
            if (this.f35449b != null) {
                this.f35449b.b();
            }
            m41115n(false);
        }
        if (oa.m37370q(this.f35450c)) {
            pn a;
            pn a2;
            if (z) {
                a = this.f35451d.a(4, 100);
                a2 = this.f35452e.a(0, 200);
            } else {
                a2 = this.f35451d.a(0, 200);
                a = this.f35452e.a(8, 100);
            }
            xh xhVar = new xh();
            xhVar.m41301a(a, a2);
            xhVar.m41303a();
        } else if (z) {
            this.f35451d.d(4);
            this.f35452e.setVisibility(0);
        } else {
            this.f35451d.d(0);
            this.f35452e.setVisibility(8);
        }
    }

    public Context mo4470f() {
        if (this.f35465u == null) {
            TypedValue typedValue = new TypedValue();
            this.f35448a.getTheme().resolveAttribute(gwb.w, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f35465u = new ContextThemeWrapper(this.f35448a, i);
            } else {
                this.f35465u = this.f35448a;
            }
        }
        return this.f35465u;
    }

    public void mo4459b(Drawable drawable) {
        this.f35451d.b(drawable);
    }

    public void mo4458b(int i) {
        this.f35451d.b(i);
    }

    public void mo4464c(int i) {
        this.f35451d.c(i);
    }

    public void mo4486q() {
        if (this.f35460m != null) {
            this.f35460m.m41304b();
            this.f35460m = null;
        }
    }

    public boolean mo4475i() {
        if (this.f35451d == null || !this.f35451d.c()) {
            return false;
        }
        this.f35451d.d();
        return true;
    }

    public void mo4452a(View view) {
        this.f35451d.a(view);
    }

    public void mo4451a(Drawable drawable) {
        this.f35451d.a(null);
    }

    public void mo4471f(boolean z) {
        if (!this.f35440A) {
            mo4462b(z);
        }
    }
}
