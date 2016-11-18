package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;

final class aac {
    private final View f10a;
    private final aai f11b;
    private int f12c = -1;
    private aad f13d;
    private aad f14e;
    private aad f15f;

    aac(View view) {
        this.f10a = view;
        this.f11b = aai.m66a();
    }

    void m45a(AttributeSet attributeSet, int i) {
        afp a = afp.m927a(this.f10a.getContext(), attributeSet, wi.dR, i, 0);
        try {
            if (a.m944g(wi.dS)) {
                this.f12c = a.m943g(wi.dS, -1);
                ColorStateList b = this.f11b.m83b(this.f10a.getContext(), this.f12c);
                if (b != null) {
                    m39b(b);
                }
            }
            if (a.m944g(wi.dT)) {
                oa.a.a(this.f10a, a.m940e(wi.dT));
            }
            if (a.m944g(wi.dU)) {
                oa.a.a(this.f10a, aci.m376a(a.m929a(wi.dU, -1), null));
            }
            a.m931a();
        } catch (Throwable th) {
            a.m931a();
        }
    }

    void m42a(int i) {
        this.f12c = i;
        m39b(this.f11b != null ? this.f11b.m83b(this.f10a.getContext(), i) : null);
        if (m40e()) {
            m48d();
        }
    }

    void m41a() {
        this.f12c = -1;
        m39b(null);
        if (m40e()) {
            m48d();
        }
    }

    void m43a(ColorStateList colorStateList) {
        if (this.f14e == null) {
            this.f14e = new aad();
        }
        this.f14e.f20a = colorStateList;
        this.f14e.b = null;
        this.f14e.e = true;
        if (m40e()) {
            m48d();
        }
    }

    private boolean m40e() {
        if (this.f14e != null && this.f14e.e) {
            if (this.f12c >= 0) {
                ColorStateList a = this.f11b.m78a(this.f10a.getContext(), this.f12c, this.f14e.f20a);
                if (a != null) {
                    this.f14e.b = a;
                    return true;
                }
            }
            if (this.f14e.b != this.f14e.f20a) {
                this.f14e.b = this.f14e.f20a;
                return true;
            }
        }
        return false;
    }

    ColorStateList m46b() {
        return this.f14e != null ? this.f14e.b : null;
    }

    void m44a(Mode mode) {
        if (this.f14e == null) {
            this.f14e = new aad();
        }
        this.f14e.c = mode;
        this.f14e.d = true;
        m48d();
    }

    Mode m47c() {
        return this.f14e != null ? this.f14e.c : null;
    }

    void m48d() {
        boolean z = true;
        Drawable background = this.f10a.getBackground();
        if (background != null) {
            if (VERSION.SDK_INT == 21) {
                if (this.f15f == null) {
                    this.f15f = new aad();
                }
                afn afn = this.f15f;
                afn.mo5a();
                ColorStateList E = oa.a.E(this.f10a);
                if (E != null) {
                    afn.f19e = true;
                    afn.f16b = E;
                }
                Mode F = oa.a.F(this.f10a);
                if (F != null) {
                    afn.f18d = true;
                    afn.f17c = F;
                }
                if (afn.f19e || afn.f18d) {
                    aai.m71a(background, afn, this.f10a.getDrawableState());
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
            if (this.f14e != null) {
                aai.m71a(background, this.f14e, this.f10a.getDrawableState());
            } else if (this.f13d != null) {
                aai.m71a(background, this.f13d, this.f10a.getDrawableState());
            }
        }
    }

    private void m39b(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f13d == null) {
                this.f13d = new aad();
            }
            this.f13d.b = colorStateList;
            this.f13d.e = true;
        } else {
            this.f13d = null;
        }
        m48d();
    }
}
