package p000;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

final class cgg implements OnGlobalLayoutListener, kcj, kcm, kcq {
    final /* synthetic */ cdr f5242a;
    private final Rect f5243b = new Rect();
    private final View f5244c;
    private Boolean f5245d = null;

    cgg(cdr cdr, View view) {
        this.f5242a = cdr;
        this.f5244c = view;
        cdr.lifecycle.m25514a((kcq) this);
    }

    public void R_() {
        this.f5244c.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    public void T_() {
        gwb.m1797a(this.f5244c, (OnGlobalLayoutListener) this);
    }

    public void onGlobalLayout() {
        int b;
        this.f5244c.getWindowVisibleDisplayFrame(this.f5243b);
        int height = (this.f5244c.getRootView().getHeight() - this.f5243b.height()) - giw.m17749a(this.f5242a.context);
        if (VERSION.SDK_INT >= 21) {
            b = height - giw.m17755b(this.f5242a.context);
        } else {
            b = height;
        }
        boolean z = b > 250;
        if (z) {
            this.f5242a.aW.mo812a(b);
        }
        if (this.f5242a.f5106i.mo940b().m4834a() == 1 && !z && this.f5245d == null) {
            gwb.m2379w(this.f5242a.getView());
        }
        if ((this.f5245d == null || gwb.m2061b(this.f5245d) != z) && z) {
            this.f5242a.aW.mo813b();
        }
        this.f5245d = Boolean.valueOf(z);
    }
}
