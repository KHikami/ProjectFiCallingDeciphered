package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow.OnDismissListener;

public class yl {
    private final Context a;
    private final xy b;
    private final boolean c;
    private final int d;
    private final int e;
    private View f;
    private int g;
    private boolean h;
    private yo i;
    private yk j;
    private OnDismissListener k;
    private final OnDismissListener l;

    public yl(Context context, xy xyVar, View view, boolean z, int i) {
        this(context, xyVar, view, z, i, 0);
    }

    public yl(Context context, xy xyVar, View view, boolean z, int i, int i2) {
        this.g = 8388611;
        this.l = new ym(this);
        this.a = context;
        this.b = xyVar;
        this.f = view;
        this.c = z;
        this.d = i;
        this.e = i2;
    }

    public void a(OnDismissListener onDismissListener) {
        this.k = onDismissListener;
    }

    public void a(View view) {
        this.f = view;
    }

    public void a(boolean z) {
        this.h = z;
        if (this.j != null) {
            this.j.a(z);
        }
    }

    public void a(int i) {
        this.g = 8388613;
    }

    public void a() {
        if (!c()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public yk b() {
        if (this.j == null) {
            yk xqVar;
            Display defaultDisplay = ((WindowManager) this.a.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            if (VERSION.SDK_INT >= 17) {
                defaultDisplay.getRealSize(point);
            } else if (VERSION.SDK_INT >= 13) {
                defaultDisplay.getSize(point);
            } else {
                point.set(defaultDisplay.getWidth(), defaultDisplay.getHeight());
            }
            if ((Math.min(point.x, point.y) >= this.a.getResources().getDimensionPixelSize(gwb.aq) ? 1 : null) != null) {
                xqVar = new xq(this.a, this.f, this.d, this.e, this.c);
            } else {
                xqVar = new yt(this.a, this.b, this.f, this.d, this.e, this.c);
            }
            xqVar.a(this.b);
            xqVar.a(this.l);
            xqVar.a(this.f);
            xqVar.a(this.i);
            xqVar.a(this.h);
            xqVar.a(this.g);
            this.j = xqVar;
        }
        return this.j;
    }

    public boolean c() {
        if (f()) {
            return true;
        }
        if (this.f == null) {
            return false;
        }
        a(0, 0, false, false);
        return true;
    }

    public boolean a(int i, int i2) {
        if (f()) {
            return true;
        }
        if (this.f == null) {
            return false;
        }
        a(i, i2, true, true);
        return true;
    }

    private void a(int i, int i2, boolean z, boolean z2) {
        yk b = b();
        b.c(z2);
        if (z) {
            if ((mj.a(this.g, oa.d(this.f)) & 7) == 5) {
                i -= this.f.getWidth();
            }
            b.b(i);
            b.c(i2);
            int i3 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            b.a(new Rect(i - i3, i2 - i3, i + i3, i3 + i2));
        }
        b.a();
    }

    public void d() {
        if (f()) {
            this.j.c();
        }
    }

    public void e() {
        this.j = null;
        if (this.k != null) {
            this.k.onDismiss();
        }
    }

    public boolean f() {
        return this.j != null && this.j.d();
    }

    public void a(yo yoVar) {
        this.i = yoVar;
        if (this.j != null) {
            this.j.a(yoVar);
        }
    }
}
