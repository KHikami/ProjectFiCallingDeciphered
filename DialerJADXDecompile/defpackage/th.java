package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow.OnDismissListener;

/* compiled from: PG */
/* renamed from: th */
public class th {
    public View a;
    public int b;
    OnDismissListener c;
    private final Context d;
    private final su e;
    private final boolean f;
    private final int g;
    private final int h;
    private boolean i;
    private tk j;
    private tg k;
    private final OnDismissListener l;

    public th(Context context, su suVar, View view, boolean z, int i) {
        this(context, suVar, view, z, i, 0);
    }

    public th(Context context, su suVar, View view, boolean z, int i, int i2) {
        this.b = 8388611;
        this.l = new ti(this);
        this.d = context;
        this.e = suVar;
        this.a = view;
        this.f = z;
        this.g = i;
        this.h = i2;
    }

    public final void a(boolean z) {
        this.i = z;
        if (this.k != null) {
            this.k.a(z);
        }
    }

    public final tg a() {
        if (this.k == null) {
            tg smVar;
            Display defaultDisplay = ((WindowManager) this.d.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            if (VERSION.SDK_INT >= 17) {
                defaultDisplay.getRealSize(point);
            } else if (VERSION.SDK_INT >= 13) {
                defaultDisplay.getSize(point);
            } else {
                point.set(defaultDisplay.getWidth(), defaultDisplay.getHeight());
            }
            if ((Math.min(point.x, point.y) >= this.d.getResources().getDimensionPixelSize(buf.am) ? 1 : null) != null) {
                smVar = new sm(this.d, this.a, this.g, this.h, this.f);
            } else {
                smVar = new tp(this.d, this.e, this.a, this.g, this.h, this.f);
            }
            smVar.a(this.e);
            smVar.a(this.l);
            smVar.a(this.a);
            smVar.a(this.j);
            smVar.a(this.i);
            smVar.a(this.b);
            this.k = smVar;
        }
        return this.k;
    }

    public final boolean b() {
        if (e()) {
            return true;
        }
        if (this.a == null) {
            return false;
        }
        a(0, 0, false, false);
        return true;
    }

    final void a(int i, int i2, boolean z, boolean z2) {
        tg a = a();
        a.c(z2);
        if (z) {
            if ((iy.a(this.b, kn.f(this.a)) & 7) == 5) {
                i -= this.a.getWidth();
            }
            a.b(i);
            a.c(i2);
            int i3 = (int) ((this.d.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a.e = new Rect(i - i3, i2 - i3, i + i3, i3 + i2);
        }
        a.b();
    }

    public final void c() {
        if (e()) {
            this.k.c();
        }
    }

    public void d() {
        this.k = null;
        if (this.c != null) {
            this.c.onDismiss();
        }
    }

    public final boolean e() {
        return this.k != null && this.k.d();
    }

    public final void a(tk tkVar) {
        this.j = tkVar;
        if (this.k != null) {
            this.k.a(tkVar);
        }
    }
}
