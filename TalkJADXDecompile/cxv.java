import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import com.google.android.apps.hangouts.R$drawable;
import com.google.android.apps.hangouts.floatingactionbutton.impl.FloatingActionButton;
import com.google.android.apps.hangouts.floatingactionbutton.impl.QuickButtonContainer;
import java.util.ArrayList;
import java.util.List;

public final class cxv implements cxm {
    static final int a;
    static final int b;
    static final int c;
    static final int d;
    static final int e;
    OnClickListener A;
    volatile boolean B;
    private final cyc C;
    private int D;
    private LinearLayout E;
    private Space F;
    private float G;
    private Menu H;
    private SubMenu I;
    private int J;
    private cxn K;
    private jca L;
    private final bbm M;
    private final fzw N;
    private int O;
    private int P;
    Context f;
    FloatingActionButton g;
    View h;
    FrameLayout i;
    int j;
    int k;
    Dialog l;
    QuickButtonContainer m;
    cxl n;
    cxl o;
    eet p;
    eew q;
    eeu r;
    eev s;
    a t;
    MenuItem u;
    MenuItem v;
    MenuItem w;
    MenuItem x;
    MenuItem y;
    List<OnClickListener> z;

    static {
        a = ba.kw;
        b = ba.kx;
        c = ba.kA;
        d = ba.ky;
        e = ba.kz;
    }

    cxv(Context context) {
        this.C = new cyc(this);
        this.J = 0;
        this.z = new ArrayList();
        this.P = 0;
        this.B = false;
        this.f = context;
        this.L = (jca) jyn.a(context, jca.class);
        this.L.a(new cyb(this));
        this.M = (bbm) jyn.a(context, bbm.class);
        this.N = (fzw) jyn.a(context, fzw.class);
    }

    void h() {
        if (this.N.a(this.L.a())) {
            this.p = null;
            this.q = null;
            this.r = null;
            this.t = null;
        } else {
            bef bef;
            this.p = (eet) jyn.b(this.f, eet.class);
            this.q = (eew) jyn.b(this.f, eew.class);
            if (gwb.a(l(), bnc.GROUP_CONVERSATIONS)) {
                if (!fdq.j.b(this.L.a())) {
                    this.r = (eeu) jyn.b(this.f, eeu.class);
                    bef = (bef) jyn.b(this.f, bef.class);
                    if (bef != null) {
                        this.L.a();
                        this.t = bef.b();
                    }
                }
            }
            this.r = null;
            bef = (bef) jyn.b(this.f, bef.class);
            if (bef != null) {
                this.L.a();
                this.t = bef.b();
            }
        }
        if (this.M.d(this.L.a())) {
            this.s = (eev) jyn.b(this.f, eev.class);
        } else {
            this.s = null;
        }
    }

    public void a(dw dwVar, ViewGroup viewGroup, Menu menu) {
        int a = this.f.getResources().getDisplayMetrics().heightPixels - giw.a(this.f);
        int dimensionPixelSize = this.f.getResources().getDimensionPixelSize(gwb.pw);
        int dimensionPixelSize2 = this.f.getResources().getDimensionPixelSize(gwb.pw);
        int dimensionPixelSize3 = this.f.getResources().getDimensionPixelSize(gwb.py);
        int dimensionPixelSize4 = this.f.getResources().getDimensionPixelSize(gwb.pz);
        this.O = (((a - dimensionPixelSize) - dimensionPixelSize2) - dimensionPixelSize4) / (dimensionPixelSize3 + dimensionPixelSize4);
        if (l() == null) {
            glk.a("Babel_FAB", "Not decorating since account is not yet available", new Object[0]);
        } else if (!this.N.a(this.L.a()) || this.M.d(this.L.a())) {
            this.i = (FrameLayout) viewGroup.findViewById(ba.bn);
            LayoutInflater layoutInflater = dwVar.getLayoutInflater();
            layoutInflater.inflate(ba.kC, this.i, true);
            this.l = new Dialog(this.f, 16973833);
            Window window = this.l.getWindow();
            window.setBackgroundDrawable(new ColorDrawable(0));
            this.l.setCancelable(false);
            this.l.setOnKeyListener(new cxw(this));
            this.m = (QuickButtonContainer) layoutInflater.inflate(ba.kE, null);
            this.m.setOnClickListener(new cxx(this));
            window.setContentView(this.m);
            this.F = (Space) this.m.findViewById(gwb.pA);
            List arrayList = new ArrayList();
            h();
            arrayList.add(this.p);
            arrayList.add(this.r);
            arrayList.add(this.s);
            arrayList.add(this.q);
            arrayList.add(this.t);
            a(layoutInflater, this.m, arrayList);
            this.h = this.i.findViewById(gwb.pC);
            this.g = (FloatingActionButton) this.h.findViewById(gwb.pB);
            this.g.a(new cxt(this));
            this.D = this.g.getResources().getDimensionPixelSize(gwb.pw);
            this.j = 0;
            Display defaultDisplay = ((WindowManager) this.g.getContext().getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            a = point.x;
            this.k = ((a - this.D) / 2) - this.g.getResources().getDimensionPixelSize(gwb.pv);
            a(this.G, false);
            this.g.a(this.m.a());
            this.g.a(this.m.b());
            if (menu != null && gld.a(this.f)) {
                this.H = menu;
                this.I = this.H.addSubMenu(0, ba.eD, 0, gwb.pN);
                this.I.setIcon(R$drawable.bI);
                gwb.a(this.I.getItem(), 2);
                h();
                if (this.p != null) {
                    this.u = this.I.add(this.p.B());
                    this.u.setOnMenuItemClickListener(this.C);
                }
                if (this.q != null) {
                    this.w = this.I.add(this.q.B());
                    this.w.setOnMenuItemClickListener(this.C);
                }
                if (this.r != null) {
                    this.v = this.I.add(this.r.B());
                    this.v.setOnMenuItemClickListener(this.C);
                }
                if (this.s != null) {
                    this.x = this.I.add(this.s.B());
                    this.x.setOnMenuItemClickListener(this.C);
                }
                if (this.t != null) {
                    this.y = this.I.add(this.t.B());
                    this.y.setOnMenuItemClickListener(this.C);
                }
            }
        } else {
            glk.a("Babel_FAB", "Not decorating since account is carrier sms on account but hangouts is not the sms app", new Object[0]);
        }
    }

    static int b(int i) {
        if (i == a || i == b || i == c) {
            return gwb.pN;
        }
        if (i == d) {
            return gwb.pM;
        }
        if (i == e) {
            return gwb.pO;
        }
        iil.a("Content description is not ready for drawable ID: " + i);
        return 0;
    }

    public void a(float f, boolean z) {
        this.G = f;
        if (this.i != null) {
            if (z) {
                this.i.animate().translationY(-1.0f * f);
            } else {
                this.i.setY(-1.0f * f);
            }
        }
        if (this.F == null) {
            return;
        }
        if (z && this.l.isShowing()) {
            this.F.startAnimation(new gke(this.F, (int) f));
            return;
        }
        LayoutParams layoutParams = this.F.getLayoutParams();
        layoutParams.height = (int) f;
        this.F.setLayoutParams(layoutParams);
    }

    public void a() {
        b(false);
        if (this.i != null) {
            this.i.removeAllViews();
            this.i = null;
        }
        if (this.m != null) {
            this.m.removeAllViews();
            this.m = null;
        }
        this.l = null;
        this.g = null;
        this.F = null;
        if (this.I != null) {
            this.I.clear();
            this.H.removeItem(this.I.getItem().getItemId());
        }
        this.H = null;
        this.I = null;
        this.u = null;
        this.v = null;
        this.w = null;
        this.x = null;
    }

    private void a(LayoutInflater layoutInflater, ViewGroup viewGroup, List<cxl> list) {
        this.E = (LinearLayout) this.m.findViewById(gwb.pF);
        this.P = 0;
        boolean z = false;
        for (cxl cxl : list) {
            boolean z2;
            boolean z3;
            if (cxl != null) {
                View inflate;
                if (z) {
                    inflate = layoutInflater.inflate(ba.kD, this.m, false);
                    this.E.addView(inflate, 0);
                    this.P++;
                    z2 = z;
                } else {
                    View findViewById = viewGroup.findViewById(gwb.pD);
                    this.o = cxl;
                    z2 = true;
                    inflate = findViewById;
                }
                OnClickListener cxy = new cxy(this, cxl);
                ((TextView) inflate.findViewById(gwb.pG)).setText(cxl.B());
                ImageView imageView = (ImageView) inflate.findViewById(gwb.pE);
                if (imageView != null) {
                    imageView.setImageResource(cxl.C());
                }
                inflate.setOnClickListener(cxy);
                z3 = z2;
            } else {
                z3 = z;
            }
            if (this.P == this.O) {
                break;
            }
            z = z3;
        }
        if (this.o == null) {
            int a = this.L.a();
            int g = l().g();
            z2 = this.N.a(a);
            glk.e("Babel_FAB", "primaryAction == null; account_id: " + g + " carrier_sms_only: " + z2 + " sms: " + this.M.d(a), new Object[0]);
        }
        iil.b("Primary action must be set at this point", this.o);
    }

    public int i() {
        if (this.K == null || this.K.a() != 1) {
            return d;
        }
        return e;
    }

    public pc b() {
        return new cxz(this);
    }

    void a(float f) {
        ((ViewGroup) this.g.getParent()).setTranslationX(-f);
    }

    void b(float f) {
        if (gld.a(this.g)) {
            ((ViewGroup) this.g.getParent()).setTranslationX(f);
        } else {
            ((ViewGroup) this.g.getParent()).setTranslationX(-f);
        }
    }

    public void a(int i) {
        this.J = i;
        if (this.g != null) {
            if (VERSION.SDK_INT >= 17) {
                b(i == 1 ? (float) this.k : (float) this.j);
            } else {
                a(i == 1 ? (float) this.k : (float) this.j);
            }
            if (i == 1) {
                this.h.setVisibility(0);
                int i2 = i();
                this.g.a(i2, b(i2));
            } else if (gld.a(this.f)) {
                this.h.setVisibility(4);
            } else {
                this.g.a(a, b(a));
            }
        }
    }

    public void a(OnClickListener onClickListener) {
        this.z.add(onClickListener);
    }

    public void b(OnClickListener onClickListener) {
        this.z.remove(onClickListener);
    }

    public void c(OnClickListener onClickListener) {
        this.A = onClickListener;
    }

    public void a(cxn cxn) {
        this.K = cxn;
    }

    public void c() {
        if (this.J == 1) {
            this.g.a(e, b(e), cxu.a);
        }
    }

    public void d() {
        if (this.J == 1) {
            this.g.a(e, b(e));
        }
    }

    public void e() {
        if (this.J == 1) {
            this.g.a(d, b(d), cxu.b);
        }
    }

    public void f() {
        this.g.callOnClick();
    }

    public boolean g() {
        if (this.m == null || this.l == null || !this.l.isShowing()) {
            return false;
        }
        b(false);
        return true;
    }

    static boolean j() {
        return VERSION.SDK_INT >= 19;
    }

    void b(boolean z) {
        if (this.g != null) {
            this.g.a(a, b(a), cxu.b);
        }
        if (z && j()) {
            a(new cyj(1.0f, 0.0f));
            a(255, 0);
            Handler handler = new Handler();
            this.B = true;
            handler.postDelayed(new cya(this), (long) this.f.getResources().getInteger(gwb.pL));
            return;
        }
        k();
    }

    void k() {
        if (this.l != null && this.l.isShowing()) {
            this.l.dismiss();
            this.n = null;
        }
        if (this.i != null) {
            this.i.setBackgroundResource(0);
        }
    }

    void a(cxp cxp) {
        if (this.E != null) {
            int i = this.P;
            int integer = this.f.getResources().getInteger(gwb.pK);
            int i2 = 0;
            int i3 = i;
            while (i2 < this.P) {
                View childAt = this.E.getChildAt(i2);
                TextView textView = (TextView) childAt.findViewById(gwb.pG);
                ImageView imageView = (ImageView) childAt.findViewById(gwb.pE);
                long j = (long) (i3 * integer);
                textView.startAnimation(cxp.a(this.f, j));
                if (imageView != null) {
                    imageView.startAnimation(cxp.a(this.f, j));
                }
                i2++;
                i3--;
            }
            ((TextView) this.E.findViewById(gwb.pD).findViewById(gwb.pG)).startAnimation(cxp.a(this.f, 0));
        }
    }

    void a(int i, int i2) {
        if (this.i != null) {
            int integer = this.f.getResources().getInteger(gwb.pH);
            Drawable background = this.i.getBackground();
            PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[1];
            propertyValuesHolderArr[0] = PropertyValuesHolder.ofInt("alpha", new int[]{i, i2});
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(background, propertyValuesHolderArr);
            ofPropertyValuesHolder.setDuration((long) integer);
            ofPropertyValuesHolder.setInterpolator(new rk());
            ofPropertyValuesHolder.start();
        }
    }

    public void a(boolean z) {
        if (this.i != null) {
            this.i.setVisibility(z ? 0 : 4);
        }
    }

    bko l() {
        return fde.e(this.L.a());
    }
}
