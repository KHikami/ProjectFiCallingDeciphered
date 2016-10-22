package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import oa;

/* renamed from: aac */
final class aac {
    private final View a;
    private final aai b;
    private int c;
    private aad d;
    private aad e;
    private aad f;

    aac(View view) {
        this.c = -1;
        this.a = view;
        this.b = aai.a();
    }

    void a(AttributeSet attributeSet, int i) {
        afp a = afp.a(this.a.getContext(), attributeSet, wi.dR, i, 0);
        try {
            if (a.g(wi.dS)) {
                this.c = a.g(wi.dS, -1);
                ColorStateList b = this.b.b(this.a.getContext(), this.c);
                if (b != null) {
                    b(b);
                }
            }
            if (a.g(wi.dT)) {
                oa.a.a(this.a, a.e(wi.dT));
            }
            if (a.g(wi.dU)) {
                oa.a.a(this.a, aci.a(a.a(wi.dU, -1), null));
            }
            a.a();
        } catch (Throwable th) {
            a.a();
        }
    }

    void a(int i) {
        this.c = i;
        b(this.b != null ? this.b.b(this.a.getContext(), i) : null);
        if (e()) {
            d();
        }
    }

    void a() {
        this.c = -1;
        b(null);
        if (e()) {
            d();
        }
    }

    void a(ColorStateList colorStateList) {
        if (this.e == null) {
            this.e = new aad();
        }
        this.e.a = colorStateList;
        this.e.b = null;
        this.e.e = true;
        if (e()) {
            d();
        }
    }

    private boolean e() {
        if (this.e != null && this.e.e) {
            if (this.c >= 0) {
                ColorStateList a = this.b.a(this.a.getContext(), this.c, this.e.a);
                if (a != null) {
                    this.e.b = a;
                    return true;
                }
            }
            if (this.e.b != this.e.a) {
                this.e.b = this.e.a;
                return true;
            }
        }
        return false;
    }

    ColorStateList b() {
        return this.e != null ? this.e.b : null;
    }

    void a(Mode mode) {
        if (this.e == null) {
            this.e = new aad();
        }
        this.e.c = mode;
        this.e.d = true;
        d();
    }

    Mode c() {
        return this.e != null ? this.e.c : null;
    }

    void d() {
        boolean z = true;
        Drawable background = this.a.getBackground();
        if (background != null) {
            if (VERSION.SDK_INT == 21) {
                if (this.f == null) {
                    this.f = new aad();
                }
                afn afn = this.f;
                afn.a();
                ColorStateList E = oa.a.E(this.a);
                if (E != null) {
                    afn.e = true;
                    afn.b = E;
                }
                Mode F = oa.a.F(this.a);
                if (F != null) {
                    afn.d = true;
                    afn.c = F;
                }
                if (afn.e || afn.d) {
                    aai.a(background, afn, this.a.getDrawableState());
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
            if (this.e != null) {
                aai.a(background, this.e, this.a.getDrawableState());
            } else if (this.d != null) {
                aai.a(background, this.d, this.a.getDrawableState());
            }
        }
    }

    private void b(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new aad();
            }
            this.d.b = colorStateList;
            this.d.e = true;
        } else {
            this.d = null;
        }
        d();
    }
}
