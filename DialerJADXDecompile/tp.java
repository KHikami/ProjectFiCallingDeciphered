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

/* compiled from: PG */
final class tp extends tg implements OnKeyListener, OnItemClickListener, OnDismissListener, tj {
    final yi a;
    View b;
    private final Context c;
    private final su d;
    private final st f;
    private final boolean g;
    private final int h;
    private final int i;
    private final int j;
    private final OnGlobalLayoutListener k;
    private OnDismissListener l;
    private View m;
    private tk n;
    private ViewTreeObserver o;
    private boolean p;
    private boolean q;
    private int r;
    private int s;
    private boolean t;

    public tp(Context context, su suVar, View view, int i, int i2, boolean z) {
        this.k = new tq(this);
        this.s = 0;
        this.c = context;
        this.d = suVar;
        this.g = z;
        this.f = new st(suVar, LayoutInflater.from(context), this.g);
        this.i = i;
        this.j = i2;
        Resources resources = context.getResources();
        this.h = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(buf.an));
        this.m = view;
        this.a = new yi(this.c, null, this.i, this.j);
        suVar.a((tj) this, context);
    }

    public final void a(boolean z) {
        this.f.b = z;
    }

    public final void a(int i) {
        this.s = i;
    }

    public final void b() {
        boolean z = true;
        if (!d()) {
            if (this.p || this.m == null) {
                z = false;
            } else {
                this.b = this.m;
                this.a.a((OnDismissListener) this);
                this.a.l = this;
                this.a.a(true);
                View view = this.b;
                boolean z2 = this.o == null;
                this.o = view.getViewTreeObserver();
                if (z2) {
                    this.o.addOnGlobalLayoutListener(this.k);
                }
                this.a.k = view;
                this.a.h = this.s;
                if (!this.q) {
                    this.r = tg.a(this.f, null, this.c, this.h);
                    this.q = true;
                }
                this.a.b(this.r);
                this.a.c(2);
                this.a.o = this.e;
                this.a.b();
                ViewGroup viewGroup = this.a.e;
                viewGroup.setOnKeyListener(this);
                if (this.t && this.d.f != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.c).inflate(buf.bU, viewGroup, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(this.d.f);
                    }
                    frameLayout.setEnabled(false);
                    viewGroup.addHeaderView(frameLayout, null, false);
                }
                this.a.a(this.f);
                this.a.b();
            }
        }
        if (!z) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    public final void c() {
        if (d()) {
            this.a.c();
        }
    }

    public final void a(su suVar) {
    }

    public final boolean d() {
        return !this.p && this.a.q.isShowing();
    }

    public final void onDismiss() {
        this.p = true;
        this.d.close();
        if (this.o != null) {
            if (!this.o.isAlive()) {
                this.o = this.b.getViewTreeObserver();
            }
            this.o.removeGlobalOnLayoutListener(this.k);
            this.o = null;
        }
        if (this.l != null) {
            this.l.onDismiss();
        }
    }

    public final void b(boolean z) {
        this.q = false;
        if (this.f != null) {
            this.f.notifyDataSetChanged();
        }
    }

    public final void a(tk tkVar) {
        this.n = tkVar;
    }

    public final boolean a(tr trVar) {
        if (trVar.hasVisibleItems()) {
            boolean z;
            th thVar = new th(this.c, trVar, this.b, this.g, this.i, this.j);
            thVar.a(this.n);
            thVar.a(tg.b((su) trVar));
            thVar.c = this.l;
            this.l = null;
            this.d.a(false);
            int i = this.a.g;
            int f = this.a.f();
            if (thVar.e()) {
                z = true;
            } else if (thVar.a == null) {
                z = false;
            } else {
                thVar.a(i, f, true, true);
                z = true;
            }
            if (z) {
                if (this.n != null) {
                    this.n.a(trVar);
                }
                return true;
            }
        }
        return false;
    }

    public final void a(su suVar, boolean z) {
        if (suVar == this.d) {
            c();
            if (this.n != null) {
                this.n.a(suVar, z);
            }
        }
    }

    public final boolean a() {
        return false;
    }

    public final void a(View view) {
        this.m = view;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        c();
        return true;
    }

    public final void a(OnDismissListener onDismissListener) {
        this.l = onDismissListener;
    }

    public final ListView e() {
        return this.a.e;
    }

    public final void b(int i) {
        this.a.g = i;
    }

    public final void c(int i) {
        this.a.a(i);
    }

    public final void c(boolean z) {
        this.t = z;
    }
}
