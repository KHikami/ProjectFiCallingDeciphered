package defpackage;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* renamed from: cgg */
final class cgg implements OnGlobalLayoutListener, kcj, kcm, kcq {
    final /* synthetic */ cdr a;
    private final Rect b;
    private final View c;
    private Boolean d;

    cgg(cdr cdr, View view) {
        this.a = cdr;
        this.b = new Rect();
        this.d = null;
        this.c = view;
        cdr.lifecycle.a((kcq) this);
    }

    public void R_() {
        this.c.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    public void T_() {
        gwb.a(this.c, (OnGlobalLayoutListener) this);
    }

    public void onGlobalLayout() {
        int b;
        this.c.getWindowVisibleDisplayFrame(this.b);
        int height = (this.c.getRootView().getHeight() - this.b.height()) - giw.a(this.a.context);
        if (VERSION.SDK_INT >= 21) {
            b = height - giw.b(this.a.context);
        } else {
            b = height;
        }
        boolean z = b > 250;
        if (z) {
            this.a.aW.a(b);
        }
        if (this.a.i.b().a() == 1 && !z && this.d == null) {
            gwb.w(this.a.getView());
        }
        if ((this.d == null || gwb.b(this.d) != z) && z) {
            this.a.aW.b();
        }
        this.d = Boolean.valueOf(z);
    }
}
