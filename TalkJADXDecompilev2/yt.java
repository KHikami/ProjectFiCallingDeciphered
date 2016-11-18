package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;

final class yt extends yk implements OnKeyListener, OnItemClickListener, OnDismissListener, yn {
    final ado a;
    View b;
    private final Context c;
    private final xy d;
    private final xx e;
    private final boolean f;
    private final int g;
    private final int h;
    private final int i;
    private final OnGlobalLayoutListener j = new yu(this);
    private OnDismissListener k;
    private View l;
    private yo m;
    private ViewTreeObserver n;
    private boolean o;
    private boolean p;
    private int q;
    private int r = 0;
    private boolean s;

    public yt(Context context, xy xyVar, View view, int i, int i2, boolean z) {
        this.c = context;
        this.d = xyVar;
        this.f = z;
        this.e = new xx(xyVar, LayoutInflater.from(context), this.f);
        this.h = i;
        this.i = i2;
        Resources resources = context.getResources();
        this.g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(gwb.ar));
        this.l = view;
        this.a = new ado(this.c, null, this.h, this.i);
        xyVar.a((yn) this, context);
    }

    public void a(boolean z) {
        this.e.a(z);
    }

    public void a(int i) {
        this.r = i;
    }

    public void c() {
        if (d()) {
            this.a.c();
        }
    }

    public void a(xy xyVar) {
    }

    public boolean d() {
        return !this.o && this.a.d();
    }

    public void onDismiss() {
        this.o = true;
        this.d.close();
        if (this.n != null) {
            if (!this.n.isAlive()) {
                this.n = this.b.getViewTreeObserver();
            }
            this.n.removeGlobalOnLayoutListener(this.j);
            this.n = null;
        }
        if (this.k != null) {
            this.k.onDismiss();
        }
    }

    public void b(boolean z) {
        this.p = false;
        if (this.e != null) {
            this.e.notifyDataSetChanged();
        }
    }

    public void a(yo yoVar) {
        this.m = yoVar;
    }

    public boolean a(yv yvVar) {
        if (yvVar.hasVisibleItems()) {
            yl ylVar = new yl(this.c, yvVar, this.b, this.f, this.h, this.i);
            ylVar.a(this.m);
            ylVar.a(yk.b((xy) yvVar));
            ylVar.a(this.k);
            this.k = null;
            this.d.a(false);
            if (ylVar.a(this.a.j(), this.a.k())) {
                if (this.m != null) {
                    this.m.a(yvVar);
                }
                return true;
            }
        }
        return false;
    }

    public void a(xy xyVar, boolean z) {
        if (xyVar == this.d) {
            c();
            if (this.m != null) {
                this.m.a(xyVar, z);
            }
        }
    }

    public boolean b() {
        return false;
    }

    public void a(View view) {
        this.l = view;
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        c();
        return true;
    }

    public void a(OnDismissListener onDismissListener) {
        this.k = onDismissListener;
    }

    public ListView e() {
        return this.a.e();
    }

    public void b(int i) {
        this.a.c(i);
    }

    public void c(int i) {
        this.a.d(i);
    }

    public void c(boolean z) {
        this.s = z;
    }

    public void a() {
        boolean z = true;
        if (!d()) {
            if (this.o || this.l == null) {
                z = false;
            } else {
                this.b = this.l;
                this.a.a(this);
                this.a.a(this);
                this.a.a(true);
                View view = this.b;
                boolean z2 = this.n == null;
                this.n = view.getViewTreeObserver();
                if (z2) {
                    this.n.addOnGlobalLayoutListener(this.j);
                }
                this.a.a(view);
                this.a.e(this.r);
                if (!this.p) {
                    this.q = yk.a(this.e, null, this.c, this.g);
                    this.p = true;
                }
                this.a.g(this.q);
                this.a.h(2);
                this.a.a(g());
                this.a.a();
                ViewGroup e = this.a.e();
                e.setOnKeyListener(this);
                if (this.s && this.d.o() != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.c).inflate(gwb.bX, e, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(this.d.o());
                    }
                    frameLayout.setEnabled(false);
                    e.addHeaderView(frameLayout, null, false);
                }
                this.a.a(this.e);
                this.a.a();
            }
        }
        if (!z) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }
}
