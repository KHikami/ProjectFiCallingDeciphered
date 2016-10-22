import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: PG */
final class vd {
    private final View a;
    private final vi b;
    private aaf c;
    private aaf d;
    private aaf e;

    vd(View view, vi viVar) {
        this.a = view;
        this.b = viVar;
    }

    final void a(AttributeSet attributeSet, int i) {
        aah a = aah.a(this.a.getContext(), attributeSet, rk.ce, i, 0);
        try {
            if (a.e(rk.cf)) {
                ColorStateList b = this.b.b(this.a.getContext(), a.g(rk.cf, -1));
                if (b != null) {
                    b(b);
                }
            }
            if (a.e(rk.cg)) {
                kn.a.a(this.a, a.d(rk.cg));
            }
            if (a.e(rk.ch)) {
                kn.a.a(this.a, xi.a(a.a(rk.ch, -1), null));
            }
            a.a.recycle();
        } catch (Throwable th) {
            a.a.recycle();
        }
    }

    final void a(int i) {
        b(this.b != null ? this.b.b(this.a.getContext(), i) : null);
    }

    final void a(ColorStateList colorStateList) {
        if (this.d == null) {
            this.d = new aaf();
        }
        this.d.a = colorStateList;
        this.d.d = true;
        c();
    }

    final ColorStateList a() {
        return this.d != null ? this.d.a : null;
    }

    final void a(Mode mode) {
        if (this.d == null) {
            this.d = new aaf();
        }
        this.d.b = mode;
        this.d.c = true;
        c();
    }

    final Mode b() {
        return this.d != null ? this.d.b : null;
    }

    final void c() {
        boolean z = false;
        Drawable background = this.a.getBackground();
        if (background != null) {
            if (VERSION.SDK_INT == 21) {
                if (this.e == null) {
                    this.e = new aaf();
                }
                aaf aaf = this.e;
                aaf.a = null;
                aaf.d = false;
                aaf.b = null;
                aaf.c = false;
                ColorStateList E = kn.a.E(this.a);
                if (E != null) {
                    aaf.d = true;
                    aaf.a = E;
                }
                Mode F = kn.a.F(this.a);
                if (F != null) {
                    aaf.c = true;
                    aaf.b = F;
                }
                if (aaf.d || aaf.c) {
                    vi.a(background, aaf, this.a.getDrawableState());
                    z = true;
                }
                if (z) {
                    return;
                }
            }
            if (this.d != null) {
                vi.a(background, this.d, this.a.getDrawableState());
            } else if (this.c != null) {
                vi.a(background, this.c, this.a.getDrawableState());
            }
        }
    }

    final void b(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.c == null) {
                this.c = new aaf();
            }
            this.c.a = colorStateList;
            this.c.d = true;
        } else {
            this.c = null;
        }
        c();
    }
}
